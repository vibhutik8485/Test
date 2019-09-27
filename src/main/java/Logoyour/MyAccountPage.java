package Logoyour;

import org.openqa.selenium.By;

public class MyAccountPage extends Utils {

    private By  _myaccountSuccessMsg = By.xpath("//p[@class='info-account']");
    private By _signout = By.linkText("Sign out");
    private By _women = By.linkText("Women");
    private By _tops = By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]");
    private By _tshirts = By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'T-shirts')]");
    private By _selectFadedTshirt = By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]");
    private By _addtoCartFadedShortSleevetshirt = By.xpath("//span[contains(text(),'Add to cart')]");
    private By _productSuccessfullAddedMsg = By.xpath("//span[contains(text(),'There is 1 item in your cart.')]");
    private By _producSuccessfilAddedMsgClose = By.xpath("//span[@class='cross']");



    public void verifyUserSeemyaccountSuccessMessage(){

        assertTextMessage(_myaccountSuccessMsg,"Welcome to your account. Here you can manage all of your personal information and orders.");
    }
    public void userShouldbeSignoutSucccesffully(){
        clickElements(_signout);
    }

    public void addProductToTheCart(){
        clickElements(_women);
        clickElements(_tops);
        clickElements(_tshirts);
        clickElements(_selectFadedTshirt);
        clickElements(_addtoCartFadedShortSleevetshirt);
        System.out.println("Item is added in shopping cart");//print the message
        assertTextMessage(_productSuccessfullAddedMsg,"There is 1 item in your cart");
        clickElements(_producSuccessfilAddedMsgClose);
    }
}


