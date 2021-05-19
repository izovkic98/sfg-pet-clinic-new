package com.izovkic.sfgpetclinicnew.services.map;

import com.izovkic.sfgpetclinicnew.model.Pet;
import com.izovkic.sfgpetclinicnew.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save( object);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findByLastName(String name) {
        return null;
    }
}