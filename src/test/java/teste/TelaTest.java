package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Tela;

public class TelaTest {

    private WebDriver driver;
    private Tela tela;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qi.edu.br/ouvidoria/");
        tela = new Tela(driver);
    }

    @Test
    public void testPreencherDados() {
        tela.preencherDados();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
