package Logoyour;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector extends Utils {


   LoadProp loadProp = new LoadProp();


    public void setUpBrowser(){
   String browser = loadProp.getProperty("browser");
    if (browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
}
    else{System.out.println("browser name is empty or typed wrong" + browser);}}}
