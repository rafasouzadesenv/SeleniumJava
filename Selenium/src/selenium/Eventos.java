/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.awt.Robot;
import java.util.List;
import okhttp3.Cache;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Rafa
 */
public class Eventos {

    public static WebDriver driver = null;
    Robot robot = null;

    public void abrirNavegador(String url) {
        try {
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.get(url);
            WebElement element;
            element = driver.findElement(By.id("gh-ac"));
            element.sendKeys("robot" + Keys.ENTER);
            //String urlSearch = driver.getCurrentUrl();
            List<WebElement> produtos = driver.findElements(By.className("lvtitle"));
            String[] links = new String[3];
            for (int i = 0; i < 3; i++) {

                element = produtos.get(i).findElement(By.tagName("a"));
                links[i] = element.getAttribute("href");                
            }
            
            for (int i = 0; i < 3; i++) {
                driver.navigate().to(links[i]);
                driver.findElement(By.id("isCartBtn_btn")).click();                
            }
            driver.findElement(By.id("ptcBtnRight")).click();
            System.out.print("Sucesso!");
            
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    

    private void Comprar() {
        
        //driver.findElement(By.tagName("a")).click();
        //link_prod.findElement(By.name("href")).click();
         }

}
