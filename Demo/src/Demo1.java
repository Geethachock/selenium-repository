
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
webdriver driver = new ChromeDriver();
driver.get("www.amazon.com");
driver.findelement(By.id("User")).sendkeys("kim");
driver.findelement(By.name("pass")).sendkeys("12");
driver.findelement(By.id("submit")).click();
<List> Webelement table = driver.findelement(By.tag(td))
for(int i=0; i<=table.size;i++)
{
	System.out.println()
}

	}

}
