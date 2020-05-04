package am.training.PetClinicPersistenceService.repositories;

import org.springframework.data.repository.CrudRepository;

import am.training.PetClinicPersistenceService.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long>{

}
