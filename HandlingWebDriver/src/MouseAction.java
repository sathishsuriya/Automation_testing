import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank");
WebElement parent=driver.findElement(By.xpath("//*[text()='S A V E']"));
Actions x=new Actions(driver);
x.moveToElement(parent).build().perform();
WebElement child=driver.findElement(By.xpath("//*[text()='SavingsAccounts']"));
child.click();
	}

}
