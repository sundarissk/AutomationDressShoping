package Utilitypackage;

import org.openqa.selenium.By;

public class Locator_compare_dress {
	public static final By MOUSE_TARGET_SS =By.xpath("//div[@class='product-image-container']");

	public static final By BUTTON_COMPARE1 =By.xpath("//li//a[@class='add_to_compare']");

	public static final By  MOUSE_TARGET_PD=By.xpath("//ul[@class='product_list grid row']//li[5]//img");

	public static final By  BUTTON_COMPARE2 =By.xpath("//li[5]//div//a[@class='add_to_compare']");

	public static final By BUTTON_COMPARE_FINAL =By.xpath("//div[@class='bottom-pagination-content clearfix']//button");

	public static final By PRICE_FIR =By.xpath("//tr//td[2]//div[@class='prices-container']//span");

	public static final By PRICE_SEC =By.xpath("//tr//td[3]//div[@class='prices-container']//span");

	public static final By  BUTTON_ADDC =By.xpath("//div[@class='button-container']//a[contains(@data-id-product,'3')]");

	public static final By  BUTTON_TRASH=By.xpath("//div[@class='remove']//a[contains(@data-id-product,'1')]");

}
