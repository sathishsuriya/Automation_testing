import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDown {

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
		WebElement ord=driver.findElement(By.linkText("order"));
		ord.click();
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
		//dropdown.sendKeys("ScreenSaver");
		List<WebElement>allvalues=dropdown.findElements(By.tagName("option"));
		System.out.println(allvalues.size());
		for(int x=0;x<allvalues.size();x++)
		{
			System.out.println(allvalues.get(x).getText());
		}

	}

}
