package org.runner;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JvmReport {
	
	public static void jvmRepot(String json) {
		
		File f = new File("C:\\Users\\Mukesh\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\Report");
		
		Configuration config = new Configuration(f, "hote-Automation");
		
		config.addClassifications("os", "windows-10");
		config.addClassifications("sprint", "16");
		config.addClassifications("browser", "chrome");
		config.addClassifications("version", "82");
		
	      List<String> jsonFiles = new ArrayList<String>();             // step 2
	      jsonFiles.add(json);
		
		ReportBuilder report = new ReportBuilder(jsonFiles, config);  //step 1
		report.generateReports();
		

	}
	

}
