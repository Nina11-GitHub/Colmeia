package projeto.metodos;

import org.openqa.selenium.By;

import drivers.Driver;



public class Metodos extends Driver {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
	

}