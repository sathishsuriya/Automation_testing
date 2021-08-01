import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable {

	public static void main(String[] args) {
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
		WebElement inditable=driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_orderGrid\']/tbody/tr[2]/td[2]"));
		String data=inditable.getText();
		System.out.println(data);
		//rowdata
		WebElement rowtable=driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_orderGrid\']/tbody/tr[2]"));
		String data1=rowtable.getText();
		System.out.println(data1);
		//whole table
		WebElement table=driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_orderGrid\']/tbody"));
		String data2=table.getText();
		System.out.println(data2);
		//col table data
		String xpath_start="//*[[@id=\'ctl00_MainContent_orderGrid\']/tbody/tr[";String xpath_end="]/td[2]";
		for(int x=2;x<9;x++)
		{
			WebElement coltable=driver.findElement(By.xpath(xpath_start+x+xpath_end));
			String Data2=coltable.getText();
			System.out.println(data2);
		}
		//row
		String xpath_start1="//*[@id=\'ctl00_MainContent_orderGrid\']/tbody/tr[2]/td[";String xpath_mid="]/td[";String xpath_end1="]";
		for(int x=2;x<12;x++)
		{
			WebElement rowtable1=driver.findElement(By.xpath(xpath_start1+x+xpath_end1));
			String data3=rowtable1.getText();
			System.out.println(data3);
		}
		
		//wholetable
		String xpath_start2="//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[";String xpath_Mid="]/td[";String xpath_end2="]";
		for(int x=2;x<=9;x++)
		{
			for(int y=2;y<12;y++)
			{
				WebElement table1=driver.findElement(By.xpath(xpath_start2+x+xpath_mid+y+xpath_end1));
				String data4=table1.getText();
				System.out.println(data4+"   ");
				{
					System.out.println();
				}
			}
		}

	}

}
