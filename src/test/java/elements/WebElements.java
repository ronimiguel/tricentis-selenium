package elements;

import org.openqa.selenium.By;

public class WebElements {
	// ELEMENTOS NAVEGACAO
	private By automobile 				= By.id("nav_automobile");
	private By truck					= By.id("nav_truck");
	private By motorcycle				= By.id("nav_motorcycle");
	private By camper					= By.id("nav_camper");
	
	
	// ELEMENTOS PAGE VEHICLE DATA
	private By make 					= By.id("make");
	private By model 					= By.id("model"); // Motorcycle
	private By cylinderCapacity			= By.id("cylindercapacity"); // Motorcycle
	private By enginePerformance 		= By.id("engineperformance");
	private By dateOfManufacture 		= By.id("dateofmanufacture");
	private By numberOfSeats 			= By.id("numberofseats");
	private By numberOfSeatsCycle 		= By.id("numberofseatsmotorcycle");
	private By rightHandDriveNo 		= By.id("righthanddriveyes");
	private By fuel 					= By.id("fuel");
	private	By payload 					= By.id("payload"); // Truck - Camper
	private	By totalWeight 				= By.id("totalweight"); // Truck - Camper
	private	By listPrice 				= By.id("listprice");
	private	By licensePlateNumber 		= By.id("licenseplatenumber");
	private	By annualMileage 			= By.id("annualmileage");
	private	By nextenterinsurantdata 	= By.id("nextenterinsurantdata");

	// ELEMENTOS INSURANT DATA PAGE
	private By firstName 				= By.id("firstname");
	private	By lastName 				= By.id("lastname");
	private	By birthDate 				= By.id("birthdate");
	private	By genderFemale 			= By.id("genderfemale");
	private	By genderMale 				= By.id("gendermale");
	private	By streetaddress 			= By.id("streetaddress");
	private By country 					= By.id("country");
	private By selectCountry 			= By.xpath("option[234]");
	private By zipcode 					= By.id("zipcode");
	private By city 					= By.id("city");
	private By occupation 				= By.id("occupation");
	private By selectOccupation 		= By.xpath("//option[. = 'Employee']");
	private By hobbiesSpeeding 			= By.id("speeding");
	private By hobbiesBungeeJumping		= By.id("bungeejumping");
	private By hobbiesCliffDiving		= By.id("cliffdiving");
	private By hobbiesSkydiving			= By.id("skydiving");
	private By hobbiesOther				= By.id("other");
	private By website 					= By.id("website");
	private By picture 					= By.id("picture");
	private By open 					= By.id("open");
	private By nextProductData 			= By.id("nextenterproductdata");
	
	// PRODUCT DATA PAGE
	private By startDate 				= By.id("startdate");
	private By insuranceSum 			= By.id("insurancesum");
	private By meritRating 				= By.id("meritrating");
	private By damageInsurance 			= By.id("damageinsurance");
	private By optionalProdMotorLegal 	= By.id("LegalDefenseInsurance");
	private By optionalProdMotorEuro 	= By.id("EuroProtection");
	private By optProdMotorEuroTxt		= By.xpath("//*[@id=\"EuroProtection\"]/..");
	private By optProdMotorLegalTxt		= By.xpath("//*[@id=\"LegalDefenseInsurance\"]/..");
	private By courtesyCar 				= By.id("courtesycar");
	private By nextSelectPriceOption 	= By.id("nextselectpriceoption");
	
	// SELECT PRICE PAGE
	private By selectSilver				= By.id("selectsilver");
	private By selectGold				= By.id("selectgold");
	private By selectPlatinum			= By.id("selectplatinum");
	private By selectUltimate			= By.id("selectUltimate");
	private By nextSendQuote 			= By.id("nextsendquote");
	
	// SEND QUOTE PAGE
	private By email 					= By.id("email");
	private By phone 					= By.id("phone");
	private By username 				= By.id("username");
	private By password 				= By.id("password");
	private By confirmPassword 			= By.id("confirmpassword");
	private By comments 				= By.id("Comments");
	private By sendEmail 				= By.id("sendemail");
	private By msgSendingEmail 			= By.xpath("//h2[contains(.,\"success\")]");
	private By okButton 				= By.className("confirm");
	
