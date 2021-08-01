import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int x=0;x<alllinks.size();x++)
		{
			System.out.println(alllinks.get(x).getText());
		}

	}

}
