package core;

import static core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import elements.WebElements;

public class DSL extends WebElements{
	/**
	 * Abre o Browser no endereco do site.
	 * @param url
	 * Receber endereco do site, exemplo: https://www.site.com/ 
	 * @author Roni
	 */
	public void browser(String Url) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get(Url);
	}
	
	/**
	 * Escreve em campos do tipo input.
	 * @param By elemento
	 * Recebe nome do elemento web para interagir.
	 * @param texto
	 * Receber texto a ser escrito. 
	 * @author Roni
	 */
	public void escrever(By elemento, String texto) {
		getDriver().findElement(elemento).sendKeys(texto);
	}

	/**
	 * Método para clicar.
	 * @param By elemento
	 * Recebe nome do elemento para clicar. 
	 * @author Roni
	 */
	public void clicar(By elemento) {
		getDriver().findElement(elemento).click();
	}	
	
	/**
	 * Método para selecionar item em caixas de opcoes.
	 * @param By elemento
	 * Recebe nome da caixa para interagir.
	 * @param TextoVisivel
	 * Recebe o texto da opcao que deseja selecionar. 
	 * @author Roni
	 */
	public void selecionar(By elemento, String textoVisivel) {
		WebElement items = getDriver().findElement(elemento);
		Select opcao = new Select(items);
		opcao.selectByVisibleText(textoVisivel);
	}
	
	/**
	 * Método para clicar utilizando Javascript. Utilizar quando outro elemento 
	 * estiver com z-index acima do item a ser clicado.
	 * @param elemento
	 * Recebe nome do elemento para clicar. 
	 * @author Roni
	 */
	public void clicarComJS(By elemento) {
		WebElement box = getDriver().findElement(elemento);
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", box);
	}
	
	public void setAutomobile() {
		clicar(getAutomobile());
	}
	
	// PARA PREENCHIMENTO DO FORMULARIO
	// Vehicle Data
	public void setMake(String make) {
		selecionar(getMake(), make);
	}

	public void setEnginePerformance(String enginePerformance) {
		escrever(getEnginePerformance(), enginePerformance);
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		escrever(getDateOfManufacture(), dateOfManufacture);
	}

	public void setNumberOfSeats(String numberOfSeats) {
		selecionar(getNumberOfSeats(), numberOfSeats);
	}

	public void setFuel(String Fuel) {
		selecionar(getFuel(), Fuel);
	}

	public void setListPrice(String listPrice) {
		escrever(getListPrice(), listPrice);
	}

	public void setLicenseNumber(String licenseNumber) {
		escrever(getLicensePlateNumber(), licenseNumber);
	}

	public void setAnnualMileage(String AnnualMileage) {
		escrever(getAnnualMileage(), AnnualMileage);
	}

	public void setNextEnterInsurantData() {
		clicar(getNextenterinsurantdata());
	}


}
