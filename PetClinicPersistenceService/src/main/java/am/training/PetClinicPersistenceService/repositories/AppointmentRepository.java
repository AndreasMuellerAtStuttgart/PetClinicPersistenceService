package am.training.PetClinicPersistenceService.repositories;

import org.springframework.data.repository.CrudRepository;

import am.training.PetClinicPersistenceService.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
	
}
