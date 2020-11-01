package com.pluralsight;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

//Tests where call the page and has the assertions
public class UnitTest {

	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	public void canGoToJavaPathPage() {
		Pages.pathPages().goTo();
		PathPage pathPage = Pages.pathPages().getPathPage("Java");
		pathPage.goTo();
		Assert.assertTrue(pathPage.isAtPathPage("Java"));
	}
	
	@AfterClass
	public static void cleanUp() {
		Browser.close();
	}

}
