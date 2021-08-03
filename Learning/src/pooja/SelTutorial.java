package pooja;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SelTutorial {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrnsht,new File("C:\\Users\\pooja.png"));
		driver.get("http://www.facebook.com");
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcd");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abcd");
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("did_submit")).click();
		

	}

}
