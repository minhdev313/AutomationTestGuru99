package Deposit;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.SecureAreaPage;

public class NewCustomerTest extends BaseTests {

    @Test
    @DisplayName("TC01-Verify NewCustomer when input correct values")
    public void testCase01() {
        newCustomerPage.clickTabNewCustomer();
        newCustomerPage.setCustomerTxt("Minh");
        newCustomerPage.setGenderMaleTxt();
//        newCustomerPage.setGenderFeMaleTxt();
        newCustomerPage.setDateTxt("31");
        newCustomerPage.setDateTxt("03");
        newCustomerPage.setDateTxt(String.valueOf(Keys.TAB));
        newCustomerPage.setDateTxt("2002");
        newCustomerPage.setAddressTxt("4614A Dung Si Thanh Khe");
        newCustomerPage.setCityTxt("Da Nang");
        newCustomerPage.setStateTxt("Thanh Khe Tay");
        newCustomerPage.setPINTxt("3132002");
        newCustomerPage.setPhoneTxt("0981285582");
        newCustomerPage.setEmailTxt("voducminh777@gmail.com");
        newCustomerPage.setPasswordTxt("3132002");
        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String messageSuccess = clickSubmitButton.getMessageSuccess();
        System.out.println(messageSuccess);
        Assertions.assertTrue(messageSuccess.contains("Customer Registered Successfully!!!"), "Alert text is correct");
//        clickSubmitButton.close();
    }

    @Test
    @DisplayName("TC02-Verify NewCustomer when only submit")
    public void testCase02() {
        newCustomerPage.clickTabNewCustomer();
        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String alert = clickSubmitButton.getAlert();
        Assertions.assertTrue(alert.contains("please fill all fields"), "Alert text is correct");
//        clickSubmitButton.close();
    }

    @Test
    @DisplayName("TC03-Verify NewCustomer when input blank")
    public void testCase03() {
        newCustomerPage.clickTabNewCustomer();
        newCustomerPage.setCustomerTxt("");
//        newCustomerPage.setGenderMaleTxt();
        newCustomerPage.setGenderFeMaleTxt();
        newCustomerPage.setDateTxt("");
        newCustomerPage.setDateTxt("");
        newCustomerPage.setDateTxt(String.valueOf(Keys.TAB));
        newCustomerPage.setDateTxt("");
        newCustomerPage.setAddressTxt("");
        newCustomerPage.setCityTxt("");
        newCustomerPage.setStateTxt("");
        newCustomerPage.setPINTxt("");
        newCustomerPage.setPhoneTxt("");
        newCustomerPage.setEmailTxt("");
        newCustomerPage.setPasswordTxt("");
        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String alert = clickSubmitButton.getAlert();
        Assertions.assertTrue(alert.contains("please fill all fields"), "Alert text is correct");
        String messageCustomer = clickSubmitButton.getMessageCustomer();
        Assertions.assertTrue(messageCustomer.contains("Customer name must not be blank"), "Alert text is correct");
        String messageDate = clickSubmitButton.getMessageDate();
        Assertions.assertTrue(messageDate.contains("Date Field must not be blank"), "Alert text is correct");
        String messageAddress = clickSubmitButton.getMessageAddress();
        Assertions.assertTrue(messageAddress.contains("Address Field must not be blank"), "Alert text is correct");
        String messageCity = clickSubmitButton.getMessageCity();
        Assertions.assertTrue(messageCity.contains("City Field must not be blank"), "Alert text is correct");
        String messageState = clickSubmitButton.getMessageState();
        Assertions.assertTrue(messageState.contains("State must not be blank"), "Alert text is correct");
        String messagePIN = clickSubmitButton.getMessagePIN();
        Assertions.assertTrue(messagePIN.contains("PIN Code must not be blank"), "Alert text is correct");
        String messagePhone = clickSubmitButton.getMessagePhone();
        Assertions.assertTrue(messagePhone.contains("Mobile no must not be blank"), "Alert text is correct");
        String messageEmail = clickSubmitButton.getMessageEmail();
        Assertions.assertTrue(messageEmail.contains("Email-ID must not be blank"), "Alert text is correct");
        String messagePassword = clickSubmitButton.getMessagePassword();
        Assertions.assertTrue(messagePassword.contains("Password must not be blank"), "Alert text is correct");
//        clickSubmitButton.close();
    }
    @Test
    @DisplayName("TC04-Verify NewCustomer when input special chars")
    public void testCase04() {
        newCustomerPage.clickTabNewCustomer();
        newCustomerPage.setCustomerTxt("@");
//        newCustomerPage.setGenderMaleTxt();
        newCustomerPage.setGenderFeMaleTxt();
        newCustomerPage.setDateTxt("");
        newCustomerPage.setDateTxt("");
        newCustomerPage.setDateTxt(String.valueOf(Keys.TAB));
        newCustomerPage.setDateTxt("");
        newCustomerPage.setAddressTxt("@");
        newCustomerPage.setCityTxt("@");
        newCustomerPage.setStateTxt("@");
        newCustomerPage.setPINTxt("@");
        newCustomerPage.setPhoneTxt("@");
        newCustomerPage.setEmailTxt("@");
        newCustomerPage.setPasswordTxt("");
        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String alert = clickSubmitButton.getAlert();
        Assertions.assertTrue(alert.contains("please fill all fields"), "Alert text is correct");
        String messageCustomer = clickSubmitButton.getMessageCustomer();
        Assertions.assertTrue(messageCustomer.contains("Special characters are not allowed"), "Alert text is correct");
        String messageDate = clickSubmitButton.getMessageDate();
        Assertions.assertTrue(messageDate.contains("Date Field must not be blank"), "Alert text is correct");
        String messageAddress = clickSubmitButton.getMessageAddress();
        Assertions.assertTrue(messageAddress.contains("Special characters are not allowed"), "Alert text is correct");
        String messageCity = clickSubmitButton.getMessageCity();
        Assertions.assertTrue(messageCity.contains("Special characters are not allowed"), "Alert text is correct");
        String messageState = clickSubmitButton.getMessageState();
        Assertions.assertTrue(messageState.contains("Special characters are not allowed"), "Alert text is correct");
        String messagePIN = clickSubmitButton.getMessagePIN();
        Assertions.assertTrue(messagePIN.contains("Special characters are not allowed"), "Alert text is correct");
        String messagePhone = clickSubmitButton.getMessagePhone();
        Assertions.assertTrue(messagePhone.contains("Special characters are not allowed"), "Alert text is correct");
        String messageEmail = clickSubmitButton.getMessageEmail();
        Assertions.assertTrue(messageEmail.contains("Email-ID is not valid"), "Alert text is correct");
        String messagePassword = clickSubmitButton.getMessagePassword();
        Assertions.assertTrue(messagePassword.contains("Password must not be blank"), "Alert text is correct");
//        clickSubmitButton.close();
    }

