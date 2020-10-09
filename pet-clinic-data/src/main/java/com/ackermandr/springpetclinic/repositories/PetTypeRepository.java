package com.ackermandr.springpetclinic.repositories;

import com.ackermandr.springpetclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
