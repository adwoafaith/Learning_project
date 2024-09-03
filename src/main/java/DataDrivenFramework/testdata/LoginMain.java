package DataDrivenFramework.testdata;

import com.beust.jcommander.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class LoginMain {

    public String baseUrl = "http://www.facebook.com/";
    String driverPath = "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

    private String username;
    private String password;
    private WebDriver driver;

    public LoginMain(String username, String password){
        this.username = username;
        this.password = password;
    }
    public static Collection<Object[]> TestData() {
        ReadExcelFile data = new ReadExcelFile("C:\\Users\\FaithAyehMensah\\Downloads\\authentication\\LearningProject\\src\\main\\java\\Data\\Book1.xlsx");
        Object[][] testData = data.getData("Credentials");
        Collection<Object[]> testDataCollection = new ArrayList<>();
        for (Object[] row : testData) {
            testDataCollection.add(row);
        }
        data.close();
        return testDataCollection;
    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        //visit the site
        driver.get(baseUrl);
    }

   @Test()
    public void testLogin() throws InterruptedException {
        System.out.println("Testing with username" + username + "and password: " + password);
        //clear the input box first
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("pass")).clear();

        //send keys
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        Thread.sleep(4000);

        //perform an assertion
        String expectedTitle = "Find a Flight: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Invalid credentials", expectedTitle, actualTitle);
    }
    @After
    public void tearDown() {
        //Initialization Failure: If something goes wrong during the initialization of the WebDriver in the setUp() method, driver might not be instantiated, resulting in it being null.
        // Exception Handling: If an exception occurs during the test execution and is not properly caught, it might prevent the driver from being initialized or cause it to be set to null.
        if (driver != null) {
            driver.quit();
        }
    }

}
