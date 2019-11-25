package com.whygere.BaseUrl;

import com.whygere.MainPage.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest {
    WebDriver driver;

    @Test
    public void testLogin() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://15.206.16.180/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        System.out.println("WHYgere Application launched successfully");

        Login login=new Login(driver);
        login.Loginpage("ptggroup1100@gmail.com","Welcome@1234");




    }
}
