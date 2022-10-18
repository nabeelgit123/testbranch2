package locators;

import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class LaunchBrowser {
    public static void main(String[] args) {
        ConfigReader configReader = new ConfigReader();
        WebDriver driver = configReader.launchUrl();
        driver.quit();
    }
}
