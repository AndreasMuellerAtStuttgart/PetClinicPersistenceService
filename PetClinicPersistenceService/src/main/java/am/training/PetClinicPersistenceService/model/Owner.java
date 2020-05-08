package am.training.PetClinicPersistenceService.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id")
	Long ownerId;
	
	@Version
	int version;
	
	@Column(name = "first_name", nullable = false)
	String firstName;
	
	@Column(name = "last_name", nullable = false)
	String lastName;
	
	@Column(name = "birth_date", nullable = false)
	Date birthDate;
	
	@OneToMany(mappedBy = "owner", cascade = {CascadeType.REMOVE, CascadeType.MERGE})
	List<Pet> pets;
}
