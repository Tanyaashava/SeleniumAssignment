package pkg1;

import org.openqa.selenium.By;
import java.util.Scanner;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../SeleniumAssignment/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
			
			// Explaination of this statement "driver.manage().window().maximize();"
			Options op=driver.manage();
		    Window w=op.window();
			w.maximize();
		/*
			// for login--------------------------------------------------------------------
			WebElement user=driver.findElement(By.id("email"));
			user.sendKeys("xyz@gmail.com");
			WebElement password=driver.findElement(By.cssSelector("input#pass"));
			password.sendKeys("X123");
			WebElement login=driver.findElement(By.cssSelector("button#u_0_b"));
			login.click(); 
		*/
			// createaccount button----(SignUp)----------------------------------------------
			WebElement createaccount=driver.findElement(By.cssSelector("a#u_0_2"));
			createaccount.click();
			Thread.sleep(5000);
			
			WebElement fname=driver.findElement(By.name("firstname"));
			fname.sendKeys("Abc");

			WebElement surname=driver.findElement(By.name("lastname"));
			surname.sendKeys("Xyz");
			WebElement email=driver.findElement(By.cssSelector("input#u_1_g"));
			email.sendKeys("xyz123@gmail.com");
			WebElement emailconfirmation=driver.findElement(By.cssSelector("input#u_1_j"));
			emailconfirmation.sendKeys("xyz123@gmail.com");
			WebElement newpassword=driver.findElement(By.cssSelector("input#password_step_input"));
			newpassword.sendKeys("X123");
		
			WebElement dropday=driver.findElement(By.id("day"));
			Select sday=new Select(dropday);
			sday.selectByVisibleText("21");
			WebElement dropmonth=driver.findElement(By.id("month"));
			Select smonth=new Select(dropmonth);
			smonth.selectByVisibleText("May");
			WebElement dropyear=driver.findElement(By.id("year"));
			Select syear=new Select(dropyear);
			syear.selectByVisibleText("1998");

			WebElement female=driver.findElement(By.cssSelector("input[value='1']"));
			female.click();
			Thread.sleep(3000);
			WebElement radiobuttonmale=driver.findElement(By.cssSelector("input[value='2']"));
			radiobuttonmale.click();
			Thread.sleep(3000);
		
			WebElement radiobuttoncustom=driver.findElement(By.cssSelector("input[value='-1']"));
			radiobuttoncustom.click();
			Thread.sleep(3000);
		
			WebElement droppronoun=driver.findElementByName("preferred_pronoun");
			Select spronoun=new Select(droppronoun);
			spronoun.selectByIndex(1);
			
			WebElement signup=driver.findElement(By.name("websubmit"));
			signup.click();
			Thread.sleep(5000);

		}
	}

