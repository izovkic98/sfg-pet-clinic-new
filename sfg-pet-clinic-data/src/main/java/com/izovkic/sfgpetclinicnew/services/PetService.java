package com.izovkic.sfgpetclinicnew.services;

import com.izovkic.sfgpetclinicnew.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    Pet findByLastName(String name);

}
