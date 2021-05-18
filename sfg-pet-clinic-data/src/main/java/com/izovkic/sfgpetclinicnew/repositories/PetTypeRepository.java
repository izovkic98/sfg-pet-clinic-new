package com.izovkic.sfgpetclinicnew.repositories;

import com.izovkic.sfgpetclinicnew.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
