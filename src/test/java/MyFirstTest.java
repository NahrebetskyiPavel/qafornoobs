import org.testng.annotations.Test;

public class MyFirstTest extends Runner  {

    @Test
    public void MyFirstTest() throws InterruptedException {

        new MainPage()
                .open(driver)
                .goToPremiumPage(driver)
                .buyIndividualSubscribe(driver);
        Thread.sleep(10*1000);


    }

}
