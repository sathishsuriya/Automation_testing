import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samsung\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
WebElement tool=driver.findElement(By.name("q"));
Actions search=new Actions(driver);
search.moveToElement(tool).build().perform();
String x=tool.getAttribute("title");
System.out.println(x);
	}

}
