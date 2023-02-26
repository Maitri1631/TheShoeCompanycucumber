package com.shoecompany.steps;

import com.shoecompany.pages.SearchProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.eo.Se;

public class SearchProductSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on women Section$")
    public void iClickOnWomenSection() {
        new SearchProductPage().ClickonWomenSection();
    }

    @And("^I click on New Arrivals$")
    public void iClickOnNewArrivals() {
        new SearchProductPage().ClickonNewArrival();
    }

    @And("^I filtering section$")
    public void iFilteringSection() {
        new SearchProductPage().ClickonSize();
    }

    @Then("^I Click on clear Filter$")
    public void iClickOnClearFilter() {
        new SearchProductPage().ClickonRemovefilter();
    }


}
