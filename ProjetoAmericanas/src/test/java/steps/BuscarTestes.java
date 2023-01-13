package steps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class BuscarTestes {
	Executa executa = new Executa();
	Elementos el = new Elementos();
	Metodos metodos = new Metodos();
	
	@Test
	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String url) {
	executa.abrirNavegador("https://www.americanas.com.br");
	}

	@When("acesso campo de busca")
	public void acesso_campo_de_busca() {
	metodos.clicar(el.buscar, "clicar em buscar");
	
	}

	@When("informo o produto desejado")
	public void informo_o_produto_desejado() {
		metodos.escrever(el.buscar, "escrever em buscar", "pneu");
		metodos.submit(el.buscar);
	}

	

	@Then("valido as opções disponiveis")
	public void valido_as_opções_disponiveis() {
	metodos.validar();
	}
	
}
