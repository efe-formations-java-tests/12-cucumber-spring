package fr.formation.cucumber;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import fr.formation.SpringCucumberApplication;
import io.cucumber.spring.CucumberContextConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(
			classes = SpringCucumberApplication.class,
			webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@CucumberContextConfiguration
public abstract class SpringIntegrationTest {

    protected RestTemplate restTemplate = new RestTemplate();

    protected final String DEFAULT_URL = "http://localhost:8082/";

}

