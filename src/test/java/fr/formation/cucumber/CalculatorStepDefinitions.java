package fr.formation.cucumber;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions extends SpringIntegrationTest {

	int response = 0;
	String url = DEFAULT_URL + "calc/";

	@When("le client appelle \\/calc\\/add avec les valeurs {int} et {int}")
	public void le_client_appelle_add_avec_les_valeurs(int int1, int int2) {
		response = restTemplate.getForObject(url + "add?a=" + int1 + "&b=" + int2, Integer.class);
	}

	@Then("le client recoit comme reponse {int}")
	public void le_client_recoit_comme_reponse(int result) {
		assertEquals(result, response);
	}

	@When("le client appelle \\/calc\\/sub avec les valeurs {int} et {int}")
	public void le_client_appelle_sub_avec_les_valeurs(Integer int1, Integer int2) {
		response = restTemplate.getForObject(url + "sub?a=" + int1 + "&b=" + int2, Integer.class);
	}

	@When("le client appelle \\/calc\\/mul avec les valeurs {int} et {int}")
	public void le_client_appelle_mul_avec_les_valeurs(Integer int1, Integer int2) {
		response = restTemplate.getForObject(url + "mul?a=" + int1 + "&b=" + int2, Integer.class);
	}

	@When("le client appelle \\/calc\\/div avec les valeurs {int} et {int}")
	public void le_client_appelle_div_avec_les_valeurs(Integer int1, Integer int2) {
		response = restTemplate.getForObject(url + "div?a=" + int1 + "&b=" + int2, Integer.class);
	}
}
