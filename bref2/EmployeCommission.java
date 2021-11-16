package bref2;

public class EmployeCommission extends EmployeFixe {
     private float commission;
     private int ventes;
 
     public void setCommission(float commission) {
  		this.commission=commission;
  	}
     public float getCommission() {
 		return this.commission;
 	}
     public void setVentes(int ventes) {
  		this.ventes=ventes;
  	}
     public int getVentes() {
 		return this.ventes;
 	}
     
     public void afficher() {
 		System.out.print("\n -Nom :"+getNom() +"\n- ID : "+getId() +"\n- Salaire mensuel :"+ (getSalaire()+this.commission*this.ventes) +" MAD");
 	}
    
}
