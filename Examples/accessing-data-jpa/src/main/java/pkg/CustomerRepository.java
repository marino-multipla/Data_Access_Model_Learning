package pkg;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * DATA: 02/02/2021;
 * AUTHOR: Maccagni Giacomo;
 * DESCRIPTION:
 * Spring Data JPA focuses on using JPA to store data in a relational database.
 * Its most compelling feature is the ability to create repository implementations automatically,
 * at runtime, from a repository interface.
 *
 * In a typical Java application, you might expect to write a class that implements CustomerRepository.
 * However, that is what makes Spring Data JPA so powerful:
 * You need not write an implementation of the repository interface.
 * Spring Data JPA creates an implementation when you run the application.
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

    Customer findByFirstName(String firstName);

}//end of class CustomerRepository
