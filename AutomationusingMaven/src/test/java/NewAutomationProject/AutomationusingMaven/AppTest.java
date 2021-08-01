package NewAutomationProject.AutomationusingMaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //assertTrue( true );
    System.out.println("Test/Java execution");
    
    System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");		
    WebDriver driver=new ChromeDriver();
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    WebElement username=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));		
    username.sendKeys("Tester");
    WebElement password=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
    password.sendKeys("test");
    WebElement login=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
    login.click();
    }
   
}
