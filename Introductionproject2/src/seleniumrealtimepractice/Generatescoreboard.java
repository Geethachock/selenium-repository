package seleniumrealtimepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generatescoreboard {
	String scorenumber;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/3.5cricketScorecard.html");
 		driver.findElement(By.linkText("Generate Scorecard")).click();
 		List<WebElement>score = driver.findElements(By.xpath("//table//td[2]//p"));
 		//System.out.println(score.size());
 		//the first for loop is to print all the numbers in the table
 		for(int i=0; i<score.size();i++)
 		{   
 		    String scorenumber = score.get(i).getText();
 			System.out.println(scorenumber);
 		}
 		//Integer.parseInt()is to change the variable which is in string to int
 			int max = Integer.parseInt(score.get(0).getText());
 			int sachin = Integer.parseInt(score.get(0).getText());
 			//The next for loop and if is to print the max value in the table
 			for(int i=0; i<score.size();i++)
 			{
 				String scorenumber = score.get(i).getText();
 			
 			   if(max < Integer.parseInt(scorenumber))
 			{
 				max=Integer.parseInt(scorenumber);
 			}
 			}
 			System.out.println("The max value is"+ max);
 			
 	
       driver.findElement(By.xpath(".//*[@id='score']")).sendKeys(String.valueOf(max));
       driver.findElement(By.xpath(".//*[@name='sachinruns']")).sendKeys(String.valueOf(sachin));
       
			
}
}
