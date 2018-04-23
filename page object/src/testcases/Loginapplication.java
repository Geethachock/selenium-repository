package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.PagefactorystyleRediffLoginpage;
//import objectrepository.RediffLoginpage;
import objectrepository.Rediffhomepage;

public class Loginapplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//RediffLoginpage rl = new RediffLoginpage(driver);
		//if you want to use page factory model use the below object invocation or normal page object model the above one
		PagefactorystyleRediffLoginpage rl = new PagefactorystyleRediffLoginpage(driver);
		//below credentials is a failure one so I am not pressing go button
		rl.emaild().sendKeys("hello");
		rl.passwordmethod().sendKeys("hi");
		//rl.gomethod().click();
		rl.homemethod().click();
		Rediffhomepage rh = new Rediffhomepage(driver);
		rh.searchmethod().sendKeys("got it");
		rh.submitmethod().click();

	}
	
	
		
		
	

}
