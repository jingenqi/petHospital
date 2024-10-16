package com.jingjing.pet_hospital.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String diagnosis;
    private String treatment;
    private String prescription;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    // Getters and Setters

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for date
    public Date getDate() {
        return date;
    }

    // Setter for date
    public void setDate(Date date) {
        this.date = date;
    }

    // Getter for diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    // Setter for diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Getter for treatment
    public String getTreatment() {
        return treatment;
    }

    // Setter for treatment
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    // Getter for prescription
    public String getPrescription() {
        return prescription;
    }

    // Setter for prescription
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    // Getter for pet
    public Pet getPet() {
        return pet;
    }

    // Setter for pet
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
