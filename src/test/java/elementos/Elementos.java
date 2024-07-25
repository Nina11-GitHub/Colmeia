package elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	public By buttonLogin = By.xpath("//button[@class='button'][1]");
	public By butonFechar = By.id("#loginPopup");
	public By email1 = By.id("loginEmail");
	public By Senha = By.id("loginPassword");
	public By Button = By.xpath("//button[text()='Entrar']");
	public By ButtonFormulario = By.xpath("//button[@class='button'][2]");
	
	public By nome =By.id("name");
	public By email2 =By.id("email");
	public By telefone =By.id("phone");
	public By mensagem =By.id("message");
	public By bottonEnviar =By.xpath("//button[text()='Enviar']");
	
	
	
	public By maisInformaçoes = By.xpath("//button[@class='button']//div[text()='Abrir mais informações']");
			
			
	public By maisInforFecharFormulario = By.cssSelector("//div[@class='popup-content']//span[@class='close']");
	
}