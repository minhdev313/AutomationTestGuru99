package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By messageAcount = By.xpath("//*[@id=\"message2\"]");
    private By messageAmount = By.xpath("//*[@id=\"message1\"]");
    private By messageDescription = By.xpath("//*[@id=\"message17\"]");

    public String getAlert() {
        Alert alert = driver.switchTo().alert();
        String alertTXT = alert.getText();
        System.out.println(alertTXT);
        alert.accept();
        return alertTXT;
    }

    public String getmessageAcount() {
        return driver.findElement(messageAcount).getText();
    }

    public String getmessageAmount() {
        return driver.findElement(messageAmount).getText();
    }

    public String getmessageDescription() {
        return driver.findElement(messageDescription).getText();
    }
}
