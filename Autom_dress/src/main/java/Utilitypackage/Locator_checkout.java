package Utilitypackage;

import org.openqa.selenium.By;

public class Locator_checkout {
public static final By BUTTON_CHART = By.xpath("//a[@title='Proceed to checkout']");
public static final By BUTTON_CHECKOUT = By.xpath("//a[@id='button_order_cart']");
public static final By DETAILS_TAX = By.xpath("//td[@id='total_tax']");
public static final By BUTTON_PROCEEDCT = By.xpath("//p//a[@title='Proceed to checkout']");
public static final By TEXT_EMAIL_EX= By.xpath("//input[@id='email']");
public static final By TEXT_PASSW_EX= By.xpath("//input[@id='passwd']");
public static final By BUTTON_SIGNIN = By.xpath("//button[@id='SubmitLogin']");
public static final By BUTTON_UPDATE_DELADD = By.xpath("//ul[@id='address_delivery']//a");
public static final By TEXT_ADD_UP = By.xpath("//input[@id='address1']");
public static final By TEXT_CITY_UP = By.xpath("//input[@id='city']");

public static final By BUTTON_SAVE_UP = By.xpath("//button[@id='submitAddress']");
public static final By BUTTON_PCHECKOUT = By.xpath("//button[@name='processAddress']");

public static final By CHECKBOX_TERMS = By.xpath("//input[@id='cgv']");
public static final By BUTTON_PROCEEDCK = By.xpath("//p//button[@type='submit']");


}
