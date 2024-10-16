package com.jingjing.pet_hospital.repository;

import com.jingjing.pet_hospital.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
