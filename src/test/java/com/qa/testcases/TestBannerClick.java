package com.qa.testcases;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.globals.CommonMethods;
import com.qa.globals.Globals;
import com.qa.pageobjects.AccountPage;
import com.qa.pageobjects.LoginPageobjects;
import com.qa.pageobjects.SearchPage;

public class TestBannerClick extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}

	// Banner click in home page
	@Test(priority = 0)

	public void Banner() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		// Thread.sleep(10000);
		search.bannerSlider.click();
		search.bannerOne.click();
		Reporter.log("Banner clicked without Login", true);
	}

	// Banner click in home page
	@Test(priority = 1)

	public void BannerclickWithLogin() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		SearchPage search = new SearchPage(driver);
		// Login with email
		CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		search.coverstoryName.click();
		Thread.sleep(5000);
		search.bannerSlider.click();
		search.bannerOne.click();
		Reporter.log("Banner click with Login", true);
	}

	@Test(priority = 2)

	public void BannerclickWithLoginOne() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		search.coverstoryName.click();
		Thread.sleep(5000);
		search.bannerNewIn.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/new-products/clothing/");
		Reporter.log("NewIn Banner clicked with Login", true);
	}

	/*@Test(priority = 3)

	public void BannerclickWithLoginTwo() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		driver.get("https://www.coverstory.co.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			// verifyLinkActive(url);
			ele.click();
		}
	}*/

	// Closing the Browser:
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}