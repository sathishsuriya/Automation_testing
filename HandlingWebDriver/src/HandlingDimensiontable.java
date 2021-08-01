import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDimensiontable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
		WebElement username=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));		
		username.sendKeys("Tester");
		WebElement password=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
		password.sendKeys("test");
		WebElement login=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		login.click();
		WebElement table=driver.findElement(By.xpath("//*[@id=\'ct100_MainContent_orderGrid\']"));
		List<WebElement>row=table.findElements(By.tagName("tr"));
		for(int rownum=0;rownum<row.size();rownum++)
		{
			List<WebElement>col=row.get(rownum).findElements(By.tagName("td"));
			{
				for(int colnum=0;colnum<col.size();colnum++)
				{
					System.out.println(col.get(colnum).getText());
				}
			}
		}

	}

}
