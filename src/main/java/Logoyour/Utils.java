package Logoyour;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //Click on Elements
    public static void clickElements(By by){
        driver.findElement(by).click();
    }
    //clear Textbox
    public static  void clearTextBox(By by){
        driver.findElement(by).clear();
    }

    //Enter Text in Input field
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // If URL contain specific Word
    public static void assertURL(String text){
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    //Actual result - Getting Text From Web

    public static void assertTextMessage(By by,String expected){
        String actual =driver.findElement(by).getText();
        Assert.assertEquals(expected,actual);}

    //Get current date and time
    static String getCurrentDateTime() {
        // create object of simple date format class and decide format
        DateFormat dateformat = new SimpleDateFormat("MMddyyyyHHmmss");

        // get current date time with date()
        Date date = new Date();

        // format for date
        String date1 = dateformat.format(date);
        // print the date

        System.out.println("Current date and time is" + date1);
        return date1;
    }
}
