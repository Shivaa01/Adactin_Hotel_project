package com.runnerfiles;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.basclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Cucumber_FeatureFiles\\Login.feature",
					glue = "com.stepdefenition",
					monochrome = true, publish = true
					//plugin ="com.avenstack.extentreports-cucumber6-adapter:${2.1.0}"
					//"com.cucumber.listener.ExtentCucumberFormatter:Report/new_report.html"  //"html:Reports/adac_report.html"
					)

public class RunnerClass {
	public static WebDriver driver;
	 
	@BeforeClass
	public static void SetUp() {
		 driver = BaseClass.getBrowser("chrome");
	}

	@AfterClass
	public static void TearDown() {
		driver.close();

	}
	


}
