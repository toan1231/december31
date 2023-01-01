package tutorialsNinjiaLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsNinjiaLoginRegisterPage {
	WebDriver driver;
	public TutorialsNinjiaLoginRegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="#input-firstname")
	public WebElement firsNameButton;
	@FindBy(css="#input-lastname")
	public WebElement lastameButton;
	@FindBy(css="#input-email")
	public WebElement emailButton;
	@FindBy(css="#input-telephone")
	public WebElement telephoneButton;
	@FindBy(css="#input-password")
	public WebElement passwordButton;
	@FindBy(css="#input-confirm")
	public WebElement passwordConfirmButton;
	@FindBy(name = "agree")
	public WebElement privacyPropertyBox;
	@FindBy(xpath = "(//*[@name='newsletter'])[1]")
	public WebElement subscribeButton;
	@FindBy(css ="[type=submit]")
	public WebElement continueButton;

	@FindBy(xpath = "//*[text()='First Name must be between 1 and 32 characters!']")
	public WebElement firstnameErrorText;
	@FindBy(xpath = "//*[text()='Last Name must be between 1 and 32 characters!']")
	public WebElement lastnameErrorText;
	@FindBy(xpath = "//*[text()='E-Mail Address does not appear to be valid!']")
	public WebElement emailErrorText;
	@FindBy(xpath = "//*[text()='Telephone must be between 3 and 32 characters!']")
	public WebElement telephoneErrorText;
	@FindBy(xpath ="//*[text()='Password must be between 4 and 20 characters!']")
	public WebElement passwordErrorText;
	@FindBy(xpath ="//*[text()='Password confirmation does not match password!']")
	public WebElement passwordConfirmErrorText;
	@FindBy(xpath = "(//*[@id='account-register']/div)[1]")
	public WebElement emailAlreadyExistText;



	}


