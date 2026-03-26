package org.selenium;

import org.Baseclass.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageObjectModule.LoginPage;
public class BrowserLaunch extends LoginPage{

	public static void main(String[] args)   {
		 //WebDriver driver = new ChromeDriver();


		 
//		 driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
//		 driver.manage().window().maximize();
		 
		BrowserLaunch a = new BrowserLaunch();
		 a.initBrowser("chrome");
		 a.getUrl("https://www.facebook.com");
		 
		 LoginPage b =  new LoginPage();
		 
		 
		 WebElement userName = b.getUserName();
		 userName.sendKeys("PrincyAntony");
		 a.refresh();
		
         userName.sendKeys("PrincyAntony");
		
		 WebElement password = b.getPassword();
		 password.sendKeys("princy_28021989");
		 WebElement login = b.getLogin();
		 login.click();
		 
		 
//		 a.findElementId("email").sendKeys("princy");
//		 a.findElementId("pass").sendKeys("1234");
//		 //a.findElementName("login").click();
//		 System.out.println(a.findElementpartial("Forgotten").getText());
//		 a.currentUrl("FaceBook");	
//		 a.navigateTo("https://www.flipkart.com");
//		 a.Back();
//		 a.forward();
//		 a.refresh();
//		 a.navigateTo("https://leafground.com/alert.xhtml");
//		 a.findElementId("j_idt88:j_idt91").click();
//		 a.switchToAlert();
//		 a.alert.accept();
//		 a.findElementId("j_idt88:j_idt93").click();
//		 a.Dismiss();
//		 
		 
		 
		 
	
	
	
	
	
	}

}
