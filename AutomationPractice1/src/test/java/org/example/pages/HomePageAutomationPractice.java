package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageAutomationPractice extends BasePage{

    private static String AUTOMATIONPRACTICE_URL = "http://automationpractice.com/index.php";

    @FindBy (how = How.ID, using ="search_query_top" )
    WebElement searchField;

    @FindBy (how = How.NAME, using = "submit_search")
    WebElement searchButton;

    @FindBy (how = How.CLASS_NAME, using = "product_img_link")
    WebElement productPicture;

    public void openAutomationPracticePage() {
        driver.get(AUTOMATIONPRACTICE_URL);
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(searchField));

    }

    public void putSearchingPhrase(String searchPhrase) throws InterruptedException {
        searchField.sendKeys(searchPhrase);
        searchButton.click();

    }

    public void verifyResultsAreVisible () throws InterruptedException {
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(productPicture));

    }

}
