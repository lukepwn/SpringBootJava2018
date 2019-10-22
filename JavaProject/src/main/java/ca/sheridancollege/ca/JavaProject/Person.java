package ca.sheridancollege.ca.JavaProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "Name", length = 64, nullable = false)
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}
