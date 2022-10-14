package pomWithPagefactoryPractice;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class loginPage {

	// Declaration
	
	@FindBy(xpath = "//img[@alt='Facebook']") private WebElement login_fblogo;
	@FindBy(xpath = "//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement login_fbtabline;
	@FindBy(xpath = "//a[text()='Forgotten password?']") private WebElement forgot_password;
	@FindBy(xpath = "//a[text()='Create New Account']") private WebElement createnew_account;
	@FindBy(xpath = "//input[@id='email']") private WebElement username;
	@FindBy(xpath = "//input[@id='pass']") private WebElement password;
	@FindBy(xpath = "//button[@name='login']") private WebElement login_Btn;
	@FindBys({@FindBy(xpath = "//*[@id=\"pageFooterChildren\"]//li")}) private List<WebElement> footerlinks;
	
	// Initialization
	
	public loginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void verifyfacebookloginpageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(),"facebook login page Logo is not dislayed");
		Reporter.log("verifyfacebookloginpageLogo");
		
	}
	
	public void verifyfacebookloginpageTagline() {
		Assert.assertTrue(login_fbtabline.isDisplayed(), "facebook login page Tagline is not dislayed");
		Assert.assertEquals(login_fbtabline.getText(), "Facebook helps you connect and share with the people in your life.");
		Reporter.log("verifyfacebookloginpageTagline");
	}
	
	public void verifyfacebookloginpageforgotpasswordlink() {
		Assert.assertTrue(forgot_password.isDisplayed(), "forgot password link is not displayed");
		Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
		Reporter.log("verifyfacebookloginpageforgotpasswordlink");
	}
	
	public void verifyfacebookloginpageCreateNewAccount() {
		Assert.assertTrue(createnew_account.isDisplayed(), "Create new account button is not displayed");
		Assert.assertTrue(createnew_account.isEnabled(),"Create new account button is not enabled");
		Assert.assertEquals(createnew_account.getText(), "Create New Account");
		Reporter.log("verifyfacebookloginpageCreateNewAccount");
	}
	
	public void setfacebookloginpageUsername() {
		Assert.assertTrue(username.isDisplayed(),"username field is displayed");
		username.sendKeys("rohithadap");
		Reporter.log("setfacebookloginpageUsername");
	}
	
	public void setfacebookloginpagePassword() {
		Assert.assertTrue(password.isDisplayed(),"Password field is displayed");
		password.sendKeys("rohithadap");
		Reporter.log("setfacebookloginpagePassword");
	}
	
	public void clickfacebookloginpageloginbtn() {
		
		login_Btn.click();
		Reporter.log("clickfacebookloginpageloginbtn");
	}
	
	public void verifyFacebookLoginPageFooterLinkSize() {
		
		Assert.assertEquals(footerlinks.size(), 31);
		Reporter.log("verifyFacebookLoginPageFooterLinkSize");
	}
	
	
	
	
	
	
}
