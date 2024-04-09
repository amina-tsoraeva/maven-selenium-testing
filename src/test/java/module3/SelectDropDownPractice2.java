package module3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class SelectDropDownPractice2 {


    public static void main (String[]args)throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        // locate the dropdown
        WebElement dobDropdownWebElement = driver.findElement(By.id("yearbox"));
        // create a select object type
        // the benefit is that you can use methods to select options and also have direct access to all option from this object
        Select dobDropdown = new Select(dobDropdownWebElement);
        dobDropdown.selectByIndex(1);
        Thread.sleep(3000);
        dobDropdown.selectByValue("1956");
        Thread.sleep(3000);
        dobDropdown.selectByVisibleText("2010");
        Thread.sleep(3000);

        // select by visible text year - 2024
        // In case we provide an index/value/visible text that doesn't exist then we will get an 'runtime' exception
        // Means: The code will get stopped at the line where the exception is thrown
        // Is it a good approach to handle unchecked exceptions???

        // You can handle any exception type in Java - checked and unchecked
        // You cannot handle errors

        // dobDropdown.selectByVisibleText("2024");

        // How do we prevent a no such exception in such situations?

        // Option 1:
        List<WebElement> allOptionOfYearDropdown = dobDropdown.getOptions();

        String yearToSelect = "2011";

        // Here in the first part we will have a boolean that will store the result if element present or not
        boolean isPresent = false;
        // The logic is - we iterate over the list of veb elements that are actually the options of the dropdown
        for(WebElement option : allOptionOfYearDropdown){
            // In each iteration we will extract the text and match against the value we want to select
            if(option.getText().equals(yearToSelect)){
                // When we find the match we will turn our boolean value to true
                isPresent = true;
                break;
            }
        }

        // Now based on isPresent boolean we can control the flow as:
        // If present simply select that option
        // Otherwise, print message
        if(isPresent){ // true - false
            dobDropdown.selectByVisibleText(yearToSelect);
        } else {
            System.out.println("The option: " + yearToSelect + " is not present in the dropdown!");
        }

        Thread.sleep(3000);

        driver.quit();

    }
}




