import java.io.File;
import java.util.List;
import org.openqa.selenium.io.FileHandler;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCountText {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		WebElement ord=driver.findElement(By.linkText("Order"));
		ord.click();
		Thread.sleep(1000);
		File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(a,new File("D:\\TSA\\order.png"));
		List<WebElement>alllinks=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(alllinks.size());
		

	}

}
