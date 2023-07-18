package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DepositPage;
import pages.NewCustomerPage;
//import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected DepositPage depositPage;
    protected NewCustomerPage newCustomerPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys("mngr514527");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("patavus");
//        password.sendKeys("patavu");
        By loginButton = By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
        driver.findElement(loginButton).click();
        depositPage = new DepositPage(driver);
        newCustomerPage = new NewCustomerPage(driver);
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
    }

    @AfterEach
    public void tearDown() {
//        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}

