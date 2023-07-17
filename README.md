# AutomationTestGuru99
=====================TC_001	Verify Deposit when input correct Account No is exited// Amount <= Amount in Account // Input description	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Account NO
2) Enter a value in Amount
3) Enter description
4) Click ""Submit"" button"	"- Account NO: 124338
- Amount: 100
- Description: abcd"	Redirect page Transaction Detail	ERROR 500	Fail	
  
=====================TC_002	Verify Deposit when input Incorrect Account No is not exited// Amount <= Amount in Account // Input description	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Account NO
2) Enter a value in Amount
3) Enter description
4) Click ""Submit"" button"	"- Account NO: 1243
- Amount: 100
- Description: abcd"	Alert "Account does not exist" is shown	Alert "Account does not exist" is show	Pass	

=====================TC_003	Verify Deposit when Account NO, Amount and Description blank	"- Login Successfull in System

- Click Tab ""Deposit"""	"1) Enter a value in Account NO
2) Enter a value in Amount
3) Enter description
4) Click ""Submit"" button"	"- Account NO: 
- Description: "	Alert "Please fill all fields" is shown	Alert "Please fill all fields" is show	Pass	
  
=====================TC_004	Verify Deposit when Account NO blank	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Amount
2) Enter description
"	"- Account NO: 
- Amount: 100
- Description: abcd"	Message"Account Number must not be blank" is shown	Message"Account Number must not be blank" is shown	Pass

=====================TC_005	Verify Deposit when Amount blank	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Account NO
2) Enter description
"	"- Account NO: 124338
- Description: abcd"	Message"Amount field must not be blank" is shown	Message"Amount field must not be blank" is shown	Pass

=====================TC_006	Verify Deposit when Description blank	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Account NO
2) Enter a value in Amount
"	"- Account NO: 124338
- Amount: 100"	Message"Description can not be blank" is shown	Message"Description can not be blank" is shown	Faild

=====================TC_007	Verify Deposit when Account NO have Characters are not allowed	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Account NO

"	"- Account NO: i
"	Message"Characters are not allowed" is shown	Message"Characters are not allowed" is shown	Pass	

=====================TC_008	Verify Deposit when Account NO have Special characters are not allowed	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Account NO
"	"- Account NO: @
"	Message"Special characters are not allowed" is shown	Message"Special characters are not allowed" is shown	Pass

=====================TC_009	Verify Deposit when Amount have Characters are not allowed	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Amount

"	"- Amount: i
"	Message"Characters are not allowed" is shown	Message"Characters are not allowed" is shown	Pass	

=====================TC_010	Verify Deposit when Amount have Special characters are not allowed	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Enter a value in Amount 

"	"- Amount : @
"	Message"Special characters are not allowed" is shown	Message"Special characters are not allowed" is shown	Pass

=====================TC_011	Verify Deposit when only ClickSubmit	"- Login Successfull in System
- Click Tab ""Deposit"""	"1) Click Submit 

"	"
"	Alert "Please fill all fields" is shown	Alert "Please fill all fields" is shown	Pass	
