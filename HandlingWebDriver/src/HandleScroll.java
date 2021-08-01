import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		WebElement Search=driver.findElement(By.xpath("//*[@id=\'sb_form_q\']"));
Search.sendKeys("selenium");
Thread.sleep(5000);
int x=1;
try
{
	while(true)
	{
		WebElement allvalue=driver.findElement(By.xpath("//*[@id=\'sa_ul\']/li["+x+"]"));
		String values=allvalue.getAttribute("query");
		System.out.println(values);
		x++;
	}
		}catch(Exception e)
		{
			
		}

	}
}


