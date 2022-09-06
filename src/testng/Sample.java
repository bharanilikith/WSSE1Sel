package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {
	
	@DataProvider
	public Object[][] getData() {
		Object[][] a=new Object[3][2];
		a[0][0]="qawsedrft";
		a[0][1]="wertyuyuy";
		
		a[1][0]="143565657767";
		a[1][1]="23456777676";
		
		a[2][0]="rewrtet454657*(*&^%$";
		a[2][1]="34567ghjh*&^&^%^&76";
		return a;
				
	}
	
	
	@Test(dataProvider = "getData")
	public void demo(String username,String pwd) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		Thread.sleep(5000);
		driver.close();
	}

}
