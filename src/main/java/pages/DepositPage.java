package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage {
    private WebDriver driver;
    private By accountTxt = By.name("accountno");
    private By amountTxt = By.name("ammount");

    private By descriptionTxt = By.name("desc");
    private By submit = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]");

    public DepositPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setAccount(String accountNo) {
        driver.findElement(accountTxt).sendKeys(accountNo);
    }

    public void setAmount(String amount) {
        driver.findElement(amountTxt).sendKeys(amount);
    }

    public void setDescription(String description) {
        driver.findElement(descriptionTxt).sendKeys(description);
    }

    public SecureAreaPage clickSubmitButton() {
        driver.findElement(submit).click();
        return new SecureAreaPage(driver);
    }
}
