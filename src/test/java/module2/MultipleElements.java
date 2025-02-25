package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {

    public static void main(String[] args) throws InterruptedException {

        // Create a WebDriver object
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();

        // navigate to a web page - we need the address (URL)
        driver.get("https://www.bestbuy.com/");

        // Locate the web elements we want to interact with:
        WebElement searchInput = driver.findElement(By.id("gh-search-input"));
        WebElement searchButton = driver.findElement(By.className("header-search-button"));

        // Interact with located elements
        searchInput.sendKeys("iPhone 15");
        Thread.sleep(2000);

        searchButton.click();
        Thread.sleep(2000);

        // Collect all the items from result
        // findElements() returns - a List<WebElements>
        List<WebElement> products = driver.findElements(By.className("sku-title")); // 18 results



        driver.quit();

    }

}












