package tutorialsNinjiaLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsNinjiaLoginPage {
	WebDriver driver;
	public TutorialsNinjiaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='My Account']")
	public WebElement accountButton;
	@FindBy(xpath = "//*[text()='Register']")
	public WebElement registerButton;



}
