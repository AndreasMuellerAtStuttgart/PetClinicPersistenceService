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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_id")
	Long id;
	
	@Version
	int version;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "doctor_id")
	Doctor doctor;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_id")
	Owner owner;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pet_id")
	Pet pet;
	
	@Column(name = "date")
	Date date;
}
