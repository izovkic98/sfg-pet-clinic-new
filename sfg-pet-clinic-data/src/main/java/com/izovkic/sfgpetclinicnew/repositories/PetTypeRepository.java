package com.izovkic.sfgpetclinicnew.repositories;


import com.izovkic.sfgpetclinicnew.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 8/5/18.
 */
@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
