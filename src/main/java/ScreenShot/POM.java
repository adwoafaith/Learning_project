package ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM {
    WebDriver driver;

    @Test
    public void myMethod(){
        driver = new ChromeDriver();
        driver.get("http://www.edureka.co");
        driver.getTitle();
        System.out.println("the tile");
    }

}
