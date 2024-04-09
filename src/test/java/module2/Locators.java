package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://dev-hrm.yoll.io/index.php");

        Thread.sleep(5000);

        WebElement usernameInput = driver.findElement(By.name("txtUsername"));

        WebElement passwordInput = driver.findElement(By.name("txtPassword"));

        //Type something in the input box
        //webElement.sendKeys();


        usernameInput.sendKeys("test123");
        Thread.sleep(3000);

        passwordInput.sendKeys("testtest");
        Thread.sleep(3000);

        //Option 1: Locate the element and store into a object

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();



        //Option 2: Use expression directly
        Thread.sleep(3000);

        driver.quit();


    }
}
