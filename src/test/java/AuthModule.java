import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;


public class AuthModule {
    @Test
     public void registerUser(){
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahul.tech/");
        WebElement mailid=driver.findElement(By.id("mail"));
        mailid.sendKeys("sri@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        mailid.sendKeys("sri");
        String expectedurl="https:registerpage/";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String currenturl=driver.getCurrentUrl();
        if(currenturl.equals(expectedurl)){
            System.out.println("successfully registered");
        } else {
            System.out.println("registration failed");
        }
        driver.quit();
    }
    @Test

    public void authenticateUser(){
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahul.tech/");
        WebElement mailid=driver.findElement(By.id("mail"));
        mailid.sendKeys("pravi@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("srii");
        String expectedurl="https:registerpage/";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String currenturl=driver.getCurrentUrl();
        Assert.assertEquals(currenturl,expectedurl," Incorrect username and password");

        WebElement mailid1=driver.findElement(By.id("mail"));
        mailid1.sendKeys("sri@gmail.com");
        WebElement password1=driver.findElement(By.id("password"));
        password1.sendKeys("srii");
        String expectedurls="https:registerpage/";
        WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String currenturls=driver.getCurrentUrl();
        Assert.assertEquals(currenturls,expectedurls,"password didn't match");

        WebElement mailid2=driver.findElement(By.id("mail"));
        mailid2.sendKeys("srii@gmail.com");
        WebElement password2=driver.findElement(By.id("password"));
        password2.sendKeys("sri");
        String expectedurlss="https:registerpage/";
        WebDriverWait waitss=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String currenturlss=driver.getCurrentUrl();
        Assert.assertEquals(currenturlss,expectedurlss,"mail didn't match");

        WebElement mail=driver.findElement(By.id("mail"));

        WebElement passwordsss=driver.findElement(By.id("password"));

        String expected="https:registerpage/";
        WebDriverWait waited=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String current=driver.getCurrentUrl();
        Assert.assertEquals(current,expected,"empty Strigs");
        driver.quit();
    }


}
