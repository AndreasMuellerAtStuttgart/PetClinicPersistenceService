package am.training.PetClinicPersistenceService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import am.training.petclinic.PetClinicSharedModel.model.Owner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pet_id")
	Long petId;
	
	@Version
	int version;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "animal_type")
	String animalType;
	
	@OneToOne(fetch=FetchType.EAGER, mappedBy="pet")
	Owner owner;
}
