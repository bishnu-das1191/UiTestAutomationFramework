package com.ui.dataProviders;

import com.ui.pojos.UserTestData;
import com.ui.utilities.CSVReaderUtility;
import org.testng.annotations.DataProvider;

import java.util.Iterator;

public class LoginDataProvider {
	
	@DataProvider(name = "LoginTestCSVDataProvider")
	public Iterator<UserTestData> loginCSVDataprovider() {
		return CSVReaderUtility.readCSVFile("loginData.csv");
	}
}
