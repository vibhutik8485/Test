package Logoyour;

import org.junit.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    Registrationpage registrationpage = new Registrationpage();
    MyAccountPage myAccountPage = new MyAccountPage();



    @Test

    public void userShoulbeSuccessfullySignIn() {
        homePage.clickOnSignIn();
        registrationpage.userEntersRegistrationDetails();
        myAccountPage.verifyUserSeemyaccountSuccessMessage();
        myAccountPage.userShouldbeSignoutSucccesffully();
        homePage.enterLoginDetails();
    }
    @Test
    public  void userShoulbeSuccessfullyProductAddToCart(){
        myAccountPage.addProductToTheCart();

    }
}
