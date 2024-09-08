import org.example.HomePage;
import org.example.OnlineTopUpPage;
import org.example.PopupValidationPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class autoTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://mts.by");
        driver.manage().window().maximize();
    }

    @Test
    public void testOnlineTopUp() {
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();

        OnlineTopUpPage onlineTopUpPage = homePage.navigateToOnlineTopUp();
        onlineTopUpPage.enterPhoneAndSum("297777777", "450");
        onlineTopUpPage.clickContinue();

        PopupValidationPage popupValidationPage = new PopupValidationPage(driver);

        assertEquals("Номер карты", popupValidationPage.getCardNumberFieldPlaceholder());
        assertEquals("Срок действия", popupValidationPage.getExpiryDateFieldPlaceholder());
        assertEquals("CVC", popupValidationPage.getCvcFieldPlaceholder());
        assertEquals("Имя держателя (как на карте)", popupValidationPage.getCardHolderFieldPlaceholder());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}