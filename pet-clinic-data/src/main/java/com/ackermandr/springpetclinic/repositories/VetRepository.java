package com.ackermandr.springpetclinic.repositories;

import com.ackermandr.springpetclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
