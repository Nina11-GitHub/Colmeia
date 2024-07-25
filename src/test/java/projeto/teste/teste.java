package projeto.teste;

import org.junit.Test;
import org.openqa.selenium.By;

import elementos.Elementos;
import projeto.metodos.Metodos;
import projeto.runner.Executa;

public class teste {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
		
		
	//@Test
	public void login() {
		Executa.iniciarTeste();
		metodos.clicar(el.buttonLogin);
		metodos.escrever(el.email1, "teste@gmail.com");
		metodos.escrever(el.Senha, "Nina@teste");
		metodos.clicar(el.Button);
		Executa.finalizarTeste();
	}
	
	//@Test
	public void formulario() {
		Executa.iniciarTeste();
		metodos.clicar(el.ButtonFormulario);
		metodos.escrever(el.nome, "Nina");
		metodos.escrever(el.email2, "teste@teste.com");
		metodos.escrever(el.telefone, "1199885588");
		metodos.escrever(el.mensagem, "oi");
		metodos.clicar(el.bottonEnviar);
		Executa.finalizarTeste();
		
		
	}
	@Test
	public void maisInformaçoes() {
		Executa.iniciarTeste();
		metodos.clicar(el.maisInformaçoes);
		metodos.clicar(el.maisInforFecharFormulario);
		
	}
	
}

