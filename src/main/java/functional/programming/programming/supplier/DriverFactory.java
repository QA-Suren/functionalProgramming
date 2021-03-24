package functional.programming.programming.supplier;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver> chromeSupplier = () -> {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    private static final Map<String, Supplier<WebDriver>> DRIVERS = new HashMap<>();

    static {
        DRIVERS.put("chrome", chromeSupplier);
        DRIVERS.put("firefox", firefoxSupplier);
    }

    public static WebDriver getDriver(String browser) {
        return DRIVERS.get(browser).get();
    }
}
