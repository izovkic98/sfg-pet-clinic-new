package com.izovkic.sfgpetclinicnew.map;

import com.izovkic.sfgpetclinicnew.model.Pet;
import com.izovkic.sfgpetclinicnew.services.CrudService;
import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long> {
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
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
