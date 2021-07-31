package com.izovkic.sfgpetclinicnew.services;


import com.izovkic.sfgpetclinicnew.model.Pet;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 7/18/18.
 */
@Service
public interface PetService extends CrudService<Pet, Long> {

}
