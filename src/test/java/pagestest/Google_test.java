package pagestest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Google_element;

public class Google_test {

    public void setup_google()
    {
        System.setProperty("WebDriver,chrome,driver","C:\\Program Files\\Google\\Chrome\\Application");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.quit();



    }

    public static void main(String[] args) throws InterruptedException {
        Google_test g= new Google_test();
        Google_element e = new Google_element();
        g.setup_google();
        Thread.sleep(3000);
        e.search_google();
    }
}
