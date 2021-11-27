package com.pfa.elklogsswaggerrestfulapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.elklogsswaggerrestfulapi.model.Patient;


@Service
public class PatientService {


    @Autowired
    private com.pfa.elklogsswaggerrestfulapi.repository.PatientRepository PatientRepository;

    public List<Patient> GetAllPatients() {                                     //GET ALL
        List<Patient> Patients = new ArrayList<>();
        PatientRepository.findAll()
                .forEach(Patients::add);
        return Patients;
    }

    public Optional<Patient> getPatient(Long id)                                //GET ONE
    {
        return PatientRepository.findById(id);
    }

    public String addPatient(List<Patient> Patient) {                           //POST ONE
        
        try {
            PatientRepository.saveAll(Patient);
            return "ajouté avec succès!";
        } catch (Exception e) {
            return "erreur d'ajout";
        }  
    }

    public String updatePatient(Long id, List<Patient> Patient) {               //UPDATE
        try {
            PatientRepository.saveAll(Patient);
            return "ajouté avec succès!";
        } catch (Exception e) {
            return "erreur d'ajout";
        }        
        

    }

    public String deletePatient(Long id) {                                      //DELETE ONE
        try {
            PatientRepository.deleteById(id);
            return "Supprimé avec succès!";
        } catch (Exception e) {
            return "erreur de suppression";
        }        
        
    }

    public String deleteAllPatients() {                                         //DELETE ALL
        try {
            PatientRepository.deleteAll();
            return "Supprimé avec succès!";
        } catch (Exception e) {
            return "erreur de suppression";
        }
    }
	
	
}
