package sTEPDefinatioN;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VoucharProgramTest {

	public static WebDriver driver;

	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^I type pulmozymesupport page$")
	public void i_type_pulmozymesupport_page() throws Throwable {

		driver.get("https://www.pulmozymesupport.com");

	}

	@Given("^I click on Appply now$")
	public void i_click_on_Appply_now() throws Throwable {

		driver.findElement(By.xpath("//a[text()='APPLY NOW']")).click();

	}

	@Given("^I select I am a patient$")
	public void i_select_I_am_a_patient() throws Throwable {

		driver.findElement(By.xpath("//span[@class='checkmark']")).click();

	}

	@Given("^I click next$")
	public void i_click_next() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='agree']")).click();

	}

	@Given("^I select first time taking Pulmozyme voucher & click next button$")
	public void i_select_first_time_taking_Pulmozyme_voucher_click_next_button() throws Throwable {

		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@Given("^I select the valid Eligibility answare & click next$")
	public void i_select_the_valid_Eligibility_answare_click_next() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[1]/td[2]/p[2]/label/span")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[2]/td[2]/p[2]/label/span")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td[2]/p[2]/label/span")).click();

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[5]/td[2]/p[3]/label/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[6]/td[2]/p[2]/label/span")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[7]/td[2]/p[5]/label/span")).click();
		
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		

	}

	@When("^I fillup the Patient information$")
	public void i_fillup_the_Patient_information() throws Throwable {
		
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Stacy" + currentTime);
		
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Adams" + currentTime);
		
		WebElement list_by_gender = driver.findElement(By.name("sex"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("F");
		
		
		
		
		driver.findElement(By.xpath("//span[1][@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		
		WebElement list_by_month = driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[1]/select"));
		Select List_by_Month = new Select(list_by_month);

		List_by_Month.selectByValue("5");
		
		
		
		
        driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[2]/div/span/a/span[1]")).click();
		
		WebElement list_by_day = driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[2]/select"));
		Select List_by_Day = new Select(list_by_day);

		List_by_Day.selectByValue("15");
		
		
		
		  driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[3]/div/span/a/span[1]")).click();
			
			WebElement list_by_year = driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[3]/select"));
			Select List_by_Year = new Select(list_by_year);

			List_by_Year.selectByValue("1974");

		
		
		
		//Month
		
		//driver.findElement(By.xpath("//span[1][@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();

		//List<WebElement> dropdown_menu = driver.findElements(By.xpath(".//*[@id='container']/form/p[4]/span[1]/select"));

		//for (WebElement element : dropdown_menu) {

			//String innerhtml = element.getAttribute("innerHTML");

			//if (innerhtml.contentEquals("May")) {
			//element.click();

				//break;

			//}

			//System.out.println("values from dropdown is =====" + innerhtml);

		//}

         
		
		//Day
		
		
		//driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[2]/div/span/a/span[1]")).click();

		//List<WebElement> dropdown_menu1 = driver.findElements(By.xpath(".//*[@id='container']/form/p[4]/span[2]/select"));

		//for (WebElement element : dropdown_menu1) {

			//String innerhtml = element.getAttribute("innerHTML");

			//if (innerhtml.contentEquals("15")) {
			//element.click();

				//break;

			//}

			//System.out.println("values from dropdown is =====" + innerhtml);

		//}
		
	//Year
		
		//driver.findElement(By.xpath(".//*[@id='container']/form/p[4]/span[3]/div/span/a/span[1]")).click();

		//List<WebElement> dropdown_menu2 = driver.findElements(By.xpath(".//*[@id='container']/form/p[4]/span[3]/select"));

		//for (WebElement element : dropdown_menu2) {

			//String innerhtml = element.getAttribute("innerHTML");

			//if (innerhtml.contentEquals("15")) {
			//element.click();

				//break;

			//}

			//System.out.println("values from dropdown is =====" + innerhtml);

		//}
		
		
		
		
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("16 Clearman Pl" + currentTime);
		
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Belleville" + currentTime);
		
		
		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");
		
		
		
		driver.findElement(By.id("zipCode")).clear();
		driver.findElement(By.id("zipCode")).sendKeys("07109" + currentTime);
		
		driver.findElement(By.id("homePhone")).clear();
		driver.findElement(By.id("homePhone")).sendKeys("9734542323" + currentTime);
		
		driver.findElement(By.id("SocialSecurityNumber")).clear();
		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("1234" + currentTime);
		
		
		driver.findElement(By.className("checkmark")).click();
		
		driver.findElement(By.xpath(".//*[@id='radio_group']/label/span")).click();
		
		
		
		driver.findElement(By.name("email_address")).clear();
		driver.findElement(By.name("email_address")).sendKeys("andycole123@yahoo.com" + currentTime);
		
		
		

	}

	@When("^I fillup the Insurance info$")
	public void i_fillup_the_Insurance_info() throws Throwable {
		
		
		long currentTime = System.currentTimeMillis();
		
		
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
		
		
		driver.findElement(By.name("login_id")).clear();
		driver.findElement(By.name("login_id")).sendKeys("andycole123@yahoo.com" + currentTime);	
		
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Madonna#00007" + currentTime);
		
		
		driver.findElement(By.name("password2")).clear();
		driver.findElement(By.name("password2")).sendKeys("Madonna#00007" + currentTime);
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[31]/button")).click();
		
		

	}

	@When("^I fillup the doctors info$")
	public void i_fillup_the_doctors_info() throws Throwable {
		
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

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		
		
		driver.findElement(By.name("apply-step-two-submit")).click();
		

	}

	@Then("^I verify Confirm The Information page$")
	public void i_verify_Confirm_The_Information_page() throws Throwable {
		
		
		WebElement element = driver.findElement(By.xpath("//h1[text()='Please Confirm This Information Is Correct']"));

		System.out.println(element.getText());
		
		
		
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[2]"));

		System.out.println(element1.getText());
		
		
		
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='container']/form/h2[4]"));

		System.out.println(element2.getText());
		
	

	}

	@Then("^I click on check box & click on confirm button$")
	public void i_click_on_check_box_click_on_confirm_button() throws Throwable {
		
	 
		driver.findElement(By.xpath("//span[@class='correct']/label[@class='checkbox' and 1]/span[@class='checkmark' and 1]")).click();
		
		driver.findElement(By.id("submit")).click();

	}

}
