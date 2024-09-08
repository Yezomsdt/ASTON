package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineTopUpPage {
    private final WebDriver driver;
    private final By phoneField = By.id("connection-phone");
    private final By sumField = By.id("connection-sum");
    private final By continueButton = By.xpath("//button[contains(text(), 'Продолжить')]");

    public OnlineTopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPhoneAndSum(String phone, String sum) {
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(sumField).sendKeys(sum);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
}