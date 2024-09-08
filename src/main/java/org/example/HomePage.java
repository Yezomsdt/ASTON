package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;
    private final By acceptCookiesButton = By.xpath("//button[contains(text(), 'Принять')]");
    private final By onlineTopUpLink = By.xpath("//h2[contains(text(), 'Онлайн пополнение')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        try {
            WebElement button = driver.findElement(acceptCookiesButton);
            button.click();
        } catch (Exception ignored) {
        }
    }

    public OnlineTopUpPage navigateToOnlineTopUp() {
        WebElement block = driver.findElement(onlineTopUpLink);
        block.click();
        return new OnlineTopUpPage(driver);
    }
}