//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@RunWith(Parameterized.class)
//public class CrossBrowserTesting {
//    static WebDriver driver;
//    private static String browser;
//
//    public CrossBrowserTesting(String browser) {
//        this.browser = browser;
//    }
//
//    @Parameterized.Parameters(name = "browser={0}")
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {
//                {"chrome"},
//                {"firefox"}
//        });
//    }
//
//    @BeforeClass
//    public static void setup() {
//        // This method will be called once before all tests in this class
//    }
//
//    @BeforeClass
//    public static void initializeDriver() {
//        if (browser.equalsIgnoreCase("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        } else {
//            throw new IllegalArgumentException("Invalid browser parameter: " + browser);
//        }
//    }
//
//    @Test
//    public void testExample() {
//        driver.get("http://www.edureka.co");
//        System.out.println("Page title is: " + driver.getTitle());
//    }
//
//    @AfterClass
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}