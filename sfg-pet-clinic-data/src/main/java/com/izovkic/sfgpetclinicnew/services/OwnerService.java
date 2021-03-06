package com.izovkic.sfgpetclinicnew.services;



import com.izovkic.sfgpetclinicnew.model.Owner;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by jt on 7/18/18.
 */

@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
