import java.io.File;
import java.util.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandlingFileUpLoad {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	WebElement Upload=driver.findElement(By.xpath("//input[@name=\'uploadfile_0']"));
	//Upload.sendkeys("D:\\TSA");
	//take a screenshot
		File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(a,new File("D:\\TSA\\order.png"));
		WebElement checkbox=driver.findElement(By.xpath("//input[@type=\'checkbox']"));
checkbox.click();
	}

}
