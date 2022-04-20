package Utilitypackage;

import org.openqa.selenium.By;

public class Locator_dress_ur {
	public static final By BUTTON_SIGNIN = By.xpath("//div[@class='header_user_info']//a");
	public static final By TEXT_EMAILID = By.xpath("//input[@id='email_create']");
	public static final By BUTTON_CREATE = By.xpath("//div[@class='submit']//button");
	static final By RADIO_MR = By.xpath("//div//input[@id='id_gender1']");
	public static final By RADIO_MRS = By.xpath("//div//input[@id='id_gender2']");
	public static final By TEXT_FIRSTNAME = By.xpath("//div//input[@id='customer_firstname']");
	public static final By TEXT_LASTNAME = By.xpath("//div//input[@id='customer_lastname']");
	public static final By TEXT_EMAIL = By.xpath("//div//input[@id='email']");
	public static final By TEXT_PASSWORD = By.xpath("//div//input[@id='passwd']");
	public static final By DROP_DAYS = By.xpath("//div//select[@id='days']");
	public static final By DROP_MONTH = By.xpath("//div//select[@id='months']");
	public static final By DROP_YEAR = By.xpath("//div//select[@id='years']");
	public static final By CHECK_NEWOFFER = By.xpath("//input[@type='checkbox']");
	public static final By TEXT_FNAME_ADDRESS = By.xpath("//input[@id='firstname']");
	public static final By TEXT_LNAME_ADDRESS = By.xpath("//input[@id='lastname']");

	public static final By TEXT_ADDRESS = By.xpath("//input[@id='address1']");

	public static final By TEXT_CITY = By.xpath("//input[@id='city']");

	public static final By DROP_STATE = By.xpath("//select[@id='id_state']");

	public static final By TEXT_ZIP = By.xpath("//input[@id='postcode']");

	public static final By SELECT_COUNTRY = By.xpath("//SELECT[@id='id_country']");

	public static final By TEXT_MOBILE = By.xpath("//input[@id='phone_mobile']");

	public static final By TEXT_ALIAS = By.xpath("//input[@id='alias']");
	public static final By BUTTON_REGISTER = By.xpath("//button[@id='submitAccount']");

}
