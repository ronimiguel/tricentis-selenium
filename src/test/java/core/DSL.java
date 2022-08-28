package core;

import static core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	public void browser(String Url) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get(Url);
	}
	

	public void escrever(By elemento, String texto) {
		getDriver().findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		getDriver().findElement(elemento).click();
	}	
	
	public void selecionar(By elemento, String textoVisivel) {
		WebElement items = getDriver().findElement(elemento);
		Select opcao = new Select(items);
		opcao.selectByVisibleText(textoVisivel);
	}
	public void clicarComJS(By elemento) {
		WebElement box = getDriver().findElement(elemento);
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", box);
	}



}
