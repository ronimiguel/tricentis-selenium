package core;

import static core.DriverFactory.getDriver;

import java.time.Duration;

public class DSL {
	public void browser(String Url) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get(Url);
	}
}
