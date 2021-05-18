package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewsletterPageAutomationPractice extends BasePage{

    private static String AUTOMATIONPRACTICE_URL = "http://automationpractice.com/index.php";

    @FindBy (how = How.NAME, using = "email")
    WebElement newsletterField;

    @FindBy (how = How.NAME, using = "submitNewsletter")
    WebElement newsLetterSubmit;

    @FindBy (how = How.XPATH, using = "/html/body[@id='index']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/p[@class='alert alert-success']")
    WebElement newsletterGreenStatment;

    public void openNewsLetterPage() {
        driver.get(AUTOMATIONPRACTICE_URL);
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(newsletterField));
    }

    public void putInNewsletterEmailAddress() {
        newsletterField.sendKeys("ensi@gmail.com");
        newsLetterSubmit.click();
    }

    public void verifyThatGreenStatmentIsVisible() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(newsletterGreenStatment));
    }


}
