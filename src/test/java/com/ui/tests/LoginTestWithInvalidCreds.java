package com.ui.tests;

import com.ui.pojos.UserTestData;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners({com.ui.listeners.TestListner.class})
public class LoginTestWithInvalidCreds  extends TestBase{
	
	@Test
	(description = "Verify proper error message is shown when the user try to login with invalid credentials", 
	groups = { "e2e","sanity" },
	dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, 
	dataProvider = "LoginTestCSVDataProvider")
	
	public void LoginCSVTestWithInvalidCreds(UserTestData user) {

		assertEquals(hp.goToLoginPage().doLoginWithInvalidCredentials(user.getEmailAddress(), user.getPassword()).getErrorMessage(),
				"Authentication failed.");

	}

}