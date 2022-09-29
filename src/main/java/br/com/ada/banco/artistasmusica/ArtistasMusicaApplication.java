package br.com.ada.banco.artistasmusica;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.ada.banco.artistasmusica.entity.Pais;
import br.com.ada.banco.artistasmusica.repository.PaisRepository;

@SpringBootApplication
public class ArtistasMusicaApplication {

	@Autowired
	PaisRepository paisRepository;

	private static final Logger logger = LoggerFactory.getLogger(ArtistasMusicaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ArtistasMusicaApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ResponseEntity<List<Pais>> paisesResponse = restTemplate
				.exchange("https://servicodados.ibge.gov.br/api/v1/paises/", HttpMethod.GET, null, new ParameterizedTypeReference<List<Pais>>() {});
			List<Pais> paises = paisesResponse.getBody();
			paises = paises.stream().collect(Collectors.toMap(Pais::getNome, p -> p, (p, q) -> p)).values().stream().sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome())).collect(Collectors.toList());
			paisRepository.saveAll(paises);
		};
	}

}
