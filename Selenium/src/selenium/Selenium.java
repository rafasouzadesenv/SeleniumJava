/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Rafa
 */
public class Selenium {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;

    public static void main(String[] args) {
        // TODO code application logic 
        try {
            Eventos browser = new Eventos();
            browser.abrirNavegador("https://www.ebay.com");

        } catch (Exception e) {
            System.out.print(e);

        }
    }

}
