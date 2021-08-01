
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Downloadafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("Webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
HashMap a=new HashMap();
a.put("download.default_directory", "D:/demo");
ChromeOptions download=new ChromeOptions();
download.setExperimentalOption("prefs",a);
WebDriver driver=new ChromeDriver();
driver.get("http://www.selenium.dev/downloads/");
WebElement link=driver.findElement(By.linkText("64 bit windows IE"));
link.click();;

	}

}
