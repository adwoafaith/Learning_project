package DataDrivenFramework.testdata;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LoginMain {

    public String baseUrl = "http://www.facebook.com/";
    String driverPath = "C:\\path\\to\\chromedriver.exe";

    private String username;
    private String password;
    private WebDriver driver;

    public LoginMain(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> TestData() {
        ReadExcelFile data = new ReadExcelFile("C:\\path\\to\\Book1.xlsx");
        Object[][] testData = data.getData("Credentials");
        Collection<Object[]> testDataCollection = new ArrayList<>();
        for (Object[] row : testData) {
            testDataCollection.add(row);
        }
        data.close();
        return testDataCollection;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void testLogin() throws InterruptedException {
        System.out.println("Testing with username " + username + " and password: " + password);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        Thread.sleep(4000);

        String expectedTitle = "Find a Flight: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Invalid credentials", expectedTitle, actualTitle);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}