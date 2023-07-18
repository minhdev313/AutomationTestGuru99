package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

    private WebDriver driver;

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    private By customerTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
    private By genderMaleTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
    private By genderFeMaleTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
    private By dateTxt = By.xpath("//*[@id=\"dob\"]");
    private By addressTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
    private By cityTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
    private By stateTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
    private By PINTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
    private By phoneTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
    private By emailTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
    private By passwordTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
    private By submit = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");

    private By newCustomerButton = By.xpath("/html/body/div[3]/div/ul/li[2]/a");



    public void setCustomerTxt(String customer) {
        driver.findElement(customerTxt).sendKeys(customer);
    }

    public void setGenderMaleTxt() {
        driver.findElement(genderMaleTxt).click();
    }

    public void setGenderFeMaleTxt() {
        driver.findElement(genderFeMaleTxt).click();
    }

    public void setDateTxt(String date) {
        driver.findElement(dateTxt).sendKeys(date);
    }

    public void setAddressTxt(String address) {
        driver.findElement(addressTxt).sendKeys(address);
    }

    public void setCityTxt(String city) {
        driver.findElement(cityTxt).sendKeys(city);
    }

    public void setStateTxt(String state) {
        driver.findElement(stateTxt).sendKeys(state);
    }

    public void setPINTxt(String pin) {
        driver.findElement(PINTxt).sendKeys(pin);
    }

    public void setPhoneTxt(String phone) {
        driver.findElement(phoneTxt).sendKeys(phone);
    }

    public void setEmailTxt(String email){
        driver.findElement(emailTxt).sendKeys(email);
    }
    public void setPasswordTxt(String password){
        driver.findElement(passwordTxt).sendKeys(password);
    }

    public SecureAreaPage clickSubmitButton() {
        driver.findElement(submit).click();
        return new SecureAreaPage(driver);
    }

    public SecureAreaPage clickTabNewCustomer() {
        driver.findElement(newCustomerButton).click();
        return new SecureAreaPage(driver);
    }

}
