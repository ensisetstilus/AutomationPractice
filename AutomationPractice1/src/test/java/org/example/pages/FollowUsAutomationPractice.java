package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class FollowUsAutomationPractice extends BasePage{

    String orginalWindow = driver.getWindowHandle();
    
    private static String AUTOMATIONPRACTICE_URL = "http://automationpractice.com/index.php";
    
    @FindBy (how = How.ID, using = "social_block")
    WebElement socialBlock;
    
    @FindBy (how = How.CLASS_NAME, using = "facebook")
    WebElement facebookButton;

    @FindBy (how = How.LINK_TEXT, using = "twitter")
    WebElement twitterButton;
    
    @FindBy (how = How.LINK_TEXT, using = "youtube")
    WebElement youTubeButton;
    
    @FindBy (how = How.LINK_TEXT, using = "google-plus")
    WebElement googlePlusButton;

    public void openHomePageFollowUs () {
        driver.get(AUTOMATIONPRACTICE_URL);
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(socialBlock));
    }

    public void openFacebook () {
        facebookButton.click();
    }
    
    public void openTwitter () {
        twitterButton.click();
    }

    public void openYouTube () {
        youTubeButton.click();
    }

    public void openGooglePlus () {

        googlePlusButton.click();
    }
    
    public void newFacebookWindowIsOpen () throws InterruptedException {
        new  WebDriverWait(driver, 5).until(numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if (!orginalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                Thread.sleep(5000);
            }

        }
    }
    
    public void checkFacebookTitle () {
        
    }

}
