package pl.oakfusion.sample.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HelloEntity {

	@Id
	@GeneratedValue
	public Long id;
}
