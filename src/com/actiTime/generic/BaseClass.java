package com.actiTime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	public FileLib f=new FileLib();
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
 String url = f.getPropertyData("url");
 String un = f.getPropertyData("username");
 String pw = f.getPropertyData("password");
 driver.get(url);
 LoginPage l=new LoginPage(driver);
 l.setLogin(un, pw); 
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		HomePage h=new HomePage(driver);
		h.setLogout();
	}

}
