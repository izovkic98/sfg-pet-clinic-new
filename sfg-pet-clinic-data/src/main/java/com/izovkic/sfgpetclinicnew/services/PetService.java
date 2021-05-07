package com.izovkic.sfgpetclinicnew.services;

import com.izovkic.sfgpetclinicnew.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findByLastName(String name);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
