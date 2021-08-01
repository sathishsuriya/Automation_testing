import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement Date=driver.findElement(By.xpath("//*[@id=\'datepicker\']"));
		Date.click();
		driver.findElement(By.linkText("24")).click();
		Date.sendKeys("05/01/2020");

	}

}
