import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void myFirstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/ua/");
        Thread.sleep(5*1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.spotify.com/ua/");
        driver.quit();

    }

}
