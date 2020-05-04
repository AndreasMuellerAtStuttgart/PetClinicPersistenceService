package am.training.PetClinicPersistenceService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import am.training.petclinic.PetClinicSharedModel.model.Pet;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id")
	Long ownerId;
	
	@Version
	int version;
	
	@Column(name = "first_name")
	String firstName;
	
	@Column(name = "last_name")
	String lastName;
	
	@Column(name = "birth_date")
	Date birthDate;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="pet_id")
	Pet pet;
}
