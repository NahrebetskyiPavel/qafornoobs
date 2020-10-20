import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class MainPage {


     MainPage  open(WebDriver driver) {
        driver.get("https://www.spotify.com/uk");
        return this;
    }

      PremimumPage  goToPremiumPage(WebDriver driver ) {
        driver.findElement(By.cssSelector("nav>ul>li>a[data-ga-category='menu']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new  PremimumPage();
    }

}