    @Test
    @DisplayName("TC05-Verify NewCustomer when email is existed")
    public void testCase05() {
        newCustomerPage.clickTabNewCustomer();
        newCustomerPage.setCustomerTxt("Minh");
        newCustomerPage.setGenderMaleTxt();
//        newCustomerPage.setGenderFeMaleTxt();
        newCustomerPage.setDateTxt("31");
        newCustomerPage.setDateTxt("03");
        newCustomerPage.setDateTxt(String.valueOf(Keys.TAB));
        newCustomerPage.setDateTxt("2002");
        newCustomerPage.setAddressTxt("4614A Dung Si Thanh Khe");
        newCustomerPage.setCityTxt("Da Nang");
        newCustomerPage.setStateTxt("Thanh Khe Tay");
        newCustomerPage.setPINTxt("3132002");
        newCustomerPage.setPhoneTxt("0981285582");
        newCustomerPage.setEmailTxt("voducminh777@gmail.com");
        newCustomerPage.setPasswordTxt("3132002");
        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String alert = clickSubmitButton.getAlert();
        Assertions.assertTrue(alert.contains("Email Address Already Exist !!"), "Alert text is correct");
//        clickSubmitButton.close();
    }

    @Test
    @DisplayName("TC06-Verify NewCustomer when input character are not allowed")
    public void testCase06() {
        newCustomerPage.clickTabNewCustomer();
        newCustomerPage.setCustomerTxt("1");
        newCustomerPage.setPINTxt("d");
        newCustomerPage.setPhoneTxt("d");

        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String alert = clickSubmitButton.getAlert();
        Assertions.assertTrue(alert.contains("please fill all fields"), "Alert text is correct");
        String messageCustomer = clickSubmitButton.getMessageCustomer();
        Assertions.assertTrue(messageCustomer.contains("Numbers are not allowed"), "Alert text is correct");
        String messagePIN = clickSubmitButton.getMessagePIN();
        Assertions.assertTrue(messagePIN.contains("Characters are not allowed"), "Alert text is correct");
        String messagePhone = clickSubmitButton.getMessagePhone();
        Assertions.assertTrue(messagePhone.contains("Characters are not allowed"), "Alert text is correct");
        clickSubmitButton.close();
    }

    @Test
    @DisplayName("TC07-Verify NewCustomer when input character are not allowed")
    public void testCase07() {
        newCustomerPage.clickTabNewCustomer();
        newCustomerPage.setCustomerTxt("Võ Đức Minh");
        SecureAreaPage clickSubmitButton = newCustomerPage.clickSubmitButton();
        String alert = clickSubmitButton.getAlert();
        Assertions.assertTrue(alert.contains("please fill all fields"), "Alert text is correct");
        String messageCustomer = clickSubmitButton.getMessageCustomer();
        Assertions.assertFalse(messageCustomer.contains("Numbers are not allowed"), "Alert text is incorrect");
//        clickSubmitButton.close();
    }
    @Test
    @DisplayName("TC00-Total")
    public void testCaseTotal(){
        testCase01();
        testCase02();
        testCase03();
        testCase04();
        testCase05();
        testCase06();
//        testCase07();
    }

}
