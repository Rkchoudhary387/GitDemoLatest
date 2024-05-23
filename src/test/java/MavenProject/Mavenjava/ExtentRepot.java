package MavenProject.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRepot {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		//ExtentReports and ExtentsparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Sutomation Result");
		reporter.config().setDocumentTitle("Test Result");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Roushan");
				
	}
	
	@Test

	public void intitalDemo()
	{
		extent.createTest("intitalDemo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium_Driver//chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		  System.out.println(driver.getTitle());
		 
	

	}

}
