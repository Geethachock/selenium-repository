import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoaut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1= new FirefoxDriver();
	    driver1.manage().window().maximize();
	    driver1.get("http://newtours.demoaut.com/");
	    WebElement link  = driver1.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    List <WebElement>links= link.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText());
		links.get(i).click();
		System.out.println(driver1.getTitle());
		driver1.navigate().back();
		link  = driver1.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    links= link.findElements(By.tagName("a"));
		
		
		}
		driver1.close();
	}

}
