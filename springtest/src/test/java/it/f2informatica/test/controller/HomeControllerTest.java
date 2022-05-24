package it.f2informatica.test.controller;



import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class HomeControllerTest {


	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void getTesto() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + 8090 + "/",
				String.class)).contains("Hello, World!");
	}
}
