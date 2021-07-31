package com.izovkic.sfgpetclinicnew.repositories;


import com.izovkic.sfgpetclinicnew.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 8/5/18.
 */
@Repository
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
