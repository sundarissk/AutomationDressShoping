package Utilitypackage;

import org.openqa.selenium.By;

public class Locator_payment {
	public static final By DETAILS_TOTAL_AMOUNT = By.xpath("//td[@id='total_price_container']//span");
	public static final By BUTTON_PAYCHECK = By.xpath("//p//a[@title='Pay by check.']");
	public static final By BUTTON_CONFIRM = By.xpath("//p//button[@type='submit']");
	public static final By BUTTON_READ_REFERENCE = By.xpath("//div//br[3]");
	public static final By BUTTON_ACCOUNT = By.xpath("//div//a[@class='account']");
	public static final By BUTTON_ORDER_HISTORY = By.xpath("//div//a[@title='Orders']");
	public static final By DETAILS_ORDERREF = By.xpath("//tr[@class='first_item ']//td[1]//a");
	public static final By DETAILS_PRICE = By.xpath("//tr[@class='first_item ']//td[3]//span");
	public static final By DETAILS_STATUS = By.xpath("//tr[@class='first_item ']//td[5]//span");
	public static final By BUTTON_LOGOUT = By.xpath("//a[@class='logout']");
}
