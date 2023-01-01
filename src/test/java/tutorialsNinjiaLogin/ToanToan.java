package tutorialsNinjiaLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.ConfigurationReader;


public class ToanToan {
	WebDriver driver;
	TutorialsNinjiaLoginPage tutorialsNinjiaLoginPage;
	TutorialsNinjiaLoginRegisterPage tutorialsNinjiaLoginRegisterPage;




	@BeforeClass(groups = "toan")
	public void start(){
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		System.out.println("HRM_LoginPage functionality verification started");
	}
	@AfterClass(groups = "toan")
	public void end(){
		System.out.println("Our test ending");
	}
   @BeforeMethod(groups = "toan")
	public void setup(){

		driver=new ChromeDriver();
		System.out.println("test is being executed");
		driver.manage().window().maximize();
		driver.get(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.url"));
		tutorialsNinjiaLoginPage=new TutorialsNinjiaLoginPage(driver);
		tutorialsNinjiaLoginPage.accountButton.click();
		tutorialsNinjiaLoginPage.registerButton.click();
		tutorialsNinjiaLoginRegisterPage=new TutorialsNinjiaLoginRegisterPage(driver);

	}
	@AfterMethod(groups = "toan")
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test executed");
		driver.quit();
	}
	@Test(priority = 1,dataProvider = "regression",dataProviderClass = TutorialsNinjiaLoginPageData.class)
	public void registerWithRequiredField(String firstName,String lastName,String email,String telephone,String passWord,String confirmPassword) throws InterruptedException {


//		 tutorialsNinjiaLoginRegisterPage.firsNameButton.sendKeys(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.firstname"));
//		 tutorialsNinjiaLoginRegisterPage.lastameButton.sendKeys(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.lastname"));
//		 tutorialsNinjiaLoginRegisterPage.emailButton.sendKeys(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.email"));
//		tutorialsNinjiaLoginRegisterPage.telephoneButton.sendKeys(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.telephone"));
//		tutorialsNinjiaLoginRegisterPage.passwordButton.sendKeys(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.password"));
//		tutorialsNinjiaLoginRegisterPage.passwordConfirmButton.sendKeys(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.confirmpassword"));
//		tutorialsNinjiaLoginRegisterPage.subscribeButton.click();
//		tutorialsNinjiaLoginRegisterPage.privacyPropertyBox.click();
//		tutorialsNinjiaLoginRegisterPage.continueButton.click();
		tutorialsNinjiaLoginRegisterPage.firsNameButton.sendKeys(firstName);
		tutorialsNinjiaLoginRegisterPage.lastameButton.sendKeys(lastName);
		tutorialsNinjiaLoginRegisterPage.emailButton.sendKeys(email);
		tutorialsNinjiaLoginRegisterPage.telephoneButton.sendKeys(telephone);
		tutorialsNinjiaLoginRegisterPage.passwordButton.sendKeys(passWord);
		tutorialsNinjiaLoginRegisterPage.passwordConfirmButton.sendKeys(confirmPassword);
		tutorialsNinjiaLoginRegisterPage.subscribeButton.click();
		tutorialsNinjiaLoginRegisterPage.privacyPropertyBox.click();
		tutorialsNinjiaLoginRegisterPage.continueButton.click();

		String actualText=driver.findElement(By.xpath("(//*[text()='Your Account Has Been Created!'])[2]")).getText();
		String expectecText="Your Account Has Been Created!";
		Assert.assertEquals(actualText,expectecText,"text is not showing");
		//scenario.write(actualText);
	}
//	@Test(groups = "toan",priority = 2)
//	public void registerWithEmptyRequiredField(){
////		driver.get(ConfigurationReader.getProperty("ui-config.properties","tutorialsninja.url"));
////		tutorialsNinjiaLoginPage=new TutorialsNinjiaLoginPage(driver);
////		tutorialsNinjiaLoginRegisterPage=new TutorialsNinjiaLoginRegisterPage(driver);
////		tutorialsNinjiaLoginPage.accountButton.click();
////		tutorialsNinjiaLoginPage.registerButton.click();
//		tutorialsNinjiaLoginRegisterPage.continueButton.click();
//
//		String actualFirstNameError=tutorialsNinjiaLoginRegisterPage.firstnameErrorText.getText();
//		String expectedFirstNameError="First Name must be between 1 and 32 characters!";
//
//		String actualLastNameError=tutorialsNinjiaLoginRegisterPage.lastnameErrorText.getText();
//		String expectedLastNameError="Last Name must be between 1 and 32 characters!";
//
//		String actualEmailError=tutorialsNinjiaLoginRegisterPage.emailErrorText.getText();
//		String expectedemailError="E-Mail Address does not appear to be valid!";
//
//		String actualTelephoneError=tutorialsNinjiaLoginRegisterPage.telephoneErrorText.getText();
//		String expectedtelephoneError="Telephone must be between 3 and 32 characters!";
//
//		String actualpasswordError=tutorialsNinjiaLoginRegisterPage.passwordErrorText.getText();
//		String expectedPasswordError="Password must be between 4 and 20 characters!";
//
//		Assert.assertEquals(actualFirstNameError,expectedFirstNameError);
//
//		Assert.assertEquals(actualLastNameError,expectedLastNameError);
//
//		Assert.assertEquals(actualEmailError,expectedemailError);
//
//		Assert.assertEquals(actualTelephoneError,expectedtelephoneError);
//
//		Assert.assertEquals(actualpasswordError,expectedPasswordError);
//	}
//	@Test(groups = "toan",priority = 3)
//	public void loinWithExistingAccount(){
//		tutorialsNinjiaLoginRegisterPage.firsNameButton.sendKeys("Chau");
//		tutorialsNinjiaLoginRegisterPage.lastameButton.sendKeys("Thai");
//		tutorialsNinjiaLoginRegisterPage.emailButton.sendKeys("chauthai2003@gmail.com");
//		tutorialsNinjiaLoginRegisterPage.telephoneButton.sendKeys("4074806076");
//		tutorialsNinjiaLoginRegisterPage.passwordButton.sendKeys("Kiwismart1");
//		tutorialsNinjiaLoginRegisterPage.passwordConfirmButton.sendKeys("Kiwismart1");
//		tutorialsNinjiaLoginRegisterPage.subscribeButton.click();
//		tutorialsNinjiaLoginRegisterPage.privacyPropertyBox.click();
//		tutorialsNinjiaLoginRegisterPage.continueButton.click();
//		String actual=tutorialsNinjiaLoginRegisterPage.emailAlreadyExistText.getText();
//		String expect="Warning: E-Mail Address is already registered!";
//		Assert.assertEquals(actual,expect);
//	}
//
//    @Test(groups = "toan")
//public void test1(){
//		System.out.println("t77777777777777777777777");
//}
//	@Test(groups = "toan")
//	public void test2(){
//		System.out.println("6666666666666666666666666");
//	}
//	@Test(groups = "toan")
//	public void test3(){
//		System.out.println("6666666666666666666666666");
//	}

}
