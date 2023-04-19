package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver = null;
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("I want to load the URL")
	public void i_want_to_load_the_url() {
	    driver.get("http://localhost:8888/");
	    System.out.println("launched browser");
	}
	
	@When("Login page is displayd enter valid credentials")
	public void login_page_is_displayd_enter_valid_credentials() {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    System.out.println("entered valid credentials");
	}
	
	@When("Click on login")
	public void click_on_login() {
	    driver.findElement(By.id("submitButton")).click();
	    System.out.println("clicked");
	}
	
	@Then("Validate if home page is displayed")
	public void validate_if_home_page_is_displayed() {
		String expTitle = "vtiger";
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		if(actTitle.contains(expTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
	    
	}

}
