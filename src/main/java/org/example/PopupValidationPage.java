package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupValidationPage {
    private final WebDriver driver;

    private final By cardNumberFieldPlaceholder = By.id("cc-number");
    private final By expiryDateFieldPlaceholder = By.id("expirationDate");
    private final By cvcFieldPlaceholder = By.id("cvcFieldId");
    private final By cardHolderFieldPlaceholder = By.id("cardHolderFieldId");

    public PopupValidationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCardNumberFieldPlaceholder() {
        WebElement placeholderElement = driver.findElement(cardNumberFieldPlaceholder);
        return placeholderElement.getAttribute("placeholder1");
    }

    public String getExpiryDateFieldPlaceholder() {
        WebElement placeholderElement = driver.findElement(expiryDateFieldPlaceholder);
        return placeholderElement.getAttribute("placeholder2");
    }

    public String getCvcFieldPlaceholder() {
        WebElement placeholderElement = driver.findElement(cvcFieldPlaceholder);
        return placeholderElement.getAttribute("placeholder3");
    }

    public String getCardHolderFieldPlaceholder() {
        WebElement placeholderElement = driver.findElement(cardHolderFieldPlaceholder);
        return placeholderElement.getAttribute("placeholder4");
    }
}