	// ELEMENTOS NAVEGACAO
	public By getAutomobile() {
		return automobile;
	}
	
	public By getTruck() {
		return truck;
	}
	
	public By getMotorcycle() {
		return motorcycle;
	}
	
	public By getCamper() {
		return camper;
	}
	
	// VEHICLE DATA GETTERS
	public By getMake() {
		return make;
	}

	public By getModel() {
		return model;
	}

	public By getCilinderCapacity() {
		return cylinderCapacity;
	}

	public By getEnginePerformance() {
		return enginePerformance;
	}

	public By getDateOfManufacture() {
		return dateOfManufacture;
	}

	public By getNumberOfSeats() {
		return numberOfSeats;
	}

	public By getNumberOfSeatsCycle() {
		return numberOfSeatsCycle;
	}

	public By getRightHandDriveNo() {
		return rightHandDriveNo;
	}

	public By getFuel() {
		return fuel;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalWeight() {
		return totalWeight;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public By getAnnualMileage() {
		return annualMileage;
	}

	public By getNextenterinsurantdata() {
		return nextenterinsurantdata;
	}
	// INSURANT DATA GETTERS
	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}

	public By getBirthDate() {
		return birthDate;
	}

	public By getGenderMale() {
		return genderMale;
	}
	
	public By getGenderFemale() {
		return genderFemale;
	}
	
	public By getStreetaddress() {
		return streetaddress;
	}

	public By getCountry() {
		return country;
	}

	public By getSelectCountry() {
		return selectCountry;
	}

	public By getZipcode() {
		return zipcode;
	}

	public By getCity() {
		return city;
	}

	public By getOccupation() {
		return occupation;
	}

	public By getSelectOccupation() {
		return selectOccupation;
	}

	public By getHobbiesSpeeding() {
		return hobbiesSpeeding;
	}

	public By getHobbiesBungeeJumping() {
		return hobbiesBungeeJumping;
	}

	public By getHobbiesCliffDiving() {
		return hobbiesCliffDiving;
	}
	
	public By getHobbiesSkydiving() {
		return hobbiesSkydiving;
	}
	
	public By getHobbiesOther() {
		return hobbiesOther;
	}


	public By getWebsite() {
		return website;
	}

	public By getPicture() {
		return picture;
	}

	public By getOpen() {
		return open;
	}

	public By getNextProductData() {
		return nextProductData;
	}
	
	// PRODUCT DATA GETTERS
	public By getStartDate() {
		return startDate;
	}

	public By getInsuranceSum() {
		return insuranceSum;
	}

	public By getMeritRating() {
		return meritRating;
	}


	public By getDamageInsurance() {
		return damageInsurance;
	}

	public By getOptionalProdMotorEuro() {
		return optionalProdMotorEuro;
	}
	public By getOptionalProdMotorLegal() {
		return optionalProdMotorLegal;
	}

	public By getOptProdMotorEuroTXT() {
		return optProdMotorEuroTxt;
	}

	public By getOptProdMotorLegalTXT() {
		return optProdMotorLegalTxt;
	}

	public By getCortesyCar() {
		return courtesyCar;
	}

	public By getNextSelectPriceOption() {
		return nextSelectPriceOption;
	}
	// SELECT PRICE GETTERS
	public By getSelectSilver() {
		return selectSilver;
	}
	
	public By getSelectGold() {
		return selectGold;
	}

	public By getSelectPlatinum() {
		return selectPlatinum;
	}
	
	public By getSelectUltimate() {
		return selectUltimate;
	}
	
	public By getNextSendQuote () {
		return nextSendQuote;
	}
	
	// SEND QUOTE GETTERS
	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getComments() {
		return comments;
	}

	public By getSendEmail() {
		return sendEmail;
	}
	public By getMsgSendingEmail() {
		return msgSendingEmail;
	}
	
	public By getOkButton() {
		return okButton;
	}
}
