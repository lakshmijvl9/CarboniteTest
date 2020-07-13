package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.Loginpage;

public class UserLoginTestCase extends BaseClass {

	public static final String Email_Address = "testdata@gmail.com";
	public static final String Invalid_Email = "testdata1@gmail.com";
	public static final String Password = "Automation12";
	public static final String Country = "Algeria";

	@Test
	public void UserLoginTestCase() throws Exception {
		Loginpage loginPage = new Loginpage(driver);
		loginPage.email(Email_Address);
		loginPage.confrirmemail(Email_Address);
		loginPage.password(Password);
		loginPage.confirmpassword(Password);
		loginPage.countryResi(Country);
		loginPage.submitUser();
	}

	@Test
	public void Useremailerrormessagedisplay() {
		Loginpage loginPage = new Loginpage(driver);
		loginPage.navigateToCarboniteLoginPage();
		loginPage.email(Email_Address);
		loginPage.confrirmemail(Invalid_Email);
		loginPage.Emailerrormessagedisplay();
		CloseBrowser();
	}
}
