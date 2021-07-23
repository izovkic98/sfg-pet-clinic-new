package com.izovkic.sfgpetclinicnew.repositories;

import com.izovkic.sfgpetclinicnew.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
