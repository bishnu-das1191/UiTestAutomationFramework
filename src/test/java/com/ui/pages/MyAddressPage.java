package com.ui.pages;

import com.ui.pojos.MyAddressPOJO;
import com.ui.utilities.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressPage extends BrowserUtility{

	public MyAddressPage(WebDriver driver) {
		super(driver);
	}
	private static final By COMPNAY_TEXTBOX_LOCATOR= By.id("company");
	private static final By ADDRESS1_TEXTBOX_LOCATOR= By.id("address1");
	private static final By ADDRESS2_TEXTBOX_LOCATOR= By.id("address2");
	private static final By CITY_TEXTBOX_LOCATOR= By.id("city");
	private static final By ZIP_TEXTBOX_LOCATOR=By.id("postcode");
	private static final By HOME_PHONE_TEXTBOX_LOCATOR=By.id("phone");
	private static final By MOBILE_PHONE_TEXTBOX_LOCATOR=By.id("phone_mobile");
	private static final By ADDITIONAL_INFORMATION_TEXTBOX_LOCATOR=By.id("other");
	private static final By ADDRESS_ALIAS_TEXTBOX_LOCATOR=By.id("alias");
	private static final By STATE_DROPDOWN_LOCATOR=By.id("id_state");
	private static final By SAVE_ADDRESS_BUTTON_LOCATOR= By.id("submitAddress");
	private static final By ADDRESS_HEADING= By.tagName("h3");
	
	
	public String saveAddressWithVariablesForFaker(MyAddressPOJO address) {
		enterText(COMPNAY_TEXTBOX_LOCATOR,address.getCompany());
		enterText(ADDRESS1_TEXTBOX_LOCATOR,address.getAddressLine1());
		enterText(ADDRESS2_TEXTBOX_LOCATOR,address.getAddressLine2());
		enterText(CITY_TEXTBOX_LOCATOR,address.getCity());
		enterText(ZIP_TEXTBOX_LOCATOR,address.getZip());
		enterText(HOME_PHONE_TEXTBOX_LOCATOR,address.getHomePhoneNumber());
		enterText(MOBILE_PHONE_TEXTBOX_LOCATOR,address.getMobilePhoneNumber());
		enterText(ADDITIONAL_INFORMATION_TEXTBOX_LOCATOR,address.getAdditionalInformation());
		clearText(ADDRESS_ALIAS_TEXTBOX_LOCATOR);
		enterText(ADDRESS_ALIAS_TEXTBOX_LOCATOR, address.getAddressAlias());
		selectFromDropdown(STATE_DROPDOWN_LOCATOR,address.getState());
		clickOn(SAVE_ADDRESS_BUTTON_LOCATOR);
		String newAddress=getStringValue(ADDRESS_HEADING);
		return newAddress;
		
	}}
	
	
	
