package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class autoTest2 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://mts.by");
        driver.manage().window().maximize();
    }

    @Test
    public void testOnlineTopUp() {
        try {
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Принять')]")));
            acceptCookiesButton.click();
        } catch (Exception ignored) {
        }

        WebElement onlineTopUpBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]")));
        assertTrue(onlineTopUpBlock.isDisplayed());

        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreInfoLink.click();
        wait.until(ExpectedConditions.titleContains("Порядок оплаты и безопасность интернет платежей"));
        driver.navigate().back();
        try {
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Принять')]")));
            acceptCookiesButton.click();
        } catch (Exception ignored) {
        }

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));

        phoneInput.sendKeys("297777777");
        sumInput.sendKeys("450");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();
    }
    
    @After
    public void tearDown () {
        if (driver != null) {
            driver.quit();
        }
    }
}
