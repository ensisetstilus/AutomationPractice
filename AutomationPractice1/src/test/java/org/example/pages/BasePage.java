package org.example.pages;

import org.example.DriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public RemoteWebDriver driver;

    public BasePage() {
        this.driver = DriverManager.DRIVER;
        PageFactory.initElements(this.driver, this);
    }
}
