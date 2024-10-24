package pgmfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class register {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement sign_up;
	@FindBy(xpath="/html/body/section/div/div/div[3]/div/form/input[2]")
	WebElement Username;
	@FindBy(xpath="/html/body/section/div/div/div[3]/div/form/input[3]")
	WebElement Email;
	@FindBy(xpath="/html/body/section/div/div/div[3]/div/form/button")
	WebElement signup_button;
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	WebElement mr_button;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement date_DOB;
	@FindBy(xpath="//*[@id=\"months\"]")
	WebElement month_DOB;
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement year_DOB;
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement news_letter;
	@FindBy(xpath="//*[@id=\"optin\"]")
	WebElement special_offer;
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement fullname;
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement company_name;
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address;
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement country;
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement zipcode;
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement mobilenumber;
	@FindBy(xpath="/html/body/section/div/div/div/div[1]/form/button")
	WebElement create_button;
	@FindBy(xpath="/html/body/section/div/div/div/div/a")
	WebElement countinue;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement log_out_button;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement product_button;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/form/input[2]")
	WebElement login_email;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/form/input[3]")
	WebElement login_password;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/form/button")
	WebElement login_button;
	@FindBy(xpath="//*[@id=\"search_product\"]")
	WebElement search_field;
	@FindBy(xpath="//*[@id=\"submit_search\"]")
	WebElement search_button;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
	WebElement view_button;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement add_to_cart_button;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")
	WebElement con_to_shop_button;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/ul/li[3]/a/i")
	WebElement cart_button;
	@FindBy(xpath="/html/body/section/div/section/div[1]/div/div/a")
	WebElement procced_to_checkout_button;
	@FindBy(xpath="/html/body/section/div/div[7]/a")
	WebElement procced_to_payment_button;
	@FindBy(xpath="/html/body/section/div/div[3]/div/div[2]/form/div[1]/div/input")
	WebElement name_on_card_field;
	@FindBy(xpath="/html/body/section/div/div[3]/div/div[2]/form/div[2]/div/input")
	WebElement card_number_field;
	@FindBy(xpath="/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[1]/input")
	WebElement cvc_field;
	@FindBy(xpath="/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[2]/input")
	WebElement expiration_mm_field;
	@FindBy(xpath="/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[3]/input")
	WebElement expiration_yyyy_field;
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement pay_confirm_buttton;
	@FindBy(xpath="/html/body/section/div/div/div/div/a")
	WebElement countinue_after_pay_buttton;
	@FindBy(xpath="/html/body/section/div/div[6]/textarea")
	WebElement order_description_field;
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[33]/div/div[2]/ul/li/a")
	WebElement saree;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")
	WebElement account_deletion;
	@FindBy(xpath="/html/body/section/div/div/div/div/a")
	WebElement completion_deletion;
	
	
	
	public register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signup_page() 
	{
		sign_up.click();
	}
    public void signup_details(String username, String email)
    {
    	Username.sendKeys(username);
    	Email.sendKeys(email);
    	
    }
    public void signup() 
    {
    	signup_button.click();
    }
    public void user_details() 
    {
    	mr_button.click();
    }
    public void details(String pass )
    {
    	password.sendKeys(pass);
    }
    public void DOB() 
    {
    	Select day=new Select(date_DOB);
    	day.selectByValue("10");
    	
    	Select month=new Select(month_DOB);
    	month.selectByValue("2");
    	
    	Select year=new Select(year_DOB);
    	year.selectByValue("2002");
    	
    	news_letter.click();
    	special_offer.click();
    	
    }
    
    public void details_02(String fname, String lname,String cname, String ad ) 
    {
    	fullname.sendKeys(fname);
    	lastname.sendKeys(lname);
    	company_name.sendKeys(cname);
    	address.sendKeys(ad);
    }
    public void country_selection()
    {
    	Select con=new Select(country);
    	con.selectByValue("India");
    }
    
    public void details_03(String st, String ci,int zi, int mob)
    {;
    	state.sendKeys(st);
    	city.sendKeys(ci);
    	zipcode.sendKeys(String.valueOf(zi));
    	mobilenumber.sendKeys(String.valueOf(mob));
     }
    public void account_creation_button()
    {
    	create_button.click();
    	countinue.click();
    	log_out_button.click();
    }
    public void login(String Username, String psw) 
    {
    	
    	login_email.sendKeys(Username);
    	login_password.sendKeys(psw);
    }
    public void login_button() 
    {
    	login_button.click();
    	product_button.click();
    	
    }
    public void sareee() throws InterruptedException 
    {
    	saree.click();
    	add_to_cart_button.click();
    	Thread.sleep(3000);
    	con_to_shop_button.click();
    	cart_button.click();
    	product_button.click();
    	
    }
    public void search(String search) 
    {
    	search_field.sendKeys(search);
    }
    
    public void search_function() throws InterruptedException 
    {
    	search_button.click();
    	view_button.click();
    	add_to_cart_button.click();
    	Thread.sleep(3000);
    	con_to_shop_button.click();
    	cart_button.click();
    	product_button.click();
    }
    public void search_02(String search) 
    {
    	search_field.sendKeys(search);
    }
    public void search_function_02() throws InterruptedException 
    {
    	search_button.click();
    	view_button.click();
    	add_to_cart_button.click();
    	Thread.sleep(3000);
    	con_to_shop_button.click();
    	cart_button.click();
    	product_button.click();

    }
    public void search_03(String search) 
    {
    	search_field.sendKeys(search);
    }
    public void search_function_03() throws InterruptedException 
    {
    	search_button.click();
    	view_button.click();
    	add_to_cart_button.click();
    	Thread.sleep(3000);
    	con_to_shop_button.click();
    	cart_button.click();
    	product_button.click();
    	cart_button.click();
    	procced_to_checkout_button.click();
    }
    
    public void check_out_function(String nameoncard, int cardnumber, int cvc, int monthofexpire, int yearofex ) 
    {
    	procced_to_payment_button.click();
    	name_on_card_field.sendKeys(nameoncard);
    	card_number_field.sendKeys(String.valueOf(cardnumber));
    	cvc_field.sendKeys(String.valueOf(cvc));
    	expiration_mm_field.sendKeys(String.valueOf(monthofexpire));
    	expiration_yyyy_field.sendKeys(String.valueOf(yearofex));
    	pay_confirm_buttton.click();
    	countinue_after_pay_buttton.click();
    }
    public void deletion() 
    {
    	account_deletion.click();
    	completion_deletion.click();
    }



}
	