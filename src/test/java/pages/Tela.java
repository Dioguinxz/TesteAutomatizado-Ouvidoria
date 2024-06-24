package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Tela {

    private WebDriver driver;
    private Random random;

    public Tela(WebDriver driver) {
        this.driver = driver;
        this.random = new Random();
    }

    public void digitarDoUsuario(WebElement element, String texto) throws InterruptedException {
        for (char c : texto.toCharArray()) {
            element.sendKeys(String.valueOf(c));
            Thread.sleep(100 + random.nextInt(200));
        }
    }

    public void preencherDados() {
        try {
            Thread.sleep(1500);

            WebElement nome = driver.findElement(By.id("form-field-nome"));
            digitarDoUsuario(nome, "José Carlos");

            WebElement email = driver.findElement(By.id("form-field-email"));
            digitarDoUsuario(email, "joseCarlos@hotmail.com");

            WebElement telefone = driver.findElement(By.id("form-field-telefone"));
            digitarDoUsuario(telefone, "(54) 99874-4586");

            WebElement cpf = driver.findElement(By.id("form-field-cpf"));
            digitarDoUsuario(cpf, "179.825.230-20");

            WebElement cidade = driver.findElement(By.id("form-field-cidade"));
            digitarDoUsuario(cidade, "Canoas");

            WebElement solicitacao = driver.findElement(By.id("form-field-solicitacao"));
            digitarDoUsuario(solicitacao, "Elogio");

            WebElement mensagem = driver.findElement(By.id("form-field-mensagem"));
            digitarDoUsuario(mensagem, "Parabéns");

            WebElement botaoEnviarMensagem = driver.findElement(By.xpath
                    ("//span[contains(text(), 'Pronto, quero enviar a mensagem')]"));
            botaoEnviarMensagem.click();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
