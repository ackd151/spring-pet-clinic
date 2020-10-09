package com.ackermandr.springpetclinic.services;

import com.ackermandr.springpetclinic.models.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
