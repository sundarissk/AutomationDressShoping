package AutomDress;

import static Utilitypackage.Locator_add_cart.BUTTON_ADD_DRESS;
import static Utilitypackage.Locator_add_cart.BUTTON_CLOSE_CROSS;
import static Utilitypackage.Locator_add_cart.BUTTON_SEARCH;
import static Utilitypackage.Locator_add_cart.MOUSE_TARGET;
import static Utilitypackage.Locator_add_cart.TEXT_SEARCH;
import static Utilitypackage.Locator_checkout.BUTTON_CHART;
import static Utilitypackage.Locator_checkout.BUTTON_PCHECKOUT;
import static Utilitypackage.Locator_checkout.BUTTON_PROCEEDCK;
import static Utilitypackage.Locator_checkout.BUTTON_PROCEEDCT;
import static Utilitypackage.Locator_checkout.BUTTON_SAVE_UP;
import static Utilitypackage.Locator_checkout.BUTTON_UPDATE_DELADD;
import static Utilitypackage.Locator_checkout.CHECKBOX_TERMS;
import static Utilitypackage.Locator_checkout.DETAILS_TAX;
import static Utilitypackage.Locator_checkout.TEXT_ADD_UP;
import static Utilitypackage.Locator_checkout.TEXT_CITY_UP;
import static Utilitypackage.Locator_compare_dress.BUTTON_ADDC;
import static Utilitypackage.Locator_compare_dress.BUTTON_COMPARE1;
import static Utilitypackage.Locator_compare_dress.BUTTON_COMPARE2;
import static Utilitypackage.Locator_compare_dress.BUTTON_COMPARE_FINAL;
import static Utilitypackage.Locator_compare_dress.BUTTON_TRASH;
import static Utilitypackage.Locator_compare_dress.MOUSE_TARGET_PD;
import static Utilitypackage.Locator_compare_dress.MOUSE_TARGET_SS;
import static Utilitypackage.Locator_compare_dress.PRICE_FIR;
import static Utilitypackage.Locator_compare_dress.PRICE_SEC;
import static Utilitypackage.Locator_dress_ur.BUTTON_CREATE;
import static Utilitypackage.Locator_dress_ur.BUTTON_REGISTER;
import static Utilitypackage.Locator_dress_ur.BUTTON_SIGNIN;
import static Utilitypackage.Locator_dress_ur.DROP_STATE;
import static Utilitypackage.Locator_dress_ur.RADIO_MRS;
import static Utilitypackage.Locator_dress_ur.SELECT_COUNTRY;
import static Utilitypackage.Locator_dress_ur.TEXT_ADDRESS;
import static Utilitypackage.Locator_dress_ur.TEXT_ALIAS;
import static Utilitypackage.Locator_dress_ur.TEXT_CITY;
import static Utilitypackage.Locator_dress_ur.TEXT_EMAILID;
import static Utilitypackage.Locator_dress_ur.TEXT_FIRSTNAME;
import static Utilitypackage.Locator_dress_ur.TEXT_FNAME_ADDRESS;
import static Utilitypackage.Locator_dress_ur.TEXT_LASTNAME;
import static Utilitypackage.Locator_dress_ur.TEXT_LNAME_ADDRESS;
import static Utilitypackage.Locator_dress_ur.TEXT_MOBILE;
import static Utilitypackage.Locator_dress_ur.TEXT_PASSWORD;
import static Utilitypackage.Locator_dress_ur.TEXT_ZIP;
import static Utilitypackage.Locator_payment.BUTTON_ACCOUNT;
import static Utilitypackage.Locator_payment.BUTTON_CONFIRM;
import static Utilitypackage.Locator_payment.BUTTON_LOGOUT;
import static Utilitypackage.Locator_payment.BUTTON_ORDER_HISTORY;
import static Utilitypackage.Locator_payment.BUTTON_PAYCHECK;
import static Utilitypackage.Locator_payment.DETAILS_ORDERREF;
import static Utilitypackage.Locator_payment.DETAILS_PRICE;
import static Utilitypackage.Locator_payment.DETAILS_STATUS;
import static Utilitypackage.Locator_payment.DETAILS_TOTAL_AMOUNT;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_register {

	static WebDriver driver = null;

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/skuma/eclipse-workspace/Autom_dress/src/test/resources/driver/chromedriver.exe");

		ChromeOptions chOptions = new ChromeOptions();
		chOptions.setImplicitWaitTimeout(Duration.ofSeconds(10));
		chOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chOptions.setAcceptInsecureCerts(true);

		driver = new ChromeDriver(chOptions);

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

	}

	public void first_register() {

		driver.findElement(BUTTON_SIGNIN).click();

		String emailran = RandomStringUtils.randomAlphabetic(5, 7);

		driver.findElement(TEXT_EMAILID).sendKeys(emailran + "@gmail.com");

		driver.findElement(BUTTON_CREATE).click();

		System.out.println("Registration page open");
		System.out.println("EmailId Entered : " + emailran + "@gmail.com");

		System.out.println("New User has to create an account");

	}

	public void new_register_form() throws InterruptedException {

		WebElement radio_local1 = driver.findElement(RADIO_MRS);
		radio_local1.click();

		String fname = RandomStringUtils.randomAlphabetic(3, 7);
		driver.findElement(TEXT_FIRSTNAME).sendKeys(fname);

		String lname = RandomStringUtils.randomAlphabetic(3, 5);
		driver.findElement(TEXT_LASTNAME).sendKeys(lname);

		String pword = RandomStringUtils.randomAlphanumeric(5, 8);
		driver.findElement(TEXT_PASSWORD).sendKeys(pword);

		String fnameadd = RandomStringUtils.randomAlphabetic(7);
		driver.findElement(TEXT_FNAME_ADDRESS).sendKeys(fnameadd);

		String lnameadd = RandomStringUtils.randomAlphabetic(4);
		driver.findElement(TEXT_LNAME_ADDRESS).sendKeys(lnameadd);

		String address = RandomStringUtils.randomAlphabetic(10);
		driver.findElement(TEXT_ADDRESS).sendKeys(address);

		String city = RandomStringUtils.randomAlphabetic(7);
		driver.findElement(TEXT_CITY).sendKeys(city);

		WebElement dropelest = driver.findElement(DROP_STATE);
		Select drpst = new Select(dropelest);
		drpst.selectByVisibleText("Mississippi");

		String zipc = RandomStringUtils.randomNumeric(5);
		driver.findElement(TEXT_ZIP).sendKeys(zipc);

		WebElement dropelecountry = driver.findElement(SELECT_COUNTRY);
		Select drpcon = new Select(dropelecountry);
		drpcon.selectByIndex(1);

		String pno = RandomStringUtils.randomNumeric(10);
		driver.findElement(TEXT_MOBILE).sendKeys(pno);

		String aliasadd = RandomStringUtils.randomAlphabetic(10);
		driver.findElement(TEXT_ALIAS).sendKeys(aliasadd);
		driver.findElement(BUTTON_REGISTER).click();

		System.out.println("Registration Sucessfully completed");
	}

	public void add_summer_dress() {
		driver.findElement(TEXT_SEARCH).sendKeys("Summer Dresses");
		driver.findElement(BUTTON_SEARCH).click();

		

		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(MOUSE_TARGET);
		actions.moveToElement(target).perform();

		driver.findElement(BUTTON_ADD_DRESS).click();
		

		driver.findElement(BUTTON_CLOSE_CROSS).click();

		System.out.println("Summer dress sucessfully added to the Cart");

	}

	public void compare_dress() throws InterruptedException {

		driver.findElement(TEXT_SEARCH).clear();

		driver.findElement(TEXT_SEARCH).sendKeys("Faded Short Sleeve T-shirts");
		driver.findElement(BUTTON_SEARCH).click();

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(MOUSE_TARGET_SS));

		Actions act = new Actions(driver);
		WebElement tarss = driver.findElement(MOUSE_TARGET_SS);
		act.moveToElement(tarss).perform();

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(BUTTON_COMPARE1));

		driver.findElement(BUTTON_COMPARE1).click();

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(BUTTON_COMPARE1));
		System.out.println("Dress 1 added in compare list");

		driver.findElement(TEXT_SEARCH).clear();

		driver.findElement(TEXT_SEARCH).sendKeys("Printed Dress");

		driver.findElement(BUTTON_SEARCH).click();

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(MOUSE_TARGET_PD));

		Actions actm = new Actions(driver);
		WebElement tarpd = driver.findElement(MOUSE_TARGET_PD);
		actm.moveToElement(tarpd).perform();

		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(BUTTON_COMPARE2));

		driver.findElement(BUTTON_COMPARE2).click();

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(BUTTON_COMPARE2));

		System.out.println("Dress 2 added in compare list");

		Actions actcom = new Actions(driver);
		WebElement comget = driver.findElement(BUTTON_COMPARE_FINAL);
		actcom.moveToElement(comget).perform();

		driver.findElement(BUTTON_COMPARE_FINAL).click();

		System.out.println("Time to Compare");

	}

	public void higest_price() {
		String dress1 = driver.findElement(PRICE_FIR).getText().replace('$', ' ');
		String dress2 = driver.findElement(PRICE_SEC).getText().replace('$', ' ');

		System.out.println("Dress1 Price:" + dress1);
		System.out.println("Dress2 Price:" + dress2);

		Float Val1 = Float.valueOf(dress1).floatValue();
		Float Val2 = Float.valueOf(dress2).floatValue();

		System.out.println("Dress1 FPrice:" + Val1);
		System.out.println("Dress2 FPrice:" + Val2);

		if (Val1 < Val2) {

			driver.findElement(BUTTON_TRASH).click();

			driver.findElement(BUTTON_ADDC).click();

			new WebDriverWait(driver, Duration.ofSeconds(10))
					.until(ExpectedConditions.elementToBeClickable(BUTTON_CLOSE_CROSS));

			System.out.println("Dress2 Added to cart");

		}

	}

	public void checkout() {

		driver.findElement(BUTTON_CHART).click();

		String ttax = driver.findElement(DETAILS_TAX).getText();

		driver.findElement(BUTTON_PROCEEDCT).click();

		driver.findElement(BUTTON_UPDATE_DELADD).click();

		String upadd = RandomStringUtils.randomAlphabetic(7);
		driver.findElement(TEXT_ADD_UP).sendKeys(upadd);

		String upcity = RandomStringUtils.randomAlphabetic(6);
		driver.findElement(TEXT_CITY_UP).sendKeys(upcity);

		System.out.println("Address update sucessfully");

		driver.findElement(BUTTON_SAVE_UP).click();

		driver.findElement(BUTTON_PCHECKOUT).click();

		driver.findElement(CHECKBOX_TERMS).click();

		driver.findElement(BUTTON_PROCEEDCK).click();

		System.out.println("Tax : " + ttax);
		System.out.println("Checkout Completed, Proceed to Payment");

	}

	public void payment_logout() {

		String TotalAmy = driver.findElement(DETAILS_TOTAL_AMOUNT).getText();
		System.out.println("Total Amount Need to pay :" + TotalAmy);

		driver.findElement(BUTTON_PAYCHECK).click();
		driver.findElement(BUTTON_CONFIRM).click();
		// String refn1 =
		// driver.findElement(BUTTON_READ_REFERENCE).getAttribute("textcontent");

		// System.out.println("Reference Number:" + refn1);

		driver.findElement(BUTTON_ACCOUNT).click();
		driver.findElement(BUTTON_ORDER_HISTORY).click();
		String ordernumber = driver.findElement(DETAILS_ORDERREF).getText();
		String orderprice = driver.findElement(DETAILS_PRICE).getText();
		String orderstatus = driver.findElement(DETAILS_STATUS).getText();

		System.out.println("Order Number :" + ordernumber);
		System.out.println("Total price :" + orderprice);
		System.out.println("Order Status :" + orderstatus);

		driver.findElement(BUTTON_LOGOUT).click();

		System.out.println("Oder sucessfully placed, Action Completed  ");

	}

	public static void main(String[] args) throws InterruptedException {
		User_register run = new User_register();
		run.first_register();
		run.new_register_form();
		run.add_summer_dress();

		run.compare_dress();
		run.higest_price();
		run.checkout();
		run.payment_logout();

		driver.quit();
	}

}
