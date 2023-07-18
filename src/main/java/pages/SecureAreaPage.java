package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    public String getAlert() {
        Alert alert = driver.switchTo().alert();
        String alertTXT = alert.getText();
        System.out.println(alertTXT);
        alert.accept();
        return alertTXT;
    }
    public void close(){
        driver.close();
    }

    public void back(){
        driver.navigate().back();
    }

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    //DepositAccount
    private By messageAcount = By.xpath("//*[@id=\"message2\"]");
    private By messageAmount = By.xpath("//*[@id=\"message1\"]");
    private By messageDescription = By.xpath("//*[@id=\"message17\"]");

    public String getmessageAcount() {
        return driver.findElement(messageAcount).getText();
    }

    public String getmessageAmount() {
        return driver.findElement(messageAmount).getText();
    }

    public String getmessageDescription() {
        return driver.findElement(messageDescription).getText();
    }

    //NewCustomer
    private By messageCustomer = By.xpath("//*[@id=\"message\"]");
    private By messageDate = By.xpath("//*[@id=\"message24\"]");
    private By messageAddress = By.xpath("//*[@id=\"message3\"]");
    private By messageCity = By.xpath("//*[@id=\"message4\"]");
    private By messageState = By.xpath("//*[@id=\"message5\"]");
    private By messagePIN = By.xpath("//*[@id=\"message6\"]");
    private By messagePhone = By.xpath("//*[@id=\"message7\"]");
    private By messageEmail = By.xpath("//*[@id=\"message9\"]");
    private By messagePassword = By.xpath("//*[@id=\"message18\"]");

    private By messageSuccess = By.xpath("//*[@id=\"customer\"]/tbody/tr[1]/td/p");

    public String getMessageSuccess() {
        return driver.findElement(messageSuccess).getText();
    }

    public String getMessageCustomer() {
        return driver.findElement(messageCustomer).getText();
    }

    public String getMessageDate() {
        return driver.findElement(messageDate).getText();
    }

    public String getMessageAddress() {
        return driver.findElement(messageAddress).getText();
    }

    public String getMessageCity() {
        return driver.findElement(messageCity).getText();
    }

    public String getMessageState() {
        return driver.findElement(messageState).getText();
    }

    public String getMessagePIN() {
        return driver.findElement(messagePIN).getText();
    }

    public String getMessagePhone() {
        return driver.findElement(messagePhone).getText();
    }

    public String getMessageEmail() {
        return driver.findElement(messageEmail).getText();
    }

    public String getMessagePassword() {
        return driver.findElement(messagePassword).getText();
    }
}
