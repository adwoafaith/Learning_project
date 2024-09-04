package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MyScreenShot {
     WebDriver driver;
     @Test
    public void main() throws IOException {


        this.driver = new ChromeDriver();

        driver.get("http://www.edureka.co");
        System.out.println("hello");

        //create an instance of the screenshot class
        TakesScreenshot screenshot = (TakesScreenshot)driver;

        //store it in the source file
        File source = screenshot.getScreenshotAs(OutputType.FILE);

        //We get the screenshot and shot and store it in our own file location
        FileUtils.copyFile(source, new File("./screenshot/shots.png"));
        System.out.println("done");
        driver.quit();

    }
}
