package Deposit;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SecureAreaPage;

public class DepositTest extends BaseTests {

    @Test
    @DisplayName("TC01-Verify Deposit when input correct Account No is exited// Amount <= Amount in Account // Input description")
    public void testCase01() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("124338");
        depositPage.setAmount("100");
        depositPage.setDescription("abcd");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        Assertions.fail();
//        secureAreaPage.back();
    }

    @Test
    @DisplayName("TC02-Verify Deposit when input Incorrect Account No is not exited// Amount <= Amount in Account // Input description")
    public void testCase02() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("1243");
        depositPage.setAmount("100");
        depositPage.setDescription("abcd");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Account does not exist"), "Alert text is correct");
        //        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC03-Verify Deposit when Account NO, Amount and Description blank")
    public void testCase03() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("");
        depositPage.setAmount("");
        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertTrue(alertAccount.contains("Account Number must not be blank"), "Alert text is correct");
        Assertions.assertTrue(alertAmount.contains("Amount field must not be blank"), "Alert text is correct");
        Assertions.assertTrue(alertDes.contains("Description can not be blank"), "Alert text is correct");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC04-Verify Deposit when Account NO is blank")
    public void testCase04() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("");
        depositPage.setAmount("100");
        depositPage.setDescription("abcd");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertTrue(alertAccount.contains("Account Number must not be blank"), "Alert text is correct");
        Assertions.assertFalse(alertAmount.contains("Amount field must not be blank"), "Alert text is incorrect");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC05-Verify Deposit when Amount blank")
    public void testCase05() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("124338");
        depositPage.setAmount("");
        depositPage.setDescription("abcd");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertFalse(alertAccount.contains("Account Number must not be blank"), "Alert text is incorrect");
        Assertions.assertTrue(alertAmount.contains("Amount field must not be blank"), "Alert text is correct");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC06-Verify Deposit when Des blank")
    public void testCase06() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("124338");
        depositPage.setAmount("1000");
        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertFalse(alertAccount.contains("Account Number must not be blank"), "Alert text is incorrect");
        Assertions.assertFalse(alertAmount.contains("Amount field must not be blank"), "Alert text is incorrect");
        Assertions.assertTrue(alertDes.contains("Description can not be blank"), "Alert text is correct");
        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC07-Verify Deposit when Account NO have Characters are not allowed")
    public void testCase07() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("i");
//        depositPage.setAmount("1000");
//        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertTrue(alertAccount.contains("Characters are not allowed"), "Alert text is correct");
        Assertions.assertFalse(alertAmount.contains("Characters are not allowed"), "Alert text is incorrect");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC08-Verify Deposit when Account NO have Special characters are not allowed")
    public void testCase08() {
        depositPage.clickTabDeposit();
        depositPage.setAccount("@");
//        depositPage.setAmount("1000");
//        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertTrue(alertAccount.contains("Special characters are not allowed"), "Alert text is correct");
        Assertions.assertFalse(alertAmount.contains("Characters are not allowed"), "Alert text is incorrect");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC09-Verify Deposit when Amount have Characters are not allowed")
    public void testCase09() {
        depositPage.clickTabDeposit();
//        depositPage.setAccount("@");
        depositPage.setAmount("i");
//        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertFalse(alertAccount.contains("Special characters are not allowed"), "Alert text is incorrect");
        Assertions.assertTrue(alertAmount.contains("Characters are not allowed"), "Alert text is correct");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC010-Verify Deposit when Amount have Special characters are not allowed")
    public void testCase10() {
        depositPage.clickTabDeposit();
//        depositPage.setAccount("@");
        depositPage.setAmount("@");
//        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertFalse(alertAccount.contains("Special characters are not allowed"), "Alert text is incorrect");
        Assertions.assertTrue(alertAmount.contains("Special characters are not allowed"), "Alert text is correct");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
//        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC011-Verify Deposit when only ClickSubmit")
    public void testCase11() {
        depositPage.clickTabDeposit();
//        depositPage.setAccount("@");
//        depositPage.setAmount("@");
//        depositPage.setDescription("");
        SecureAreaPage secureAreaPage = depositPage.clickSubmitButton();
        String alertText = secureAreaPage.getAlert();
        Assertions.assertTrue(alertText.contains("Please fill all fields"), "Alert text is correct");
        String alertAccount = secureAreaPage.getmessageAcount();
        String alertAmount = secureAreaPage.getmessageAmount();
        String alertDes = secureAreaPage.getmessageDescription();
        System.out.println(alertAccount);
        System.out.println(alertAmount);
        System.out.println(alertDes);
        Assertions.assertFalse(alertAccount.contains("Special characters are not allowed"), "Alert text is incorrect");
        Assertions.assertFalse(alertAmount.contains("Special characters are not allowed"), "Alert text is incorrect");
        Assertions.assertFalse(alertDes.contains("Description can not be blank"), "Alert text is incorrect");
        secureAreaPage.close();
    }

    @Test
    @DisplayName("TC00-Total test case")
    public void testCaseTotal() {
//        testCase01();
        testCase02();
        testCase03();
        testCase04();
        testCase05();
//        testCase06();
        testCase07();
        testCase08();
        testCase09();
        testCase10();
        testCase11();


    }
}
