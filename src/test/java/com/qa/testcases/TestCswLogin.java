package com.qa.testcases;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.datautitlities.Excelutility;
import com.qa.globals.Constants;
import com.qa.globals.Globals;
import com.qa.pageobjects.AccountPage;
import com.qa.pageobjects.LoginPageobjects;


public class TestCswLogin extends Globals {

	// Launch the Browser
	@BeforeTest
	public void url_launch() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		browserNav(QA_CoverStoryURL);

	}

	// Test case for Login with Valid credentials

	@Test(priority = 0)
	public void coverStoryEmailLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Email :Login button clicked", true);
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		Reporter.log("Email :Email entered", true);
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Reporter.log("Email :Password entered", true);
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		Reporter.log("Email :SignIn using email is successful", true);
		Thread.sleep(1000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email :Login Icon clicked", true);
		Thread.sleep(3000);
		lgin.signOutButton.click();
	/*	//Assert.assertEquals("Sign Out", lgin.signOutButton.getText(),"Text not matched | ");
		//assertTrue("Sign Out".trim().equals(lgin.signOutButton.getText()));
		
		Actions action = new Actions(driver);
		action.moveToElement(lgin.signOutButton).build().perform();
		WebElement toolTipElement = driver.findElement(By.xpath("//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[6]"));
		// To get the tool tip text and assert
		String toolTipText = toolTipElement.getText();
		Assert.assertEquals("Sign Out", toolTipText);
		Reporter.log("Login success",true);
		
		
	   // Reporter.log("Email : Login Success ", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 20, "Xpath", Constants.signOutButton);
		
		//int var_ele_size= driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).size();
		//driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).get(var_ele_size-1).click();
		lgin.signOutButton.click();
		Assert.assertEquals("Sign In / Sign Up", lgin.signInButton.getText(),"Text not matched | ");
		
		
		//Reporter.log("Email :signout using Email number is successful", true);
		//System.out.println(lgin.signOutButton.getText());
		//assertTrue("Search results 'shorts' ".trim().equalsIgnoreCase(search.searchResult.getText()));
		//Assert.assertEquals(arg0, arg1);
		//Reporter.log("Search result for shorts success with login", true);
	// captureScreen();
*/
	}

	// Test case for Login with Valid credentials
	@Test(priority = 1)
	public void coverStoryPhoneLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Phone :Login button clicked", true);
		log(Excelutility.excelData(3, 0, 0));
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginInputId);
		lgin.loginInputId.sendKeys(Excelutility.excelData(3, 0, 0));
		Reporter.log("Phone Number Login: Phone number entered", true);
		Thread.sleep(1000);
		log(Excelutility.excelData(3, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(3, 1, 0));
		Reporter.log("Phone Number Login :Password entered", true);
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		Reporter.log("Phone :Login using phone number is successful", true);
		Thread.sleep(5000);
		//WebDriverExplicitWait(driver, 5, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone :Login Icon clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
		//int var_ele_size= driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).size();
		//driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).get(var_ele_size-1).click();
		lgin.signOutButton.click();
		Reporter.log("Phone :signout using phone number is successful", true);
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();

	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 2)
	public void coverStorygoogleplusLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("GooglePlus : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("GooglePlus :Login button clicked", true);
		//Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signinGooglePlus);
		lgin.signinGooglePlus.click();
		Reporter.log("GooglePlus :signinGooglePlus button clicked", true);
		Thread.sleep(5000);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(4, 0, 0));
		lgin.emailAndPhoneSignin.sendKeys(Excelutility.excelData(4, 0, 0));
		Reporter.log("GooglePlus :emailAndPhoneSignin button clicked", true);
		lgin.nextButtonSignin.click();
		Reporter.log("GooglePlus :nextButtonSignin button clicked", true);
		Thread.sleep(3000);
		log(Excelutility.excelData(4, 1, 0));
		lgin.passwordSignin.sendKeys(Excelutility.excelData(4, 1, 0));
		//Thread.sleep(5000);
		lgin.gmailSigninButton.click();		
		Reporter.log("GooglePlus :gmailSigninButton button clicked", true);
		Thread.sleep(5000);
		switchToPreviousTabOrWindow();	
		//Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("GooglePlus :loginIcon button clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
		//int var_ele_size= driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).size();
		//driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).get(var_ele_size-1).click();
		lgin.signOutButton.click();
		Reporter.log("GooglePlus :signOutButton button clicked", true);
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();
	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 3)
	public void coverStoryFacebookLogin() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Facebook : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Facebook : Login button clicked", true);
		//Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signinFacebook);
		lgin.signinFacebook.click();
		Reporter.log("Facebook : signinFacebook button clicked", true);
		Thread.sleep(5000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.facebookEmailAndPhone);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(5, 0, 0));
		lgin.facebookEmailAndPhone.sendKeys(Excelutility.excelData(5, 0, 0));
		//Thread.sleep(5000);
		log(Excelutility.excelData(5, 1, 0));
		lgin.facebookPassword.sendKeys(Excelutility.excelData(5, 1, 0));
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.facebookLoginButton);
		lgin.facebookLoginButton.click();
		Reporter.log("Facebook : facebookLoginButton button clicked", true);
		/*//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("loginIcon button clicked", true);
		//Thread.sleep(2000);
		lgin.facebookSignOutButton.click();
		*/
       switchToPreviousTabOrWindow();
		Thread.sleep(5000);
       //WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Facebook :loginIcon button clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
		int var_ele_size= driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).size();
		driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).get(var_ele_size-1).click();
		//lgin.signOutButton.click();
		Reporter.log("Facebook :signOutButton button clicked", true);

		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();

	}
	
	@Test(priority = 4)
	public void coverStoryOTPLogin() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Phone :Login button clicked", true);
		//Thread.sleep(1000);
		log(Excelutility.excelData(3, 0, 0));	
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginInputId);
		lgin.loginInputId.sendKeys(Excelutility.excelData(3, 0, 0));
		Reporter.log("Login with OTP: Phone number entered", true);
		Thread.sleep(5000);
		check(lgin.OTPCheckBox);
		Thread.sleep(5000);
		lgin.signinOTP.click();
		Reporter.log("OTP sent", true);
		Assert.assertEquals("Enter OTP to Sign In", lgin.OTPEnterPage.getText());
		System.out.println();
	}

	// Closing the Browser:
	/*@AfterTest
	public void closeBrowser() {
		browserClose();
	}
*/
}	