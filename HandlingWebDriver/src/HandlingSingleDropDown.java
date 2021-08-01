import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions y=new ChromeOptions();
		y.addArguments("----start maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement Options=driver.findElement(By.xpath("//*[@id=\'post-1688\']/div/div/[2]/form/p[7]/select"));
		Select a=new Select(Options);
		List<WebElement>allvalue=a.getOptions();
		for(int x=0;x<allvalue.size();x++)
		{
			System.out.println(allvalue.get(x).getText());
		}
	}

}
