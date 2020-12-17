package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Cours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long IdCours;
	private String libelle;
	 private int HDebut;
	 private int Hfin;
	 
		/*
		 * @OneToOne
		 * 
		 * @JoinColumn(name="IdMatiere") private Matiere matiere;
		 * 
		 * @OneToOne
		 * 
		 * @JoinColumn(name="IdSalle") private Salle salle;
		 */

		
		
		public Cours() {
			super();
		}



		public Cours(long idCours, String libelle, int hDebut, int hfin, Matiere matiere, Salle salle) {
			super();
			IdCours = idCours;
			this.libelle = libelle;
			HDebut = hDebut;
			Hfin = hfin;
			/*
			 * this.matiere = matiere; this.salle = salle;
			 */
		}



		public long getIdCours() {
			return IdCours;
		}



		public void setIdCours(long idCours) {
			IdCours = idCours;
		}



		public String getLibelle() {
			return libelle;
		}



		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}



		public int getHDebut() {
			return HDebut;
		}



		public void setHDebut(int hDebut) {
			HDebut = hDebut;
		}



		public int getHfin() {
			return Hfin;
		}



		public void setHfin(int hfin) {
			Hfin = hfin;
		}



		/*
		 * public Matiere getMatiere() { return matiere; }
		 * 
		 * 
		 * 
		 * public void setMatiere(Matiere matiere) { this.matiere = matiere; }
		 * 
		 * 
		 * 
		 * public Salle getSalle() { return salle; }
		 * 
		 * 
		 * 
		 * public void setSalle(Salle salle) { this.salle = salle; }
		 */
		
		
}
