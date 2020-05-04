package am.training.PetClinicPersistenceService.repositories;

import org.springframework.data.repository.CrudRepository;

import am.training.PetClinicPersistenceService.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
