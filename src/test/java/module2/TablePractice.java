package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {
    public static void main(String [] args ) throws InterruptedException {

        //create a driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to a specific web page
        driver.get("https://testautomationpractice.blogspot.com//");

        Thread.sleep(1000);

        printDataFromTableCellByIndex(driver, 3,2);
        printDataFromTableCellByIndex(driver, 1,3);
        printDataFromTableCellByIndex(driver, 5,1);

        driver.quit();

    }

    private static void printDataFromTableCellByIndex(WebDriver driver, int row, int column) {
        String dynamicXpath = "//table[@id = 'productTable']/tbody/tr["+ row +"]/td["+ column +"]";
        WebElement thirdTableCell = driver.findElement(By.xpath(dynamicXpath));
        String thirdTableCellText = thirdTableCell.getText();
        System.out.println("The data from table cell is: " + thirdTableCellText);

    }


}
