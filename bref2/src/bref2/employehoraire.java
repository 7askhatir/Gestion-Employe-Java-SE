package bref2;

public class EmployeHoraire extends Employe {
	private float taux_horaire;
	private int heures_prestees;
	
	public void setTauxHoraire(float taux_horaire) {
  		this.taux_horaire=taux_horaire;
  	}
     public float getTauxHoraire() {
 		return this.taux_horaire;
 	}
 	public void setHeuresPrestees(int heures_prestees) {
  		this.heures_prestees=heures_prestees;
  	}
     public int getHeuresPrestees() {
 		return this.heures_prestees;
 	}
     
    public void afficher() {
		System.out.print(" - Nom :"+this.getNom() +"\n- ID : "+getId() +"\n- Salaire mensuel :"+ this.taux_horaire*this.heures_prestees +"MAD");
    }
     
	
	
	

}
