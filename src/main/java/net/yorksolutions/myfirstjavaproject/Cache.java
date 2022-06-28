package net.yorksolutions.myfirstjavaproject;

import javax.persistence.Entity;
import javax.persistence.Id;

// @Entity is an annotation to tell Spring this class is a table
@Entity
public class Cache {
	@Id
	Long id;

	Integer input;
	String output;
}
