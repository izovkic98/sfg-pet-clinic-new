package com.izovkic.sfgpetclinicnew.services;

import com.izovkic.sfgpetclinicnew.model.Owner;

import java.util.Set;

public interface Vet {

    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
