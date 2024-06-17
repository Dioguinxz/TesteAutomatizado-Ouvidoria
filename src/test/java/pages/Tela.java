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
            Thread.sleep(3000);

            WebElement nome = driver.findElement(By.id("form-field-nome"));
            nome.sendKeys("José Carlos");

            Thread.sleep(3000);

            WebElement email = driver.findElement(By.id("form-field-email"));
            email.sendKeys("doassis@hotmail.com.br");

            Thread.sleep(3000);

            WebElement telefone = driver.findElement(By.id("form-field-telefone"));
            telefone.sendKeys("(48) 99672-6746");

            Thread.sleep(3000);

            WebElement cpf = driver.findElement(By.id("form-field-cpf"));
            cpf.sendKeys("869.885.730-20");

            Thread.sleep(3000);

            WebElement cidade = driver.findElement(By.id("form-field-cidade"));
            cidade.sendKeys("Canoas");

            Thread.sleep(3000);

            WebElement solicitacao = driver.findElement(By.id("form-field-solicitacao"));
            solicitacao.sendKeys("Elogio");

            Thread.sleep(3000);

            WebElement mensagem = driver.findElement(By.id("form-field-mensagem"));
            mensagem.sendKeys("Parabéns");

            Thread.sleep(3000);

            WebElement botaoEnviarMensagem = driver.findElement
                    (By.xpath("*//span[contains(text(), 'Pronto, quero enviar a mensagem')]"));
            botaoEnviarMensagem.click();

        } catch (InterruptedException e) {
            e.printStackTrace();


        }


    }
}
