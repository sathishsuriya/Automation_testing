import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.get("http://www.talentsourceautomation.com/crm/");
WebElement login=driver.findElement(By.xpath(("//*[@id='admin_login']/div[3]/div[2]/button")));
login.click();
Thread.sleep(10000);
Alert al=driver.switchTo().alert();
System.out.println(al.getText());
al.accept();
		
	}

}
