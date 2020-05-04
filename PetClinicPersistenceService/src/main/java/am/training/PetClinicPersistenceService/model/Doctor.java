package am.training.PetClinicPersistenceService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import am.training.petclinic.PetClinicSharedModel.model.DoctorExperience;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long doctorId;
	
	@Version
	int version;
	
	@Column(name = "first_name")
	String firstName;
	
	@Column(name = "last_name")
	String lastName;
	
	@Column(name = "birth_date")
	Date birthDate;
	
	@Column(name = "experience")
	DoctorExperience experience;
}
