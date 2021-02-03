package sele.ssr;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class AppTest {
	static WebDriver driver;

	@Test
	public void verifyHomepageTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\rinku\\Selenium");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().getCookies();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		driver.get("https://www.cvs.com/minuteclinic/?icid=CVS-HOME-PWRZN-MINUTECLINIC");
		
		/*  Set <Cookie> cookies= driver.manage().getCookies();
		  System.out.println(cookies.size()); for(Cookie cookie:cookies) {
		  System.out.println(cookie.getName() + "   " +cookie.getValue());
		  
		  Cookie obj1=new
		  Cookie("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr","1212");
		  driver.manage().addCookie(obj1);
		  */
		  
		  }
		 
	
		
		
		// driver.findElement(By.linkText("Visit MinuteClinic")).click();

		/*
		 * driver.findElement(By.id("videoVisit")).click(); //Alert
		 * alert=driver.switchTo().alert(); //alert.dismiss(); Select select =new
		 * Select(driver.findElement(By.xpath("//select[@id='state-label']")));
		 * select.selectByVisibleText("Texas"); driver.findElement(By.xpath(
		 * "//*[@id=\"videoVisit-tab\"]/app-telehealth-state-filter/div/form/div[2]/button"
		 * )).click(); driver.quit();
		 */
	}

/*
 * //public static void takeScreenshotAtEndOfTest() throws IOException { //
 * //File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //
 * //Files.copy(file,new
 * File("C:\\Users\\Mendpara\\eclipse-workspace\\S1\\FileUtils.jpg")); //}}
 */