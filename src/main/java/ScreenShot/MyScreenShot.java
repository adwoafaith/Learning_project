package ScreenShot;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class MyScreenShot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.edureka.co");
        System.out.println("hello");

        //create an instance of the screenshot class
        TakesScreenshot screenshot = (TakesScreenshot)driver;

        //store it in the source file
        File source = screenshot.getScreenshotAs(OutputType.FILE);

        //We get the screenshot and shot and store it in our own file location
        FileUtils.copyFile(source, new File("./screenshot/shot.png"));
        System.out.println("done");
        driver.quit();

    }
}
