package org.report;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReporting {
	public static void generateJvmReport(String jsonfile) {
		
		File reportPath = new File
				("C:\\Users\\franciskenny\\eclipse-workspace\\cucumber\\src\\test\\"
						+ "resources\\Features\\Report");
		Configuration config = new Configuration(reportPath, "Adactin Booking App");
		config.addClassifications("OS", "Windows");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Version", "97");
		config.addClassifications("Web Application", "Login Adactin Hotel");
		config.addClassifications("Test Booking", "Adactin Hotel Rooms Booking");
		 
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);
		ReportBuilder build = new ReportBuilder(jsonFiles, config);
		
		build.generateReports();
		
		
	}
	

}
