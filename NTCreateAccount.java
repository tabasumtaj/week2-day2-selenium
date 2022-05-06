package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		Select currencys = new Select(driver.findElement(By.id("currencyUomId")));
		currencys.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("NRI ACCOUNT");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("testlocal");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("testsite");
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[5]")).sendKeys("80000000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 String text =driver.findElement(By.className("messages")).getText();
		
		System.out.println("----error text--"+text);	
		driver.close();
	}
}
