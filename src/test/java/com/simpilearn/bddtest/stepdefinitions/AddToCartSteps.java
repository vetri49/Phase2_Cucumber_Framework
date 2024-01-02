package com.simpilearn.bddtest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AddToCartSteps {
	
	@Given("^User search for a product \"([^\"]*)\"$")
	public void user_search_for_a_product(String string) {
	   System.out.println("User search for a product {string}");
	}


	@When("add the first laptop that appears in the  search results to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_results_to_the_basket() {
		System.out.println("Add the first laptop that apears in the search results to the basket");
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {
		System.out.println("User clicks on cart link");;
	}

	@Then("user basket should display added {int} item")
	public void user_basket_should_display_added_item(Integer int1) {
		System.out.println("User basket should display added 1 items");
	}
}