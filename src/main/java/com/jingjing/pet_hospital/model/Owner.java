package com.jingjing.pet_hospital.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pet> pets;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for contactInfo
    public String getContactInfo() {
        return contactInfo;
    }

    // Setter for contactInfo
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Getter for pets
    public List<Pet> getPets() {
        return pets;
    }

    // Setter for pets
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    
    // Optionally, you can add methods to add or remove pets from the list
    public void addPet(Pet pet) {
        pets.add(pet);
        pet.setOwner(this); // Set the owner of the pet
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
        pet.setOwner(null); // Remove the owner reference from the pet
    }
}
