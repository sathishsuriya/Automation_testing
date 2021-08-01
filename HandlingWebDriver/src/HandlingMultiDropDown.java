import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement Options=driver.findElement(By.name("multipleselect[]"));
		Select a=new Select(Options);
		//get all dropdown value and print
		List<WebElement>allvalue=a.getOptions();
		for(int x=0;x<allvalue.size();x++)
		{
			System.out.println(allvalue.get(x).getText());
		}
		a.selectByIndex(0);
		a.selectByIndex(2);
		a.selectByVisibleText("Selenium");
		//get selected value and print
		List<WebElement>allvalue1=a.getAllSelectedOptions();
		for(int x=0;x<allvalue1.size();x++)
		{
			System.out.println(allvalue1.get(x).getText());
		}
		a.selectByVisibleText("selenium");
		a.selectByValue("msmanual");
		a.deselectAll();
		 
		 
	}

}
