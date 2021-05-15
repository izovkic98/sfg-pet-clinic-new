package com.izovkic.sfgpetclinicnew.map;

import com.izovkic.sfgpetclinicnew.model.PetType;
import com.izovkic.sfgpetclinicnew.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void save(PetType object) {
        super.save(object);
    }

    @Override
    public void delete(PetType object) {

        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
