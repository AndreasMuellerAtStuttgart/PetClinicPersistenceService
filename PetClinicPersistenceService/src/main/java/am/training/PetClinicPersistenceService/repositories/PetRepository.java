package am.training.PetClinicPersistenceService.repositories;

import org.springframework.data.repository.CrudRepository;

import am.training.PetClinicPersistenceService.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
