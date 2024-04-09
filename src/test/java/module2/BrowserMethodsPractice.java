package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserMethodsPractice {


    public static void main(String[] args) throws InterruptedException {


       WebDriver driver = new ChromeDriver();
        String url = "https://www.amazon.com/";
        driver.get(Url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String url1 = "https://www.ebay.com/";
        driver.get(url1);
        Thread.sleep(5000);

        String url2 = "https://www.target.com/";
        driver.get(url2);
        Thread.sleep(5000);


        String url3 = "https://www.costco.com/";
        driver.navigate().to(url3);
        Thread.sleep(5000);
        System.out.println(driver.getTitle());


        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);

        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

        driver.quit();




}
}
