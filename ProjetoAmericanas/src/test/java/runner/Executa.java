package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/",
	glue = "steps",
	tags = "@positivo",
	monochrome = true,
	dryRun = false,
	plugin = {"pretty","html:target/cucumber-report.html"}
	
	

)


public class Executa extends Drivers{
	
	public void abrirNavegador(String url) {
		try {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		
		}catch(Exception e){
			System.err.print(" ------ erro ao abrir navegador ----- " +e.getMessage());
			System.err.print(" ---------- causa erro ---------- " +e.getCause());
			
		}
		
	}
	
	public void fecharNavegador() {
		driver.quit();
		
	}
	
	
	

}
