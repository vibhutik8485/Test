package Logoyour;

import org.openqa.selenium.By;

public class Registrationpage extends Utils {

    LoadProp loadProp = new LoadProp();

//RegistrationPage Locators
    private By _firstname = By.xpath("//input[@id='customer_firstname']");
    private By _lastname = By.xpath("//input[@id='customer_lastname']");
    private By _password = By.xpath("//input[@id='passwd']");
    private By _address = By.xpath("//input[@id='address1']");
    private By _city = By.xpath("//input[@id='city']");
    private By _state = By.xpath("//select[@id='id_state']");
    private By _postalcode = By.xpath("//input[@id='postcode']");
    private  By _mobile = By.xpath("//input[@id='phone_mobile']");
    private By _clearTextFututureRef = By.xpath("//input[@id='alias']");
    private By _futurereference = By.xpath("//input[@id='alias']");
    private By _registerButton = By.xpath("//span[contains(text(),'Register')]");


    //Assert for user on Registerpage
    public void verifyUserIsOnRegisterPage(){
        assertURL("account-creation");}



    public  void userEntersRegistrationDetails(){
        enterText(_firstname,loadProp.getProperty("firstname"));
        enterText(_lastname,loadProp.getProperty("lastname"));
        enterText(_password,loadProp.getProperty("password"));
        enterText(_address,loadProp.getProperty("address"));
        enterText(_city,loadProp.getProperty("city"));
        enterText(_state,loadProp.getProperty("state"));
        enterText(_postalcode,loadProp.getProperty("postalcode"));
        enterText(_mobile,loadProp.getProperty("mobilephone"));
        clearTextBox(_clearTextFututureRef);
        enterText(_futurereference,loadProp.getProperty("futurereference"));
        clickElements(_registerButton);

    }
}
