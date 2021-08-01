import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlerRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions y=new ChromeOptions();
		y.addArguments("----start maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		List<WebElement> allvalues=driver.findElements(By.xpath("//input[@name='groups']"));
		System.out.println(allvalues.size());
		for(int x=0;x<allvalues.size();x++)
		{
			System.out.println(allvalues.get(x).getAttribute("value"));
			System.out.println(allvalues.get(x).getAttribute("value")+"---"+allvalues.get(x).getAttribute("checked"));
		}

	}

}
