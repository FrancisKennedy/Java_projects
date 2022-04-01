package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.devtools.v95.network.model.ReportingApiReport;
import org.report.JvmReporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\"
		+ "AdactinBooking.feature",glue = { "org.StepDefine"},monochrome = true,
		plugin = {"pretty","json:src\\test\\resources\\Features\\Report\\jvmReport1.json"})

public class CucumberTestRunner {
	
	@AfterClass
	public static void reportcreation() {
		
		JvmReporting.generateJvmReport("C:\\Users\\franciskenny\\eclipse-workspace\\"
				+ "cucumber\\src\\test\\resources\\Features\\Report\\jvmReport1.json");
	}
	
				
	
	
}
	
	
