package pages;

import static core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.DSL;
import static tdm.DadosFormulario.*;

public class Automobile extends DSL {

//	DSL dsl = new DSL();
	String url = "http://sampleapp.tricentis.com/101/app.php";

	@Before
	public void setUp() {
		browser(url);
	}

//	@After
//	public void tearDown() {
//		killDriver();
//	}

	@Test
	public void automobileDevePreencherEnviarFormulario() {
		setAutomobile();
		setMake(make);
		setEnginePerformance(enginePerformance);
		setDateOfManufacture(dateOfManufacture);
		setNumberOfSeats(numberOfSeats);
		setFuel(fuel);
		setListPrice(listPrice);
		setLicenseNumber(licenseNumber);
		setAnnualMileage(annualMilleage);
		
		
	}

}
