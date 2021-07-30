package com.izovkic.sfgpetclinicnew.services;

import com.izovkic.sfgpetclinicnew.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {

    Pet findByLastName(String name);

}
