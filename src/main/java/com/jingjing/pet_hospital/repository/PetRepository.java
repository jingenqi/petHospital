package com.jingjing.pet_hospital.repository;

import com.jingjing.pet_hospital.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
