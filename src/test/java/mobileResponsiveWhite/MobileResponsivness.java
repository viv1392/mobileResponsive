package mobileResponsiveWhite;

import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseHelper.SetUp;

public class MobileResponsivness extends SetUp {
	@Test(priority=1)
	public void mobileResponsiveCmLBS() throws InterruptedException, IOException, URISyntaxException {

		landing.ketoLink();
		landing.takeQuiz();
		driver.findElement(By.xpath("//p[text()='Woman']")).click();
		driver.findElement(By.xpath("//span[text()='Voluptuous']")).click();
		driver.findElement(By.xpath("//span[text()='Fit']")).click();
		driver.findElement(By.xpath("//span[text()='Lose weight']")).click();
		Actions action =new Actions(driver);
		action.scrollByAmount(0, 800).build().perform();
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
		action.scrollByAmount(0, 600).build().perform();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		action.scrollByAmount(0, 900).build().perform();
		driver.findElement(By.xpath("//div[text()='Buy Now →']")).click();
		
	}
	@Test(priority=2)
	public void mobileResponsiveFtKG() throws InterruptedException, URISyntaxException, IOException {
		
		landing.ketoLink();
		landing.takeQuiz();
		driver.findElement(By.xpath("//p[text()='Man']")).click();
		driver.findElement(By.xpath("//span[text()='Extra']")).click();
		driver.findElement(By.xpath("//span[text()='Fit']")).click();
		driver.findElement(By.xpath("//span[text()='Lose weight']")).click();
		Actions action =new Actions(driver);
		action.scrollByAmount(0, 800).build().perform();
		driver.findElement(By.xpath("//span[text()='Sleep better']")).click();
		driver.findElement(By.xpath("//span[text()='Improve bone health']")).click(); 
		driver.findElement(By.xpath("//div[text()='Yes, I Got it']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='Belly']")).click();
		driver.findElement(By.xpath("//span[text()='Butt']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='More than 4 years ago']")).click();
		driver.findElement(By.xpath("//span[text()='Up to 1 hour']")).click();
		driver.findElement(By.xpath("//span[text()='I am Vegan']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I eat all']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I eat all']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I exercise 3-5 times a week']")).click();
		driver.findElement(By.xpath("//span[text()='At workplace']")).click();
		driver.findElement(By.xpath("//span[text()='I eat late at night']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='I want to try and lose some weight']")).click();
		driver.findElement(By.xpath("//span[text()='High blood pressure']")).click();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//div[text()='ft']")).click();
		driver.findElements(By.xpath("//input[@type='number']")).get(0).sendKeys("6");
		driver.findElements(By.xpath("//input[@type='number']")).get(1).sendKeys("3");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.xpath("//div[text()='kg']")).click();
		driver.findElement(By.id("weight_kg")).sendKeys("93");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.id("target_kg")).sendKeys("80");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("38");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		Thread.sleep(13000);
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='Vacation']")).click();
		driver.findElement(By.xpath("//a[text()='  Skip']")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("mail-value")).sendKeys("vivek12@keto.com");
		action.scrollByAmount(0, 600).build().perform();
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		action.scrollByAmount(0, 900).build().perform();
		driver.findElement(By.xpath("//div[text()='Buy Now →']")).click();
		
	}
}
