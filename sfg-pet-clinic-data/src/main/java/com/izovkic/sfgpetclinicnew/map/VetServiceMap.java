package com.izovkic.sfgpetclinicnew.map;

import com.izovkic.sfgpetclinicnew.model.Vet;
import com.izovkic.sfgpetclinicnew.services.CrudService;
import com.izovkic.sfgpetclinicnew.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService  {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}