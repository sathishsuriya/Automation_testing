import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement parent=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement child=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions drop=new Actions(driver);
		drop.dragAndDrop(parent,child).build().perform();

	}

}
