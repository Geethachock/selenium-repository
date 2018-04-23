package javabasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegridinwebpage2coloumnwiseprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
	 		driver.get("http://www.espncricinfo.com/series/8037/scorecard/415281/Australia-vs-India-9th-Match,-Group-A");
	 		WebElement table = driver.findElement(By.xpath(".//*[@id='gp-inning-00']/div[2]/table"));
	 		List<WebElement>noofrows = table.findElements(By.tagName("tr"));
	 		System.out.println(noofrows.size());
	 		for(int i=0;i<noofrows.size();i++)
	 		{
	 			List<WebElement>coloumns = noofrows.get(i).findElements(By.tagName("th"));
	 			System.out.println(coloumns.size());
	 			{
	 				for(int j=0;j<coloumns.size();j++)
	 				System.out.println(coloumns.get(j).getText());
	 					 					
	 			}
	 			//System.out.println(noofrows.get(i).getText());
	 		}

	}

}
