package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * DATA: 02/02/2021
 * AUTHOR:Maccagni Giacomo
 * DESCRIPTION:
 *
 * This is a simple application that uses Spring Data JPA to save objects
 * to and fetch them from a database, all without writing a concrete repository implementation.
 * Java Persistance API;
 *
 * By default, Spring Boot enables JPA repository support
 * and looks in the package (and its subpackages) where @SpringBootApplication is located.
 * If your configuration has JPA repository interface definitions located in a package
 * that is not visible, you can point out alternate packages by using
 * @EnableJpaRepositories and its type-safe basePackageClasses=MyRepository.class parameter.
 */

@SpringBootApplication
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(customer1 -> {
				log.info(customer1.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");

			// fetch an individual customer by FirstName
			customer = repository.findByFirstName("Jack");
			log.info("Customer found with FirstName(Jack):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

		};
	}

}//end of class AccessingDataJpaApplication
