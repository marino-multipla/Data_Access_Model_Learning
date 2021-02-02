package pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * DATA: 02/02/2021;
 * AUTHOR: Maccagni Giacomo
 * DESCRIPTION:
 *
 *
 * Spring Boot automatically spins up Spring Data JPA to create a
 * concrete implementation of the PersonRepository and
 * configure it to talk to a back end in-memory database by using JPA.
 * Spring Data REST builds on top of Spring MVC.
 * It creates a collection of Spring MVC controllers, JSON converters,
 * and other beans to provide a RESTful front end.
 * These components link up to the Spring Data JPA backend.
 * When you use Spring Boot, this is all autoconfigured.
 * If you want to investigate how that works,
 * by looking at the RepositoryRestMvcConfiguration in Spring Data REST.
 *
 * This is an application with a hypermedia-based RESTful front end and a JPA-based back end.
 *
 * Example from https://spring.io/guides/gs/accessing-data-rest/
 *
 */
@SpringBootApplication
public class AccessingDataJpaWithRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaWithRestApplication.class, args);
	}

	/*
	 * TEST the service using cURL
	 *
	 * curl http://localhost:8080/people
	 *
	 * curl -i -H "Content-Type:application/json" -d "{\"firstName\": \"Frodo\", \"lastName\": \"Baggins\"}" http://localhost:8080/people
	 * -i: Ensures you can see the response message including the headers. The URI of the newly created Person is shown.
	 * -H "Content-Type:application/json": Sets the content type so the application knows the payload contains a JSON object.
	 * -d '{"firstName": "Frodo", "lastName": "Baggins"}': Is the data being sent.
	 *
	 * curl http://localhost:8080/people/search/findByLastName?name=Baggins
	 *
	 * curl -X PUT -H "Content-Type:application/json" -d "{\"firstName\": \"Marino\", \"lastName\": \"Baggins\"}" http://localhost:8080/people/1
	 *
	 * curl http://localhost:8080/people/1
	 *
	 */

}//end of class AccessingDataJpaWithRestApplication
