package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice {

    public static void main(String[] args) throws InterruptedException {

        String username = "test@mail.com";
        String password = "test";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/");

        Thread.sleep(5000);

        WebElement usernameInput = driver.findElement(By.name("userName"));

        WebElement passwordInput = driver.findElement(By.name("password"));

        WebElement submitButton = driver.findElement(By.name("submit"));

        usernameInput.sendKeys("test@email.com");
        Thread.sleep(3000);

        passwordInput.sendKeys("test");
        Thread.sleep(3000);

        submitButton.click();
        Thread.sleep(5000);



       WebElement vacationsLink = driver.findElement(By.partialLinkText("Vacations"));
       vacationsLink.click();
        Thread.sleep(10000);

        WebElement registerLink = driver.findElement(By.partialLinkText("REGISTER"));
        registerLink.click();
        Thread.sleep(10000);

        String expectedUrlPostFix = "/register.php";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.endsWith(expectedUrlPostFix)) {

            System.out.println("Registration Page Test: PASSED");
        } else {
            System.out.println("Registration Page Test: FAILED");


        }




        driver.quit();
    }
}