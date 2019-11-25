package com.whygere.BaseUrl;

import com.whygere.MainPage.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.whygere.MainPage.Registration;
//import MainPage.Registration;

public class LaunchUrl {

	WebDriver driver;

	String email = "ptggroup1500@gmail.com";
	protected String psw = "Ptg@1234";

	@Test
	public void LaunchBrowser() throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://15.206.16.180/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println("WHYgere Application launched successfully");

		Registration re = new Registration(driver);
		re.regDetails(email, psw);

//		Login login = new Login(driver);
//		login.Loginpage(email,psw);


	}

}
