package functional.programming.driver;

import functional.programming.programming.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class DriverTest {
    private WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setDriver(@Optional("chrome")String browser){
        driver = DriverFactory.getDriver("chrome");
    }

    @Test
    public void someTest(){
        driver.get("https://www.google.com/");
    }

    @AfterClass
    public void quit(){
        if(driver != null)
            driver.quit();
    }
}
