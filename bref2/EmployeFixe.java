package bref2;

public class EmployeFixe extends Employe {
     private float salaire;
     public void setSalaire(float salaire) {
  		this.salaire=salaire;
  	}
     public float getSalaire() {
		return this.salaire;
	}
	public void afficher() {
		System.out.print("\n -Nom :"+this.getNom() +"\n- ID : "+getId() +"\n- Salaire mensuel :"+ this.salaire +"MAD");
	}
      
     
}
