package Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver;

    @Given("^Open the chrome browser and start application$")
    public void open_the_chrome_browser_and_start_application() {
        System.out.println("open browser");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_username_and_password() {
        System.out.println("Enter credentilas");
    }

    @Then("^Reset the credentials$")
    public void reset_the_credentials() {
        System.out.println("reset password");
    }
}
