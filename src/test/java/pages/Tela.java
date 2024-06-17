package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tela {

    static WebDriver driver;

    public Tela(WebDriver driver) {
        this.driver = driver;
    }

    public void preecherDados() {

        try {
            WebElement nome = driver.findElement(By.id("form-field-nome"));
            nome.sendKeys("José Carlos");

            WebElement email = driver.findElement(By.id("form-field-email"));
            email.sendKeys("doassis@hotmail.com.br");


            WebElement telefone = driver.findElement(By.id("form-field-telefone"));
            telefone.sendKeys("(48) 99672-6746");

            WebElement cpf = driver.findElement(By.id("form-field-cpf"));
            cpf.sendKeys("869.885.730-20");

            WebElement cidade = driver.findElement(By.id("form-field-cidade"));
            cidade.sendKeys("Canoas");

            WebElement solicitacao = driver.findElement(By.id("form-field-solicitacao"));
            solicitacao.sendKeys("Elogio");

            WebElement mensagem = driver.findElement(By.id("form-field-mensagem"));
            mensagem.sendKeys("Parabéns");

            WebElement botaoEnviarMensagem = driver.findElement
                    (By.xpath("*//span[contains(text(), 'Pronto, quero enviar a mensagem')]"));
            botaoEnviarMensagem.click();

        } catch (InterruptedException e) {
            e.printStackTrace();


        }


    }
}
