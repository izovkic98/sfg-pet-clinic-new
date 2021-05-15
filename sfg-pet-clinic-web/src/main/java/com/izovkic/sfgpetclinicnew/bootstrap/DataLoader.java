package com.izovkic.sfgpetclinicnew.bootstrap;

import com.izovkic.sfgpetclinicnew.model.Owner;
import com.izovkic.sfgpetclinicnew.model.Pet;
import com.izovkic.sfgpetclinicnew.model.PetType;
import com.izovkic.sfgpetclinicnew.model.Vet;
import com.izovkic.sfgpetclinicnew.services.OwnerService;
import com.izovkic.sfgpetclinicnew.services.PetTypeService;
import com.izovkic.sfgpetclinicnew.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("macka");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAdress("Velika Kosnica 37");
        owner1.setCity("Zagreb");
        owner1.setTelephone("0958887449");

        Pet mikesPet = new Pet();
        mikesPet.setName("Grga");
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setBirthDate(LocalDate.of(1998,3,1));
        mikesPet.setOwner(owner1);
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAdress("Velika Kosnica 37");
        owner2.setCity("Zagreb");
        owner2.setTelephone("0958887449");

        Pet fionasCat = new Pet();
        fionasCat.setName("Đuro");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
