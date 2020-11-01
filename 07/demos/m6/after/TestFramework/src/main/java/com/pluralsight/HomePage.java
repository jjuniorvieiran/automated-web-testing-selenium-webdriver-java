package com.pluralsight;

//TestFramework where there are: test configuration, page, elements, title name and so on
public class HomePage {

	static String url = "http://www.pluralsight.com";
	static String title = "Pluralsight | Unlimited Online Developer, IT and Creative Training";
	
	public void goTo() {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
