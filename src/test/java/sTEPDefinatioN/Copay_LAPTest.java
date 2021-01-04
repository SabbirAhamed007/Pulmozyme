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

public class Copay_LAPTest {
	
	public static WebDriver driver;
	
	@Given("^I open Pulmozyme site to enrolled$")
	public void i_open_Pulmozyme_site_to_enrolled() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.pulmozymesupport.com");
		
		
		
	}

	@Given("^select apply now$")
	public void select_apply_now() throws Throwable {
		
		
		driver.findElement(By.xpath("//p[7]/a[@class='button' and 1]")).click();


		
		
	}

	@Given("^Click on LAP$")
	public void click_on_LAP() throws Throwable {


		driver.findElement(By.xpath("//p[2]/label[@class='radio' and 1]/span[@class='checkmark' and 1]")).click();
		
		driver.findElement(By.id("agree")).click();
		
		
	}

	@Given("^Choose not first time pulmozyme user$")
	public void choose_not_first_time_pulmozyme_user() throws Throwable {


		driver.findElement(By.xpath("//p[3]/label[@class='radio' and 1]/span[@class='checkmark' and 1]")).click();
		
		driver.findElement(By.name("apply-step-one-submit")).click();
		
		
	}

	@When("^I complete eligibility QN$")
	public void i_complete_eligibility_QN() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[1]/td[2]/p[2]/label/span")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[2]/td[2]/p[2]/label/span")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td[2]/p[2]/label/span")).click();
		
		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[5]/td[2]/p[3]/label/span")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[6]/td[2]/p[3]/label/span")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[7]/td[2]/p[2]/label/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td[2]/p[7]/label/span")).click();
		
		driver.findElement(By.name("apply-step-one-submit")).click();

		
		
			}

	@When("^I fill up LAP info$")
	public void i_fill_up_LAP_info() throws Throwable {


		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("guardian_first_name")).clear();
		driver.findElement(By.id("guardian_first_name")).sendKeys("Doris" + currentTime);
		
		
		driver.findElement(By.id("guardian_last_name")).clear();
		driver.findElement(By.id("guardian_last_name")).sendKeys("Hudson" + currentTime);
		
		driver.findElement(By.id("guardian_address_1")).clear();
		driver.findElement(By.id("guardian_address_1")).sendKeys("13 Clearman Pl" + currentTime);
		
		driver.findElement(By.id("guardian_address_2")).clear();
		driver.findElement(By.id("guardian_address_2")).sendKeys("Apt 6" + currentTime);
		
		driver.findElement(By.id("guardian_city")).clear();
		driver.findElement(By.id("guardian_city")).sendKeys("Totowa" + currentTime);
		
		
		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		
		driver.findElement(By.id("guardian_zip")).sendKeys("07511");
		
		
		driver.findElement(By.id("guardian_phone_number")).clear();
		driver.findElement(By.id("guardian_phone_number")).sendKeys("9875641212" + currentTime);
		
		
		
		
		
		
		
		
	}

	@When("^I fill up Patient info$")
	public void i_fill_up_Patient_info() throws Throwable {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Ron" + currentTime);
		
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Stevenson" + currentTime);
		
		
		WebElement list_by_gender = driver.findElement(By.name("sex"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("M");

		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[12]/span[1]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[12]/span[1]/select/option[9]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[12]/span[2]/div/span/a/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[12]/span[2]/select/option[20]")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[12]/span[3]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[12]/span[3]/select/option[44]")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[14]/label/span/label/span[1]")).click();
		
		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("4321");
		
		
		
		
		
			}

	@When("^select USPS$")
	public void select_USPS() throws Throwable {

    driver.findElement(By.xpath(".//*[@id='radio_group2']/label/span")).click();
    
    
    
    
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

	@Then("^I fill up login info$")
	public void i_fill_up_login_info() throws Throwable {


long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.name("login_id")).clear();
		driver.findElement(By.name("login_id")).sendKeys("andycole123@yahoo.com" + currentTime);	
		
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Madonna#00007" + currentTime);
		
		
		driver.findElement(By.name("password2")).clear();
		driver.findElement(By.name("password2")).sendKeys("Madonna#00007" + currentTime);
		
		
		driver.findElement(By.name("apply-step-one-submit")).click();
		
		
	}

	@Then("^I fill up doctor info$")
	public void i_fill_up_doctor_info() throws Throwable {


long currentTime = System.currentTimeMillis();
		
		
		driver.findElement(By.id("doc_firstName")).clear();
		driver.findElement(By.id("doc_firstName")).sendKeys("Roma Sen" + currentTime);
		
		
		driver.findElement(By.id("doc_lastName")).clear();
		driver.findElement(By.id("doc_lastName")).sendKeys("Gupta" + currentTime);
		
		
		driver.findElement(By.id("doc_practiceName")).clear();
		driver.findElement(By.id("doc_practiceName")).sendKeys("Michelle Platini" + currentTime);
		
        
		driver.findElement(By.id("doc_address")).clear();
		driver.findElement(By.id("doc_address")).sendKeys("445 Preakness Ave" + currentTime);
		
		
		driver.findElement(By.id("doc_city")).clear();
		driver.findElement(By.id("doc_city")).sendKeys("Totowa" + currentTime);
		
		
		WebElement list_by_state = driver.findElement(By.name("doc_state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");
		
		
		driver.findElement(By.id("doc_zipCode")).clear();
		driver.findElement(By.id("doc_zipCode")).sendKeys("07522" + currentTime);
			

		driver.findElement(By.id("doc_phone")).clear();
		driver.findElement(By.id("doc_phone")).sendKeys("8221234383" + currentTime);
		
		
		driver.findElement(By.name("apply-step-two-submit")).click();
		
		

		
		
	}

	@Then("^I confirm the info$")
	public void i_confirm_the_info() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//h1[text()='Please Confirm This Information Is Correct']"));

		System.out.println(element.getText());
		
		
		
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[2]"));

		System.out.println(element1.getText());
		
		
		
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[4]"));

		System.out.println(element2.getText());
		
		
		
		WebElement element3 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[3]"));

		System.out.println(element3.getText());
		
		
		WebElement element4 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[5]"));

		System.out.println(element4.getText());



		
		
		
	}

	@Then("^I select the check box$")
	public void i_select_the_check_box() throws Throwable {


		driver.findElement(By.xpath(".//*[@id='container']/form/p[44]/span[1]/label/span")).click();
		
		
	}

	@Then("^click on confirm button$")
	public void click_on_confirm_button() throws Throwable {

		
		driver.findElement(By.id("submit")).click();

		
		
	}


	

}
