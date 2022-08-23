package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connexion.Connection;

public class PageAccueil {

	@FindBy(xpath = "//h1[contains(text(),'App & Browser Testing Made Easy')]")
	WebElement titre;
	@FindBy(xpath = "//a[contains(.,'Get started free')]")
	WebElement button;


	public  WebDriver driver;
	public PageAccueil(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public void verifierTitre() {
		String titre_vf = titre.getText();
		Assert.assertEquals(titre_vf, "App & Browser Testing Made Easy");
		System.out.println(titre_vf);
	}

	public void clickButton(){
		button.click();
		System.out.println("ok");

	}
	
}
