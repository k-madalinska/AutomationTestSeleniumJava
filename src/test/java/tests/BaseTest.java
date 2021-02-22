package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;
    protected static final String BASE_URL = "http://automationpractice.com/index.php";

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }


    @AfterEach
    public void teardown() {
        if (driver != null) {
         //   driver.quit();
        }
    }
}
