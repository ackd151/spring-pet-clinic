package com.ackermandr.springpetclinic.repositories;

import com.ackermandr.springpetclinic.models.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
