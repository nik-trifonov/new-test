package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Details {
	
	@Test
	public void Tested1() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		sleep(3000);
		driver.manage().window().maximize();
		
		String url = "http://localhost:3000/restaurants";
		driver.get(url);
		
		WebElement detailsButton = driver.findElement(By.xpath("//span[@class='MuiButton-label-81']"));
		sleep(2000);
		detailsButton.click();
		
		WebElement detailsButton1 = driver.findElement(By.xpath("//a[@href='/restaurants?tag=pizza']/img[@alt='pizza']"));
		detailsButton1.click();
		sleep(2000);
		
		sleep(3000);
		
		
		
		
		//driver.close();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}