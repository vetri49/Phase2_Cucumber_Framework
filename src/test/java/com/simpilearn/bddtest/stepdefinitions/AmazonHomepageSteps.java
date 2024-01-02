package com.simpilearn.bddtest.stepdefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonHomepageSteps {
	String driverpath="C:/Phase2_Eclipse_Workspace/Phase2_BDD_Cucumber/src/test/resource/drivers/windows/chromedriver.exe";
	String siteurl="https://www.amazon.in/";
	WebDriver driver;
	@Before(value="@HomepageTest")
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", driverpath);
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	@After(value="@HomepageTest")
	public void cleanup() {
		driver.quit();
		
	}
	
	@Given("Open the Chrome and Launch the amazon application")
	public void open_the_chrome_and_launch_the_amazon_application() {
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("User on amazon homepage")
	public void user_on_amazon_homepage() {
	    Assertions.assertEquals(siteurl,driver.getCurrentUrl());
	}

	@Then("Verify meta title of the page")
	public void verify_meta_title_of_the_page() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(actualTitle, expectedTitle);
	}


	@When("Navigate user on different link")
	public void navigate_user_on_dirrent_link() {
		 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	}

	@Then("Verify meta title of the curent page")
	public void verify_meta_title_of_the_curent_page() throws InterruptedException {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		Assertions.assertNotEquals(actualTitle, expectedTitle);
	}

}
