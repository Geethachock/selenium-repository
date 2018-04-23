

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trainerdemoframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.dezlearn.com/testingpage/");

driver.manage().window().maximize();
driver.switchTo().frame("contact-iframe");

driver.findElement(By.xpath("html/body/div[2]/div[1]/a/i[1]")).click();

driver.findElement(By.linkText("Contact us")).click();


driver.switchTo().parentFrame();

driver.switchTo().frame("do-it-iframe");

driver.findElement(By.xpath("html/body/div[2]/div[1]/a/i[1]")).click();


driver.close();

	}

}
