package Logoyour;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();

    //Homepage Locators
    private By _signIn = By.linkText("Sign in");
    private By _email = By.xpath("//input[@id='email_create']");
    private By _CreateAccount = By.xpath("//form[@id='create-account_form']//span[1]");
    private By _emailAddress = By.xpath("//input[@id='email']");
    private By _password = By.xpath("//input[@id='passwd']");
    private By _signInBtn = By.xpath("//p[@class='submit']//span[1]");



    public void clickOnSignIn(){
       clickElements(_signIn);
       enterText(_email,"jayket"+getCurrentDateTime()+"@gmail.com");
       clickElements(_CreateAccount);

    }

     public void enterLoginDetails(){
        enterText(_emailAddress,loadProp.getProperty("email"));
        enterText(_password,loadProp.getProperty("password"));
        clickElements(_signInBtn);

     }
}

