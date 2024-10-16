package com.jingjing.pet_hospital.repository;

import com.jingjing.pet_hospital.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
