package pages;

import static tdm.DadosFormulario.*;

import org.junit.Before;
import org.junit.Test;

import core.DSL;


public class AutomobileTest extends DSL {

	String url = "http://sampleapp.tricentis.com/101/app.php";

	@Before
	public void setUp() {
		browser(url);
	}
//
//	@After
//	public void tearDown() {
//		killDriver();
//	}

	@Test
	public void autombileDevePreencherEnviarFormulario() {
		// Preenchimento Vehicle Data
		setAutomobile();
		setMake(make);
		setEnginePerformance(enginePerformance);
		setDateOfManufacture(dateOfManufacture);
		setNumberOfSeats(numberOfSeats);
		setFuel(fuel);
		setListPrice(listPrice);
		setLicenseNumber(licenseNumber);
		setAnnualMileage(annualMilleage);
	
		
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
		
		// Preenchimento Data Product
		setStartDate(startDate);
		setInsuranceSum(insuranceSum);
		setMeritRating(meritRating);
		setDamageInsurance(damageInsurance);
		setOptionalProdMotor(optionalEuro);
		setOptionalProdMotor(optionalLegal);
		setCortesyCar(cortesyYes);
		setNextSelectPriceOption();

		// Preenchimento Select Price
		setSelectPrice(platinum);
		setNextSendQuote();

		// Preenchimento Send Quote
		setEmail(email);
		setPhone(phone);
		setUserName(userName);
		setPassword(password);
		setConfirmPassword(confirmPassword);
		setComments(comments);
		setSendEmail();

	}

}
