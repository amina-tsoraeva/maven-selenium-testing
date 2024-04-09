package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQAPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        Thread.sleep(2000);

        WebElement firstNameInputBox = driver.findElement(By.cssSelector("[ng-model ='FirstName']"));
        firstNameInputBox.sendKeys("Omar");
        Thread.sleep(2000);

        firstNameInputBox.sendKeys(Keys.TAB, "Ramo",
                Keys.TAB, "123 Main Street, Main City, 12345, ST, USA",
                Keys.TAB, "omarramo@gmail.com",
                Keys.TAB, "123-321-1221");

        Thread.sleep(5000);

      //  WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value=Male]"));
      //  maleRadioButton.click();
      //  Thread.sleep(3000);

       // WebElement femaleRadioButton = driver.findElement(By.cssSelector("input[value=FeMale]"));
      //femaleRadioButton.click();
       // Thread.sleep(3000);

        selectRadioButtonByValue(driver, "Male");
        Thread.sleep(2000);

        // TODO - Refactor this to have a reusable method
        /* Select a checkbox */
//        WebElement moviesCheckbox = driver.findElement(By.cssSelector("input[value=Movies]"));
//        moviesCheckbox.click();
//        Thread.sleep(3000);
//
//        /* To unselect a checkbox you just need to click on it again */
//        moviesCheckbox.click();
//        Thread.sleep(3000);




        driver.quit();

    }

    public static void clickCheckboxByValue(WebDriver driver, String type) {
        List<WebElement> hobbiesOptions = driver.findElements(By.cssSelector("input[type=checkbox]"));
        for (WebElement option : hobbiesOptions) {

        }
    }

        public static void selectRadioButtonByValue (WebDriver driver, String type){

            List<WebElement> genderRadioButtons = driver.findElements(By.cssSelector("input[type=radio]"));
            switch (type.toLowerCase()) {
                case "male":
                    genderRadioButtons.get(0).click();
                    break;
                case "female":
                    genderRadioButtons.get(1).click();
                    break;
                default:
                    throw new IllegalArgumentException("There is no radio button with such value: " + type);
            }


        }

    }
