package net.yorksolutions.myfirstjavaproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity is an annotation to tell Spring this class is a table
@Entity
public class Cache {
	@Id
			@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;

	Integer input;
	String output;
}
