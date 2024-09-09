import Steps.HomePageSteps;
import Pages.HomePage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageTest {

    private HomePage homePage;
    private HomePageSteps steps;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.get("https://mts.by");
    }

    @Test
    public void testOnlineReplenishment() {
        homePage.acceptCookies();
        homePage.openOnlineReplenishment();
        steps.clickDropdownButton();
        steps.fillPaymentSection();
    }
}