import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyFirstTest {

    public WebDriver setdriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver ;
    }
public void dropDriver(){
    setdriver().quit();
}
    @Test
    public void myFirstTest() throws InterruptedException {
        //call method to initiate browser, check method above
        WebDriver driver =  setdriver();
        // path to the element
        By userName = By.cssSelector("#login-username");
        By password = By.cssSelector("#login-password");
        //full screen
        driver.manage().window().maximize();
        //open site
        driver.get("https://www.spotify.com/ua/");
        //wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // find element
        WebElement logIn = driver.findElement(By.linkText("Log in"));
        //click login
        logIn.click();
        //wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //set data to fields
        driver.findElement(userName).sendKeys("wavok64672@insertswork.com");
        driver.findElement(password).sendKeys("qse12345");
        // enter
        driver.findElement(password).sendKeys(Keys.ENTER);
        Thread.sleep(5*1000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.spotify.com/ua/account/overview/");
        dropDriver();
    }
}
