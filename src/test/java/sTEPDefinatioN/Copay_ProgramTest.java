package sTEPDefinatioN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Copay_ProgramTest {
	
	public static WebDriver driver;
	

	@Given("^I open Pulmozyme site$")
	public void i_open_Pulmozyme_site() throws Throwable {
   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.pulmozymesupport.com");

		
		
	}

	@Given("^click on Apply now$")
	public void click_on_Apply_now() throws Throwable {

   driver.findElement(By.xpath("//a[@class='button'][text()='APPLY NOW']")).click();
		
		
		
	}

	@Given("^As a Patient I want to enroll$")
	public void as_a_Patient_I_want_to_enroll() throws Throwable {

    driver.findElement(By.className("checkmark")).click();
		
		
		
	}

	@Given("^Clicks on next$")
	public void clicks_on_next() throws Throwable {

   driver.findElement(By.id("agree")).click();
		
		
		
		
	}

	@Given("^Select not first time Pulmozyme user$")
	public void select_not_first_time_Pulmozyme_user() throws Throwable {


		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[3]/label/span")).click();
		
	}

	@Given("^Click on the next$")
	public void click_on_the_next() throws Throwable {

    driver.findElement(By.name("apply-step-one-submit")).click();
		
		
		
	}

	@When("^I complete the eligibility QN$")
	public void i_complete_the_eligibility_QN() throws Throwable {


		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[1]/td[2]/p[2]/label/span")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[2]/td[2]/p[2]/label/span")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td[2]/p[2]/label/span")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[4]/td[2]/p[2]/label/span")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[5]/td[2]/p[3]/label/span")).click();

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NY");
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[7]/td[2]/p[3]/label/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td[2]/p[2]/label/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[9]/td[2]/p[7]/label/span")).click();
		
		

		
		
		
	}

	@When("^Click next$")
	public void click_next() throws Throwable {
		
		driver.findElement(By.name("apply-step-one-submit")).click();
		
		
	}

	@Then("^I fillup the patient information$")
	public void i_fillup_the_patient_information() throws Throwable {
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Ralph" + currentTime);
		
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Stanley" + currentTime);
		
		
		WebElement list_by_gender = driver.findElement(By.name("sex"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("M");
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[1]/div/span/a/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[1]/select/option[7]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[2]/div/span/a/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[2]/select/option[29]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[3]/div/span/a/span[1]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[3]/select/option[39]")).click();
		
		
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("16 Clearman Pl" + currentTime);
		
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Belleville" + currentTime);
		
		
		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NY");
		
		
		
		driver.findElement(By.id("zipCode")).clear();
		driver.findElement(By.id("zipCode")).sendKeys("07109" + currentTime);
		
		driver.findElement(By.id("homePhone")).clear();
		driver.findElement(By.id("homePhone")).sendKeys("9734542323" + currentTime);
		
		driver.findElement(By.id("SocialSecurityNumber")).clear();
		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("1234" + currentTime);
		
		
		driver.findElement(By.xpath(".//*[@id='radio_group2']/label/span")).click();
		
		


		
		
		
		


		
		
		
	}

	@Then("^I fill up the Insurance information$")
	public void i_fill_up_the_Insurance_information() throws Throwable {
		
		

		
		WebElement list_by_company = driver.findElement(By.id("insuranceCompanyName"));
		Select List_by_Company = new Select(list_by_company);

		List_by_Company.selectByValue("Aetna");
		
		
		
		WebElement list_by_type = driver.findElement(By.id("insurancePlanType"));
		Select List_by_Type = new Select(list_by_type);

		List_by_Type.selectByValue("PPO");
		
		driver.findElement(By.id("insuranceGroupNumber")).sendKeys("1234567899");
		
		
		driver.findElement(By.id("insuranceMemberNumber")).sendKeys("946566464");
		

		driver.findElement(By.id("insuranceBINNumber")).sendKeys("123456");
		

		driver.findElement(By.id("insurancePCNNumber")).sendKeys("123456");
		
		
		


		
		
	}

	@Then("^I fill up Login information$")
	public void i_fill_up_Login_information() throws Throwable {
		
		long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.name("login_id")).clear();
		driver.findElement(By.name("login_id")).sendKeys("andycole123@yahoo.com" + currentTime);	
		
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Madonna#00007" + currentTime);
		
		
		driver.findElement(By.name("password2")).clear();
		driver.findElement(By.name("password2")).sendKeys("Madonna#00007" + currentTime);
		


		
		
	}

	@Then("^click the next$")
	public void click_the_next() throws Throwable {

    driver.findElement(By.className("input-submit")).click();
		
		
		
	}

	@Then("^fillup the doctor information$")
	public void fillup_the_doctor_information() throws Throwable {

long currentTime = System.currentTimeMillis();
		
		
		driver.findElement(By.id("doc_firstName")).clear();
		driver.findElement(By.id("doc_firstName")).sendKeys("Elvin" + currentTime);
		
		
		driver.findElement(By.id("doc_lastName")).clear();
		driver.findElement(By.id("doc_lastName")).sendKeys("White" + currentTime);
		
		
		driver.findElement(By.id("doc_practiceName")).clear();
		driver.findElement(By.id("doc_practiceName")).sendKeys("Michelle Anderson" + currentTime);
		
        
		driver.findElement(By.id("doc_address")).clear();
		driver.findElement(By.id("doc_address")).sendKeys("441 Preakness Ave" + currentTime);
		
		
		driver.findElement(By.id("doc_city")).clear();
		driver.findElement(By.id("doc_city")).sendKeys("Wayne" + currentTime);
		
		
		WebElement list_by_state = driver.findElement(By.name("doc_state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");
		
		
		driver.findElement(By.id("doc_zipCode")).clear();
		driver.findElement(By.id("doc_zipCode")).sendKeys("07424" + currentTime);
			

		driver.findElement(By.id("doc_phone")).clear();
		driver.findElement(By.id("doc_phone")).sendKeys("8621234343" + currentTime);
		
		
		
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {

     driver.findElement(By.name("apply-step-two-submit")).click();
		
		
	}

	@Then("^Confirm The Information$")
	public void confirm_The_Information() throws Throwable {

		
		
		WebElement element = driver.findElement(By.xpath("//h1[text()='Please Confirm This Information Is Correct']"));

		System.out.println(element.getText());
		
		
		
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[2]"));

		System.out.println(element1.getText());
		
		
		
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[4]"));

		System.out.println(element2.getText());


		
		
		
	}

	@Then("^Click on check box$")
	public void click_on_check_box() throws Throwable {


		driver.findElement(By.xpath(".//*[@id='container']/form/p[36]/span[1]/label/span")).click();
		
		
	}

	@Then("^Click on Confirm button$")
	public void click_on_Confirm_button() throws Throwable {

		
		driver.findElement(By.id("submit")).click();

		
		
	}

}
