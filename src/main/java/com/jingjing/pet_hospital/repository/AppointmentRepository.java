package com.jingjing.pet_hospital.repository;

import com.jingjing.pet_hospital.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
