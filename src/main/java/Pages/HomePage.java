package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private WebDriver driver;
    private final By acceptCookiesButton = By.id("cookie-agree");
    private final By onlineReplenishmentSection = By.xpath("//h2[contains(text(), 'Онлайн пополнение')]");

    public void acceptCookies() {
        try {
            WebElement CookiesButton = driver.findElement(acceptCookiesButton);
            CookiesButton.click();
        } catch (Exception ignored) {
        }
    }

    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }

    public void openOnlineReplenishment() {
        WebElement section = driver.findElement(onlineReplenishmentSection);
        section.click();
    }

    public static class PaymentSection {
        private final By paymentTypes = By.xpath("//div[@class='select']//ul[@class='select__list']/li/p");
        private final By dropdownButton = By.xpath("//div[@class='select']");
        private final By sumField = By.xpath("//form[@class='pay-form opened']//input[@placeholder='Сумма']");
        private final By emailField = By.xpath("//form[@class='pay-form opened']//input[@placeholder='E-mail для отправки чека']");

        public WebElement getDropdownButton() {
            return driver.findElement(dropdownButton);
        }

        public WebElement getPaymentType(String paymentType) {
            WebElement elementType = null;
            List<WebElement> types = driver.findElements(paymentTypes);
            for (WebElement element: types) {
                if(element.getText().equals(paymentType)) {
                    elementType = element;
                }
            }
            return elementType;
        }

        public WebElement getSpecialField(String paymentType) {
            String specialFieldPattern = "//form[@class='pay-form opened']//input[@id='%s']";
            String specialFieldName = getSpecialFieldId(paymentType);
            By specialField = By.xpath(String.format(specialFieldPattern, specialFieldName));
            return driver.findElement(specialField);
        }

        private String getSpecialFieldId(String paymentType) {
            return switch (paymentType) {
                case "Услуги связи" -> "connection-phone";
                case "Домашний интернет" -> "internet-phone";
                case "Рассрочка" -> "score-instalment";
                case "Задолженность" -> "score-arrears";
                default -> throw new IllegalStateException("Unexpected value: " + paymentType);
            };
        }

        public WebElement getSumField() {
            return driver.findElement(sumField);
        }

        public WebElement getEmailField() {
            return driver.findElement(emailField);
        }
    }
}
