package com.izovkic.sfgpetclinicnew.repositories;


import com.izovkic.sfgpetclinicnew.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 8/5/18.
 */
@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
