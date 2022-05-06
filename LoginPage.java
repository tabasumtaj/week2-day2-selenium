package week2.day2;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
	    driver.findElement(By.xpath("//button[contains (@class,'btn')]")).click(); 
	    if(driver.getTitle().contains("ACME")){
	    	System.out.println("title--ACME");
	    }else
	    {
	    	System.out.println("title not found");
	    }
	    System.out.println("title----"+driver.getTitle());
       driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
       driver.close();
	}

}
