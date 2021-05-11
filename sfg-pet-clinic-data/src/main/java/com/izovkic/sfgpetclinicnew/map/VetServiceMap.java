package com.izovkic.sfgpetclinicnew.map;

import com.izovkic.sfgpetclinicnew.model.Vet;
import com.izovkic.sfgpetclinicnew.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
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
    public void save(Vet object) {
        super.save( object);
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