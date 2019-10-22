package ca.sheridancollege.ca.JavaProject;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {

	public List<Person> findByNameLike(String name);

	//public List<Person> findByDateOfBirthGreaterThan(Date date);

}
