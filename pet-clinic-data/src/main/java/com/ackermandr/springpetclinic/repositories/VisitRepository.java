package com.ackermandr.springpetclinic.repositories;

import com.ackermandr.springpetclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
