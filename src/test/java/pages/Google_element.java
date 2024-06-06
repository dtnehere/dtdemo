package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_element  {
    WebDriver driver ;

    public void search_google()
    {
        driver.findElement(By.name("q")).sendKeys("Facebook");
        driver.findElement(By.name("btnk")).click();
    }
}
