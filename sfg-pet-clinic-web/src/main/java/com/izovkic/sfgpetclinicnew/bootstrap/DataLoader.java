package com.izovkic.sfgpetclinicnew.bootstrap;

import com.izovkic.sfgpetclinicnew.model.Owner;
import com.izovkic.sfgpetclinicnew.model.PetType;
import com.izovkic.sfgpetclinicnew.model.Vet;
import com.izovkic.sfgpetclinicnew.services.OwnerService;
import com.izovkic.sfgpetclinicnew.services.PetTypeService;
import com.izovkic.sfgpetclinicnew.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {


        PetType dog = new PetType();
        dog.setName("ker");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("macka");
        PetType savedCat = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
