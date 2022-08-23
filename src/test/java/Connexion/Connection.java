package Connexion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Connection {
    public static WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/");

    }


    @AfterTest
    public void tearDown()
    {
        driver.close();
    }



}
