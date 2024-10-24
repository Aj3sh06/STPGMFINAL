package pgmfinal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class tests {
	WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new FirefoxDriver();
		driver.get("https://www.automationexercise.com");
	}
	@Test
	public void execution() throws InterruptedException
	{
		register ob=new register(driver);
		ob.signup_page();
		ob.signup_details("ajesh","aasaksekemmm2613666@adosnan.com");
		ob.signup();
		ob.user_details();
		ob.details("ajesh@9961");
		ob.DOB();
		ob.details_02("Mark","john","amazon", "8405 Old James St.Rochester, NY 14609");
		ob.country_selection();
		ob.details_03("kerala","kottayam", 686501, 75610619);
		ob.account_creation_button();
		ob.login("aasaksekemmm2613666@adosnan.com","ajesh@9961");
		ob.login_button();
		ob.sareee();
		ob.search("Tshirt");
		ob.search_function();
		ob.search_02("Sleeveless");
		ob.search_function_02();
		ob.search_03("kids");
		ob.search_function_03();
		ob.check_out_function("MARk",2255,101,02,2028);
		ob.deletion();
	}
	




}
	