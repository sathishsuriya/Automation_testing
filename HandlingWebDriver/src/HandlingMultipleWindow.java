import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ibank.standardchartered.co.in/nfs/login.htm?");
		Set<String> allwindowsID=driver.getWindowHandles();
		Iterator<String> it=allwindowsID.iterator();
		String mainwindowid=it.next();
		System.out.println("main window id is"+mainwindowid);
		WebElement link=driver.findElement(By.linkText("phone Banking"));
		link.click();
		allwindowsID=driver.getWindowHandles();
		it=allwindowsID.iterator();
		it.next();
		String childWindow=it.next();
		System.out.println("child window id is "+childWindow);
		driver.switchTo().window(childWindow);
		WebElement search=driver.findElement(By.xpath("//*[@id='page']/header/div/nav/ul/li[7]/a/span[1]"));
		search.click();
	}

}
