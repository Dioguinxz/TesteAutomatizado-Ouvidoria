package teste;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class TelaTest extends TestCase {
    static WebDriver driver;
    static Tela tela;

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qi.edu.br/ouvidoria/");

        tela = new Tela(driver);
        tela.preecherDados();

    }
}
