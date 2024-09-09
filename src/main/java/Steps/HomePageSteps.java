package Steps;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSteps {

    private WebDriverWait wait;
    private WebDriver driver;
    private final HomePage.PaymentSection paymentSection = new HomePage.PaymentSection();

    public void clickDropdownButton() {
        paymentSection.getDropdownButton().click();
    }

    public void selectPaymentType(String paymentType) {
        paymentSection.getPaymentType(paymentType).click();
    }

    public void fillSpecialField(String paymentType, String text) {
        paymentSection.getSpecialField(paymentType).sendKeys(text);
    }

    public void fillSumField(String sumAmount) {
        paymentSection.getSumField().sendKeys(sumAmount);
    }

    public void fillEmailField(String email) {
        paymentSection.getEmailField().sendKeys(email);
    }

    public void fillPaymentSection() {
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));

        phoneInput.sendKeys("297777777");
        sumInput.sendKeys("65");
    }
}