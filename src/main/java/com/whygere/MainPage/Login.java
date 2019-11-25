package com.whygere.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;

	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	By LoginButton = By.xpath("//button[@class='btn']");

	public Login(WebDriver driver) {

		this.driver = driver;

	}

	public void Loginpage(String userid, String pswd) throws Exception {

		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pswd);

		// Login button method calling
		clickLogin();
	}

	public void clickLogin() throws Exception {

		// Click on Login button
		driver.findElement(LoginButton).click();
		Thread.sleep(2000);
		System.out.println("User login successfully");

		// Settings class method calling
		Settings settings = new Settings();
		settings.settingsPage(driver);

	}

	public void Logout() throws Exception {


		WebDriverWait wb = new WebDriverWait(driver, 20);
		wb.until(ExpectedConditions.elementToBeClickable(By.id("logout-menu"))).click();

		System.out.println("Click on logout link");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout successfully");

		Thread.sleep(1000);
		driver.close();


	}

}
