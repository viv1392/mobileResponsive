package responsivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='KetoBalanced']")
	WebElement ketolink;
	@FindBy(xpath="//a[text()='Take the Quiz ']")
	WebElement quiz;
	
	public void ketoLink() {
		ketolink.click();
	}
	public void takeQuiz() {
		quiz.click();
	}

}
