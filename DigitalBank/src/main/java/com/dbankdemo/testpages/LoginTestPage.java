package com.dbankdemo.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='submit' and contains(@class, 'btn-success')]")
    private WebElement loginButton;
    
    @FindBy(xpath = "//h1[@id='page-title' and text()='Dashboard']")
    private WebElement dashboardelement;
    
    @FindBy(xpath = "//div[@class='sufee-alert alert with-close alert-danger alert-dismissible fade show']")
    private WebElement errorelement;
    
    public LoginTestPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDetails(String username,String password ) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    
    public String getDashboardText() {
    	String Text = dashboardelement.getText();
		return Text;
    }
    
    public String getErrorMsg() {
    	String message = errorelement.getText();
		return message;
    }

}
