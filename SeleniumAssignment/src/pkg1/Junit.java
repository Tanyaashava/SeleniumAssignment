package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junit 
{
	
		WebDriver driver;
		@Before
		public void BrowserLauncUrlHitMaximizeMethod()
		{
			System.setProperty("webdriver.chrome.driver","../AutomationProgram/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			Options op=driver.manage();
			Window w=op.window();
			w.maximize();
		}
		@Test
		public void SignUpMethod() throws InterruptedException
		{
			WebElement createaccount=driver.findElement(By.id("u_0_2"));
			createaccount.click();
			Thread.sleep(3000);
			
			WebElement firstname=driver.findElement(By.name("firstname"));
			firstname.sendKeys("Abc");
			WebElement lastname=driver.findElement(By.name("lastname"));
			lastname.sendKeys("Xyz");
			WebElement emailid=driver.findElement(By.name("reg_email__"));
			emailid.sendKeys("xyz@gmail.com");
			WebElement emailconfirmation=driver.findElement(By.cssSelector("input#u_1_j"));
			emailconfirmation.sendKeys("xyz@gmail.com");
			WebElement password=driver.findElement(By.cssSelector("input#password_step_input"));
			password.sendKeys("xyz123");
			
			// calling method(DropDownSelectionMethod) of Junit class
			Junit obj=new Junit();
			WebElement dropdownday=driver.findElement(By.id("day"));
			obj.DropDownSelectionMethod1(24 ,dropdownday);
			WebElement dropdownmonth=driver.findElement(By.id("month"));
			obj.DropDownSelectionMethod2("7", dropdownmonth);
			WebElement dropdownyear=driver.findElement(By.id("year"));
			Select drop3=new Select(dropdownyear);
			drop3.selectByValue("2000");
			
			WebElement radiobuttonfemale=driver.findElement(By.cssSelector("input[value='1']"));
			WebElement radiobuttonmale=driver.findElement(By.cssSelector("input[value='2']"));
			WebElement radiobuttoncustom=driver.findElement(By.cssSelector("input[value='-1']"));
			obj.radiobuttonmethod(radiobuttonmale);
			
			WebElement signup=driver.findElement(By.name("websubmit"));
			signup.click();
			Thread.sleep(5000);
		}
		@After
		public void BrowserClose()
		{
			driver.close();
		}
		public void DropDownSelectionMethod1(int InexNumber, WebElement element)
		{
			Select drop1=new Select(element);
			drop1.selectByIndex(InexNumber);
			
		}
		public void DropDownSelectionMethod2(String value, WebElement element)
		{
			Select drop2=new Select(element);
			drop2.selectByValue(value);
		}
		
		/*public void DropDownSelectionMethod3(String yrs)
		{
			System.out.println("test");
			WebElement dropdownyear=driver.findElement(By.id("year"));
			Select drop3=new Select(dropdownyear);
			drop3.selectByValue(yrs);
			
		}*/
		public void radiobuttonmethod(WebElement element) throws InterruptedException
		{
			element.click();
			Thread.sleep(2000);
		}
		
}


