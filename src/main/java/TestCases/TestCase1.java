//package TestCases;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestCase1 {
//    public String baseUrl = "https://www.edureka.co/";
//    String driverPath = "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
//    public WebDriver driver;
//
//
//    @Test
//    public void verifyHomePageTitle(){
//        System.out.println("Launching Chrome Browser");
//
//        //set driver properties
//        System.setProperty("webdriver.chrome.driver",driverPath);
//        driver = new ChromeDriver();
//
//        //visit the site
//        driver.get(baseUrl);
//
//        //compare title
//        String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle);
//
//        driver.close();
//
//
//
//    }
//}
