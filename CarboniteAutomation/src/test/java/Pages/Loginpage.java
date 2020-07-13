package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Loginpage {

	WebDriver driver;

	By setemail = By.xpath("//input[@name='Email']");
	By setconfirmemail = By.xpath("//input[@name='confirmEmail']");
	By setpassword = By.cssSelector("input[type='password'][name='Password']");
	By confirmpassword = By.cssSelector("input[type='password'][name='ConfirmPassword']");
	By Countrydropdown = By.xpath(".//*[@name=\"Country\"]");
	By SubmitBtn = By.xpath(".//*[@value='Submit']");

	By emailErrorMessage = By.cssSelector("main#ContentMain div.form-group.has-error > span");

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	// Navigating to Carbonite Signup Page

	public void navigateToCarboniteLoginPage() {
		driver.get("https://www.carbonite.com/backup-software/safe-personal-trial/");

	}

	// Enter Email Id
	public void email(String text) {
		driver.findElement(setemail).sendKeys(text);

	}

	// Enter Confirm Email Id
	public void confrirmemail(String text)

	{
		driver.findElement(setconfirmemail).sendKeys(text);

	}

	// Enter Password
	public void password(String text)

	{
		driver.findElement(setpassword).sendKeys(text);

	}

	// Enter Confirm Password
	public void confirmpassword(String text) {

		driver.findElement(confirmpassword).sendKeys(text);

	}

	// Enter Country Residence
	public void countryResi(String text)

	{
		Select s = new Select(driver.findElement(By.xpath(".//*[@name='Country']")));
		s.selectByVisibleText(text);

	}

	// Submit the user details
	public void submitUser() throws Exception {

		Actions action = new Actions(driver);
		WebElement SBtn = driver.findElement(By.xpath(".//*[@value='Submit']"));
		action.moveToElement(SBtn).build().perform();
		Thread.sleep(5000);
		driver.findElement(SubmitBtn).click();

	}

	// To validate invalid Email Error message & Text
	public void Emailerrormessagedisplay() {
		String errorText = driver.findElement(emailErrorMessage).getText();
		Assert.assertTrue(driver.findElement(emailErrorMessage).isDisplayed(), "Error Message Is Not Displayed");
		Assert.assertEquals(errorText, "Email must match confirm email");

	}
}