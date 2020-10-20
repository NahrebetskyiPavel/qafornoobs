import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PremimumPage {

    public PremimumPage buyIndividualSubscribe(WebDriver driver) {
        driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
        driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
        driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
        driver.findElements(By.cssSelector("a")).get(3).click();
        return this;
    }
}
