package chrome;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	
	@Test
	//public static void main(String[] args)
	
	public void loginT(){
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("http:leaftaps.com/opentaps");
    driver.findElementById("username").sendKeys("DemoSalesManager");
    driver.findElementById("password").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementByClassName("decorativeSubmit").click();
    driver.close();	
	}

}
