package Utilitypackage;

import org.openqa.selenium.By;

public class Locator_add_cart {
	public static final By TEXT_SEARCH = By.xpath("//input[@id='search_query_top']");
	public static final By BUTTON_SEARCH = By.xpath("//button[@name='submit_search']");
	public static final By MOUSE_TARGET = By.xpath("//li[3]//div[@class='left-block']//img");

	public static final By BUTTON_ADD_DRESS = By
			.xpath("//div[@class='button-container']//a[contains(@data-id-product,'7')]");

	public static final By BUTTON_CLOSE_CROSS = By.xpath("//span[@class='cross']");

}
