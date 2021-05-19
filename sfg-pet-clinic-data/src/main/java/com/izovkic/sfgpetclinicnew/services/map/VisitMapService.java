package com.izovkic.sfgpetclinicnew.services.map;

import com.izovkic.sfgpetclinicnew.model.Visit;
import com.izovkic.sfgpetclinicnew.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if (visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null
                || visit.getPet() == null || visit.getPet().getOwner() == null) {
            throw new RuntimeException("Invaldi Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}