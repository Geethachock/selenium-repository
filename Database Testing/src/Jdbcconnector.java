
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jdbcconnector {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/mycollection", "root", "root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM mycollection.airports;");
		while(rs.next())
		{
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("emp_id"));
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("airportid"));
		//System.out.println(rs.getString("airportname"));
		break;
		}
	}

}
