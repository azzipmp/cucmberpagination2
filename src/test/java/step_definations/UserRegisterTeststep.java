package step_definations;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import step_definations.Hooks;
import cucumber.api.java.en.Then;


public class UserRegisterTeststep {
	//WebDriver driver; 
	 String url = "http://newtours.demoaut.com/";
	
	// String ActualValue;
	 
	 public WebDriver driver;
	  


	    public UserRegisterTeststep()
	    {
	        driver = Hooks.driver;
	       
	    }

	 
	 

	 
	 @And("^Enter \"(.*?)\" ,\"(.*?)\" and \"(.*?)\"$")
	 public void entervalues(String value1,String value2,String value3)
	 {

			driver.findElement(By.name("email")).sendKeys(value1);
	 	    driver.findElement(By.name("password")).sendKeys(value2);
	 	    driver.findElement(By.name("confirmPassword")).sendKeys(value3);
	 	   
	 }
	 @And("^Click on submit button$")
	 public void clickonsubmit() throws InterruptedException
	 {
		 driver.findElement(By.name("register")).click();
	 	    Thread.sleep(2000);
	 }
	 
	 @Then("^I verify the \"(.*?)\" created sucessfully$")
	 public void verifyusercreation(String value1 )
	 {
		 String  sActualValue=driver.findElement(By.tagName("Body")).getText();
		 	System.out.println( "check the actual value:"+sActualValue);
		 	   String expected = "Your user name is "+value1; 
		 	   Assert.assertTrue(sActualValue.contains(expected)); 
		 	
	 }
	 
}
