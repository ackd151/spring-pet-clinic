package com.ackermandr.springpetclinic.repositories;

import com.ackermandr.springpetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
