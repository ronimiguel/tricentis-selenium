package pages;

import core.DSL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.TakeScreenShot;

import static core.DriverFactory.killDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static tdm.DadosFormulario.*;


public class TruckTest extends DSL {

	String url = "http://sampleapp.tricentis.com/101/app.php";
	TakeScreenShot take = new TakeScreenShot();
	@Before
	public void setUp() {
		browser(url);
	}

	@After
	public void tearDown() {
		killDriver();
	}

	@Test
	public void truckDevePreencherEnviarFormulario() {
		// Preenchimento Vehicle Data
		setTruck();
		setMake(make);
		setEnginePerformance(enginePerformance);
		setDateOfManufacture(dateOfManufacture);
		setNumberOfSeats(numberOfSeats);
		setFuel(fuel);
		setPayload(payload);
		setTotalWeight(totalWeight);
		setListPrice(listPrice);
		setLicenseNumber(licenseNumber);
		setAnnualMileage(annualMilleage);

		assertTrue(obterItemSelecionado(getMake()));
		assertEquals(enginePerformance, obterTextoEscrito(getEnginePerformance()));
		assertEquals(dateOfManufacture, obterTextoEscrito(getDateOfManufacture()));
		assertTrue(obterItemSelecionado(getNumberOfSeats()));
		assertTrue(obterItemSelecionado(getFuel()));
		assertEquals(fuel, obterTextoEscrito(getFuel()));
		assertEquals(listPrice, obterTextoEscrito(getListPrice()));
		assertEquals(payload, obterTextoEscrito(getPayload()));
		assertEquals(totalWeight, obterTextoEscrito(getTotalWeight()));
		assertEquals(licenseNumber, obterTextoEscrito(getLicensePlateNumber()));
		assertEquals(annualMilleage, obterTextoEscrito(getAnnualMileage()));
		
		setNextEnterInsurantData();
		
		// Preenchimento Insurant Data
		setFirstName(firstName);
		setLastName(lastName);
		setBirthDate(birthDate);
		setGender(male);
		setStreetAdress(streetAddress);
		setCountry(country);
		setZipCode(zipcode);
		setCity(city);
		setOccupation(occupation);
		setHobbies(hobbies);
		setWebsite(website);
		setNextProductData();

		assertEquals(firstName, obterTextoEscrito(getFirstName()));
		assertEquals(lastName, obterTextoEscrito(getLastName()));
		assertEquals(birthDate, obterTextoEscrito(getBirthDate()));
		assertEquals(male, obterTextoEscrito(getGenderMale()));
		assertEquals(streetAddress, obterTextoEscrito(getStreetaddress()));
		assertEquals(city, obterTextoEscrito(getCity()));
		assertEquals(zipcode, obterTextoEscrito(getZipcode()));
		assertTrue(obterItemSelecionado(getOccupation()));
		assertEquals(hobbies, obterTextoEscrito(getHobbiesSkydiving()));
		assertEquals(website, obterTextoEscrito(getWebsite()));
		
		// Preenchimento Data Product
		setStartDate(startDate);
		setInsuranceSum(insuranceSum);
		setDamageInsurance(damageInsurance);
		setOptionalProdMotor(optionalEuro);
		setOptionalProdMotor(optionalLegal);
		setNextSelectPriceOption();

		assertEquals(startDate, obterTextoEscrito(getStartDate()));
		assertTrue(obterItemSelecionado(getInsuranceSum()));
		assertTrue(obterItemSelecionado(getDamageInsurance()));
		assertTrue(obterInnerText(getOptProdMotorEuroTXT()).contains(optionalEuro));
		assertTrue(obterInnerText(getOptProdMotorLegalTXT()).contains(optionalLegal));

		// Preenchimento Select Price
		setSelectPrice(platinum);
		setNextSendQuote();

		assertEquals(platinum, obterValue(getSelectPlatinum()));

		// Preenchimento Send Quote
		setEmail(email);
		setPhone(phone);
		setUserName(userName);
		setPassword(password);
		setConfirmPassword(confirmPassword);
		setComments(comments);
		setSendEmail();

		assertEquals(email, obterTextoEscrito(getEmail()));
		assertEquals(phone, obterTextoEscrito(getPhone()));
		assertEquals(userName, obterTextoEscrito(getUsername()));
		assertEquals(password, obterTextoEscrito(getPassword()));
		assertEquals(confirmPassword, obterTextoEscrito(getConfirmPassword()));
		assertEquals(comments, obterTextoEscrito(getComments()));

	// Validar envio do formulario com sucesso e tirar um screenshot
		assertEquals("Sending e-mail success!", obterTextoHtml(getMsgSendingEmail()));
		take.Screenshot("Truck-");

		setGetOkButton();



	}



}
