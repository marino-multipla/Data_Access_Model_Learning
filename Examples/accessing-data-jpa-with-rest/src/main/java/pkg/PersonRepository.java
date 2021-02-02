package pkg;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * DATA: 02/01/2021
 * AUTHOR: Maccagni Giacomo
 * DESCRIPTION:
 * Create a simple repository, as the following listing
 *
 * At runtime, Spring Data REST automatically creates an implementation of this interface.
 * Then it uses the @RepositoryRestResource annotation to direct Spring MVC to create RESTful
 * endpoints at /people.
 * @RepositoryRestResource is not required for a repository to be exported.
 * It is used only to change the export details, such as using /people instead of
 * the default value of /persons.
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);

}//end of class PersonRepository
