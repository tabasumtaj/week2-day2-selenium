package week2.day2;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
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
	
		//driver.findElement(By.LinkText("Create")).click();
		driver.findElement(By.xpath("//a[contains(text (),'Find')]")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("(//button[contains(text(),'Find')])[1]")).click();
		//.findElement(By.name("accountName")).getText();
      

		System.out.println(driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).getAttribute(""));
		
		//        driver.close();
		
	}
 
}
