import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shopping {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "/https://www.google.com");

    	
    	WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
        // Create an instance of the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Limeroad website
        driver.get("https://www.limeroad.com/");

        // Search for a clothing item
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Men's Clothing");
        searchBox.submit();

        // Find the first clothing item and add it to the cart
        WebElement clothingItem = driver.findElement(By.cssSelector("a.card-img-wrap"));
        clothingItem.click();

        WebElement addToCartButton = driver.findElement(By.cssSelector("button.btn-cart"));
        addToCartButton.click();

        // Close the browser
        driver.quit();
    }
}


