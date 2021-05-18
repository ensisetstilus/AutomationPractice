package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.FollowUsAutomationPractice;
import org.example.pages.HomePageAutomationPractice;
import org.example.pages.LogingInWithExistingUserAccount;
import org.example.pages.NewsletterPageAutomationPractice;

public class AutomationPracticeStepdefs {
    
    NewsletterPageAutomationPractice newsletterPageAutomationPractice = new NewsletterPageAutomationPractice();
    HomePageAutomationPractice homePageAutomationPractice = new HomePageAutomationPractice();
    FollowUsAutomationPractice followUsAutomationPractice = new FollowUsAutomationPractice();
    LogingInWithExistingUserAccount logingInWithExistingUserAccount = new LogingInWithExistingUserAccount();

    @Given("HOME page is open")
    public void homePageIsOpen() {
        homePageAutomationPractice.openAutomationPracticePage();
    }

    @When("I put search phrase {string} to search field and press Enter")
    public void iPutSearchPhraseToSearchFieldAndPressEnter(String searchPhrase) throws InterruptedException {
        homePageAutomationPractice.putSearchingPhrase(searchPhrase);
    }

    @Then("I can see search prahes results")
    public void iCanSeeResults() throws InterruptedException {
        homePageAutomationPractice.verifyResultsAreVisible();

    }

    @Given("Newsletter field is visible page is open")
    public void newsletterFieldIsVisiblePageIsOpen() {
        newsletterPageAutomationPractice.openNewsLetterPage();
    }

    @When("I put new e-mail address to newsletter field and press submit button")
    public void iPutNewEMailAddressToNewsletterFieldAndPressSubmitButton() {
        newsletterPageAutomationPractice.putInNewsletterEmailAddress();
    }

    @Then("I can see green statement")
    public void iCanSeeGreenStatment() {
        newsletterPageAutomationPractice.verifyThatGreenStatmentIsVisible();
    }

    @Given("HOME page is open and Follow us buttons are visible")
    public void homePageIsOpenAndFollowUsButtonsAreVisible() {
        followUsAutomationPractice.openHomePageFollowUs();
    }

    @When("I click a Facebook button new browser tab is open")
    public void iClickAFacebookButtonNewBrowserTabIsOpen() {
        followUsAutomationPractice.openFacebook();
    }

    @Then("Selenium Framework Facebook page is open")
    public void seleniumFrameworkFacebookPageIsOpen() throws InterruptedException {
        followUsAutomationPractice.newFacebookWindowIsOpen();

    }

    @When("I click Sign in button")
    public void iClickSignInButton() {
        logingInWithExistingUserAccount.clickOnSignInButton();
    }

    @And("Put in e-mail address and password")
    public void putInEMailAddressAndPassword() {
        logingInWithExistingUserAccount.putInEmailAddressAndPassword();
    }

    @Then("I'm signed in to may account")
    public void iMSignedInToMayAccount() {
        logingInWithExistingUserAccount.verifyThatLogoutButtonIsVisible();
    }

    @Given("When HOME page is open")
    public void whenHOMEPageIsOpen() {
        logingInWithExistingUserAccount.openHomePageSignin();
    }
}
