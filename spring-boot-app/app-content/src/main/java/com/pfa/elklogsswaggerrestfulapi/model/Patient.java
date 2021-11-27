package com.pfa.elklogsswaggerrestfulapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id ;

@Entity
public class Patient implements Serializable{
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int Age;
	private String Nom;
        private String Prenom;
        private String Genre;
        private String Ville;
        private String Email;
        private int DegreDeMaladie;

        public Patient() {
	}
        
        public Patient(Long id, int Age, String Nom, String Prenom, String Genre, String Ville, String Email, int DegreDeMaladie) {
            this.id = id;
            this.Age = Age;
            this.Nom = Nom;
            this.Prenom = Prenom;
            this.Genre = Genre;
            this.Ville = Ville;
            this.Email = Email;
            this.DegreDeMaladie = DegreDeMaladie;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int Age) {
            this.Age = Age;
        }

        public String getNom() {
            return Nom;
        }

        public void setNom(String Nom) {
            this.Nom = Nom;
        }

        public String getPrenom() {
            return Prenom;
        }

        public void setPrenom(String Prenom) {
            this.Prenom = Prenom;
        }

        public String getGenre() {
            return Genre;
        }

        public void setGenre(String Genre) {
            this.Genre = Genre;
        }

        public String getVille() {
            return Ville;
        }

        public void setVille(String Ville) {
            this.Ville = Ville;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public int getDegreDeMaladie() {
            return DegreDeMaladie;
        }

        public void setDegreDeMaladie(int DegreDeMaladie) {
            this.DegreDeMaladie = DegreDeMaladie;
        }

        @Override
        public String toString() {
            return "Patient{" + "id=" + id + ", Age=" + Age + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Genre=" + Genre + ", Ville=" + Ville + ", Email=" + Email + ", DegreDeMaladie=" + DegreDeMaladie + '}';
        }
        
        
        
        
	
}
