package com.pfa.elklogsswaggerrestfulapi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Docteur implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int Age;
  private String Nom;
  private String Prenom;
  private String Specialite;
  private String Genre;
  private String Ville;
  private String Email;
  private int NombrePatientParJour;
  private int DebutTravaille;
  private int FinTravaille;

  public Docteur() {}

  public Docteur(
    Long id,
    int Age,
    String Nom,
    String Prenom,
    String Specialite,
    String Genre,
    String Ville,
    String Email,
    int NombrePatientParJour,
    int DebutTravaille,
    int FinTravaille
  ) {
    this.id = id;
    this.Age = Age;
    this.Nom = Nom;
    this.Prenom = Prenom;
    this.Specialite = Specialite;
    this.Genre = Genre;
    this.Ville = Ville;
    this.Email = Email;
    this.NombrePatientParJour = NombrePatientParJour;
    this.DebutTravaille = DebutTravaille;
    this.FinTravaille = FinTravaille;
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

  public String getSpecialite() {
    return Specialite;
  }

  public void setSpecialite(String Specialite) {
    this.Specialite = Specialite;
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

  public int getNombrePatientParJour() {
    return NombrePatientParJour;
  }

  public void setNombrePatientParJour(int NombrePatientParJour) {
    this.NombrePatientParJour = NombrePatientParJour;
  }

  public int getDebutTravaille() {
    return DebutTravaille;
  }

  public void setDebutTravaille(int DebutTravaille) {
    this.DebutTravaille = DebutTravaille;
  }

  public int getFinTravaille() {
    return FinTravaille;
  }

  public void setFinTravaille(int FinTravaille) {
    this.FinTravaille = FinTravaille;
  }

  @Override
  public String toString() {
    return (
      "Docteur{" +
      "id=" +
      id +
      ", Age=" +
      Age +
      ", Nom=" +
      Nom +
      ", Prenom=" +
      Prenom +
      ", Specialite=" +
      Specialite +
      ", Genre=" +
      Genre +
      ", Ville=" +
      Ville +
      ", Email=" +
      Email +
      ", NombrePatientParJour=" +
      NombrePatientParJour +
      ", DebutTravaille=" +
      DebutTravaille +
      ", FinTravaille=" +
      FinTravaille +
      '}'
    );
  }
}
