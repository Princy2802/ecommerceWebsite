package org.Baseclass;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Frame;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//Instance Variable
	public static WebDriver driver;
	public static Alert alert;
	
	//Reusable Method by using selenium
	public void initBrowser(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		break;
		}
		case "firefox":{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		case "edge":{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		default:System.out.println("invalid browser Name");
		}
		driver.manage().window().maximize();
		}
	//url pass
	public void getUrl(String url) {
		driver.get(url);
        }
	//locators id ,name,class,tag,link,partial,xpath,css
    public WebElement findElementId(String id) {
		return
	driver.findElement(By.id(id));
	}
    public WebElement findElementName(String name) {
		return
	driver.findElement(By.name(name));
	}
    public WebElement findElementTagname(String name) {
    	return
    driver.findElement(By.tagName(name));
    }
    public WebElement findElementCalssname(String text) {
    	return
    driver.findElement(By.className(text));
    }
    public WebElement findElementpartial(String text) {
    return
    driver.findElement(By.partialLinkText(text));
    }
    public WebElement findElementLink(String text) {
   return
	driver.findElement(By.linkText(text));  
    }
    public WebElement findElementCssSelector(String name) {
    return
    driver.findElement(By.cssSelector(name));		
    }
    public WebElement findElementXpath(String name) {
    	return
    driver.findElement(By.xpath(name));
    }
    //getCurrent Url
    public void currentUrl(String name) {
    System.out.println(driver.getCurrentUrl());	
	}
    public void getTitle(String name) {
		System.out.println(driver.getTitle());
	}
    //Sendkeys
    public void Sendkeys(WebElement ele,String Sendkeys ) {
    	ele.sendKeys(Sendkeys);
    }
    //click
    public void click(WebElement ele) {
    	ele.click();
	}
    //gettext
    public void getText(WebElement ele) {
    	System.out.println(ele.getText());
   }
    //close
    public void Close() {
		driver.close();
	}
    //quit
    public void quit() {
		driver.quit();
	}
    //navigate back, forward,refresh, navigate to
    
    public void navigateTo(String url) {
		driver.navigate().to(url);
	}
    public void Back() {
    	driver.navigate().back();
	}
    public void forward() {
		driver.navigate().forward();
	}
    public void refresh() {
    	driver.navigate().refresh();
	}
    //implicit wait
    public void implicitWait(int seconds) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    //Alert accept,dismiss,sendkeys,gettext
    public void switchToAlert() {
	alert= driver.switchTo().alert();
	}
    public void SendKeys(String name) {
	alert.sendKeys(name);	
	}
    public void Accept() {
	alert.accept();	
	}
    public void Dismiss() {
		alert.dismiss();
	}
    public void getText() {
    	System.out.println(alert.getText());
    }
    //Frame
//    public void Frame1(int index) {
//		driver.switchTo().frame(index);
//	}
//    public void Frame2(String name) {
//    	driver.switchTo().frame(name);
//    }
//   public void DafaultContent() {
//	driver.switchTo().defaultContent();
//   }
//   //windowsHandling
//    public void window() {
		
//}
    
    //ScreenShot
    public static void takeScreenshot(String path) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(path);
        FileUtils.copyFile(src, file);
    }

    
    
    
	
    
    
}






    



	
	
	
	
	
	
	
	


