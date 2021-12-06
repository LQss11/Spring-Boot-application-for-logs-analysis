package com.pfa.elklogsswaggerrestfulapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.elklogsswaggerrestfulapi.model.Docteur;


@Service
public class DocteurService {
	
	
    @Autowired
    private com.pfa.elklogsswaggerrestfulapi.repository.DocteurRepository DocteurRepository;

    public List<Docteur> GetAllDocteurs() {                                     //GET ALL
        List<Docteur> Docteurs = new ArrayList<>();
        DocteurRepository.findAll()
                .forEach(Docteurs::add);
        return Docteurs;
    }
    public List<Docteur> GetAllDocteurs2() {
        return DocteurRepository.findAll();
    }
    
    public Optional<Docteur> getDocteur(Long id)                                //GET ONE
    {
        return DocteurRepository.findById(id);
    }

    public String addDocteur(Docteur Docteur) {                           //POST ONE
        
        try {
            DocteurRepository.save(Docteur);
            return "ajouté avec succès!";
        } catch (Exception e) {
            return "erreur d'ajout";
        }  
    }

    public String updateDocteur(Long id, List<Docteur> Docteur) {               //UPDATE
        try {
            DocteurRepository.saveAll(Docteur);
            return "ajouté avec succès!";
        } catch (Exception e) {
            return "erreur d'ajout";
        }        
        

    }

    public String deleteDocteur(Long id) {                                      //DELETE ONE
        try {
            DocteurRepository.deleteById(id);
            return "Supprimé avec succès!";
        } catch (Exception e) {
            return "erreur de suppression";
        }        
        
    }

    public String deleteAllDocteurs() {                                         //DELETE ALL
        try {
            DocteurRepository.deleteAll();
            return "Supprimé avec succès!";
        } catch (Exception e) {
            return "erreur de suppression";
        }
    }

}
