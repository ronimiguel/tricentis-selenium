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
	 * Recebe endereco do site, exemplo: https://www.site.com/ 
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


	// Metodos para Facilitar Assertivas
	public String obterTextoEscrito(By elemento) {
		return	getDriver().findElement(elemento).getAttribute("value");

	}

	public String obterTextoHtml(By elemento) {
		return	getDriver().findElement(elemento).getText();
	}

	public Boolean obterItemSelecionado(By elemento) {
		WebElement box = getDriver().findElement(elemento);
		Select opcao = new Select(box);
		return opcao.getFirstSelectedOption().isSelected();
	}

	public String obterInnerText(By elemento) {
		WebElement text = getDriver().findElement(elemento);
		return text.getAttribute("innerText");
	}

	public String obterValue(By elemento) {
		WebElement text = getDriver().findElement(elemento);
		return text.getAttribute("value");
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
	
	// Para preenchimento do formulario
	// Insurant Data
	
	public void setFirstName(String firstName) {
		escrever(getFirstName(), firstName);
	}

	public void setLastName(String lastName) {
		escrever(getLastName(), lastName);
	}

	public void setBirthDate(String birthDate) {
		escrever(getBirthDate(), birthDate);
	}

	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("Male")) {
			clicarComJS(getGenderMale());
		} else {
			clicarComJS(getGenderFemale());
		}
	}

	public void setStreetAdress(String adress) {
		escrever(getStreetaddress(), adress);
	}

	public void setCountry(String country) {
		selecionar(getCountry(), country);
	}

	public void setZipCode(String zipCode) {
		escrever(getZipcode(), zipCode);
	}

	public void setCity(String city) {
		escrever(getCity(), city);
	}

	public void setOccupation(String occupaction) {
		selecionar(getOccupation(), occupaction);
	}

	public void setHobbies(String hobbies) {
		switch (hobbies.toLowerCase()) {
		case "speeding":
			clicarComJS(getHobbiesSpeeding());
			break;
		case "bungee jumping":
			clicarComJS(getHobbiesBungeeJumping());
			break;
		case "cliff diving":
			clicarComJS(getHobbiesCliffDiving());
			break;
		case "skydiving":
			clicarComJS(getHobbiesSkydiving());
			break;
		default:
			clicarComJS(getHobbiesOther());
			break;
		}		
	}
	
	public void setWebsite(String website){
		escrever(getWebsite(), website);
	}
	
	public void setNextProductData() {
		clicar(getNextProductData());
	}
	
	// Para preenchimento do formulario
	// Product Data
	

	public void setStartDate(String startDate) {
		escrever(getStartDate(), startDate);
	}

	public void setInsuranceSum(String insuranceSum) {
		escrever(getInsuranceSum() ,insuranceSum);
	}

	public void setMeritRating(String meritRating) {
		escrever(getMeritRating(), meritRating);;
	}

	public void setDamageInsurance(String damageInsurance) {
		escrever(getDamageInsurance(), damageInsurance);
	}

	public void setOptionalProdMotor(String optionalProdMotor) {
		if(optionalProdMotor.startsWith("Euro")) {
			clicarComJS(getOptionalProdMotorEuro());
		}else {
			clicarComJS(getOptionalProdMotorLegal());
		}
	}

	public void setCortesyCar(String cortesyCar) {
		selecionar(getCortesyCar(), cortesyCar);
	}

	public void setNextSelectPriceOption() {
		clicar(getNextSelectPriceOption());
	}


	public void setSelectPrice(String option) {
		switch (option.toLowerCase()) {
			case "silver":
				clicarComJS(getSelectSilver());
				break;
			case "gold":
				clicarComJS(getSelectGold());
				break;
			case "platinum":
				clicarComJS(getSelectPlatinum());
				break;
			case "ultimate":
				clicarComJS(getSelectUltimate());;
			default:
				clicarComJS(getSelectSilver());
				break;
		}
	}

	public void setNextSendQuote() {
		clicar(getNextSendQuote());
	}

	public void setEmail(String email) {
		escrever(getEmail(), email);
	}

	public void setPhone(String phone) {
		escrever(getPhone(), phone);
	}

	public void setUserName(String username) {
		escrever(getUsername(), username);
	}

	public void setPassword(String password) {
		escrever(getPassword(), password);
	}

	public void setConfirmPassword(String password) {
		escrever(getConfirmPassword(), password);
	}
	public void setComments(String comments) {
		escrever(getComments(), comments);
	}

	public void setSendEmail() {
		clicar(getSendEmail());
	}

	public void setGetOkButton() {
		clicarComJS(getOkButton());
	}

}
