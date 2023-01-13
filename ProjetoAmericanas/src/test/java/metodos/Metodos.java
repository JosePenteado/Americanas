package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	
	
	public void clicar(By elemento, String passoTest) {
		try {
			driver.findElement(elemento).click();
			
			
		}catch(Exception e) {
			
			System.err.print(" ------ erro ao clicar ----- " +e.getMessage());
			System.err.print(" ---------- causa erro ---------- " +e.getCause());
			
			
		}
		
	}
	String texto;
	public void escrever(By elemento, String passoTest, String texto) {
		this.texto = texto;
		
		try {
			
			driver.findElement(elemento).sendKeys(texto);
			
		} catch (Exception e) {

			System.err.print(" ------ erro ao escrever ----- " +e.getMessage());
			System.err.print(" ---------- causa erro ---------- " +e.getCause());
			
		}
		
	}
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	
	public void validar() {
		
		
		try {
			Thread.sleep(5000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scrollBy(0,700)", "");
			Thread.sleep(4000);
			tirarPrint("evidenciaBuscar");
			
			
		} catch (Exception e) {
			System.err.print("Erro ao tentar tirar evidencia");
		}
	}
	
	public static void tirarPrint(String nomePrint) throws IOException {
        TakesScreenshot print = (TakesScreenshot) driver; // trazendo dependencia
        File arquivo = print.getScreenshotAs(OutputType.FILE);// print em si
        File destinoArquivo = new File("./Evidencias/" + nomePrint + ".png");// onde vai salvar
        FileUtils.copyFile(arquivo, destinoArquivo);// Salvando o arquivo na pasta evidencias

    }

}
