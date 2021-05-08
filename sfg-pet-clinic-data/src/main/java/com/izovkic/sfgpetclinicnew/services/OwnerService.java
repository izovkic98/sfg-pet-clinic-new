package com.izovkic.sfgpetclinicnew.services;

import com.izovkic.sfgpetclinicnew.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
