package interactionWithwebElements;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigReader;

public class AssertTotal {

	public static void main(String[] args) throws InterruptedException {
		ConfigReader configReader = new ConfigReader();
		String driverPath = configReader.getDriverPath();
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://teststore.automationtesting.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Hummingbird Printed T-Shirt")).click();
		String priceOfTshirt = driver.findElement(By.xpath("//div[@class='current-price']//span[1]")).getText();
		System.out.println(priceOfTshirt);
		Assert.assertEquals("$19.12", priceOfTshirt);
		driver.quit();
	}

}
//Response :Exception in thread "main" java.lang.AssertionError: expected [$19.12] but found [$26.11]
//code: the expected value was not matching with the actual value