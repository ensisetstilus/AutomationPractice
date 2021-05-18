package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogingInWithExistingUserAccount extends BasePage{

    private static String AUTOMATIONPRACTICE_URL = "http://automationpractice.com/index.php";

    @FindBy (how = How.CLASS_NAME, using = "login")
    WebElement loginButton;

    @FindBy (how = How.ID, using = "email")
    WebElement emailField;

    @FindBy (how = How.ID, using = "passwd")
    WebElement passwordField;

    @FindBy (how = How.ID, using = "SubmitLogin")
    WebElement submitButton;

    @FindBy (how = How.CSS, using = "logout")
    WebElement logoutButton;

    public void openHomePageSignin () {
        driver.get(AUTOMATIONPRACTICE_URL);
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(loginButton));
    }

    public void clickOnSignInButton () {
        loginButton.click();
    }

    public void putInEmailAddressAndPassword () {
        emailField.click();
        emailField.sendKeys("mirek1@pl.pl");
        passwordField.click();
        passwordField.sendKeys("Pies1");
        submitButton.click();

    }

    public void verifyThatLogoutButtonIsVisible () {
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(logoutButton));
    }
}
