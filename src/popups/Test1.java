package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) {
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

}
