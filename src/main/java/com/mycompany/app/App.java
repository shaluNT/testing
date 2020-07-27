package com.mycompany.app;
import org.openqa.selenium.Webdriver;
import org.openqa.selenium.chrome.Chromedriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","/home/nt/code/jenkins/chromedriver");
        Webdriver driver = new Chromedriver();
        driver.get("https://www.javatpoint.com");
        System.out.println(driver.getTitle());
        
    }
}
