package pkg1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage 
{
	static WebDriver driver;
	public void dropDownSelection(int indexNumber, WebElement element)
	{
		
		Select sday=new Select(element);
		sday.selectByIndex(indexNumber);
	}
	public void dropDownSelection(String mon, WebElement element)
	{
		Select smonth=new Select(element);
		smonth.selectByVisibleText(mon);
	}
	public void dropDownSelection(String yrs)
	{
		WebElement year=driver.findElement(By.id("year"));
		Select syear=new Select(year);
		syear.selectByValue(yrs);
	}
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../AutomationProgram/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		WebElement createaccount=driver.findElement(By.cssSelector("a#u_0_2"));
		createaccount.click();
		Thread.sleep(3000);
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the first name");
		String fname=sc.nextLine();
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys(fname);
		System.out.println("Enter the surname");
		String lname=sc.nextLine();
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys(lname);
		System.out.println("enter your email id");
		String email=sc.nextLine();
		WebElement emailid=driver.findElement(By.id("u_1_g"));
		emailid.sendKeys(email);
		System.out.println("Enter recomfirmation email id");
		String reemail=sc.nextLine();
		WebElement mailid=driver.findElement(By.cssSelector("input#u_1_j"));
		mailid.sendKeys(reemail);
		System.out.println("Enter password");
		String password=sc.nextLine();
		WebElement passwrd=driver.findElement(By.cssSelector("input#password_step_input"));
		passwrd.sendKeys(password);
	
		SignupPage obj=new SignupPage();
		System.out.println("Enter the Day of DOB");
		int date=sc.nextInt();
		WebElement day=driver.findElement(By.id("day"));
		obj.dropDownSelection(date, day);
		System.out.println("Enter the month of DOB");
		String mon=sc.next();
		WebElement month=driver.findElement(By.id("month"));
		obj.dropDownSelection(mon, month);
		System.out.println("Enter the year of DOB");
		String yrs=sc.next();
		obj.dropDownSelection(yrs);
	}
}
