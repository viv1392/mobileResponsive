package iOSSafari;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class whiteReponsive {
	
	@Test

	public void safariTest() throws MalformedURLException, InterruptedException {
		XCUITestOptions options=new XCUITestOptions();
		options.setDeviceName("iPhone 15 Pro");
		options.setPlatformName("iOS");
		options.setPlatformVersion("17.5").withBrowserName("safari");
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		options.safariAllowPopups();
		URL url =new URL("http://127.0.0.1:4723/");
		IOSDriver driver=new IOSDriver(url,options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.get("https://usa.ketobalanced.com/");
	    driver.findElement(By.xpath("//p[text()='Woman']")).click();
		driver.findElement(By.xpath("//span[text()='Voluptuous']")).click();
		driver.findElement(By.xpath("//span[text()='Fit']")).click();
		driver.findElement(By.xpath("//span[text()='Lose weight']")).click();
		//Actions action =new Actions(driver);
		//action.scrollByAmount(0, 800).build().perform();
		driver.findElement(By.xpath("//span[text()='Sleep better']")).click();
		driver.findElement(By.xpath("//div[text()='Yes, I Got it']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='Belly']")).click();
		driver.findElement(By.xpath("//span[text()='Butt']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='Never']")).click();
		driver.findElement(By.xpath("//span[text()='More than 1 hour']")).click();
		driver.findElement(By.xpath("//span[text()='I eat all']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I eat all']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I eat all']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I exercise 1-2 times a week']")).click();
		driver.findElement(By.xpath("//span[text()='At workplace']")).click();
		driver.findElement(By.xpath("//span[text()='I eat late at night']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I want to try and lose some weight']")).click();
		driver.findElement(By.xpath("//span[text()='Diabetes']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.id("height_cm_id")).sendKeys("176");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.id("weight_lb")).sendKeys("230");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.id("target_lb")).sendKeys("180");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("34");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		Thread.sleep(13000);
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='Vacation']")).click();
		driver.findElement(By.xpath("//a[text()='  Skip']")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("mail-value")).sendKeys("vivek1@keto.com");
		//action.scrollByAmount(0, 600).build().perform();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		//action.scrollByAmount(0, 900).build().perform();
		driver.findElement(By.xpath("//div[text()='Buy Now →']")).click();
		driver.quit();

		
	}

}
