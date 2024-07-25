package projeto.runner;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Driver;

public class Executa extends Driver {

	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://colmeia-cx.github.io/colmeia-qa-teste/?phone=119999999");
		
	}
	public static void finalizarTeste() {
		driver.quit();
	}
}
