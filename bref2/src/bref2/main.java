package bref2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.print("------BONJOUR------ \n\n  ");
		System.out.println("-1- Employe Fixe -2- Employe Commission -3- Employe Horaire  ");
		Scanner in= new Scanner(System.in);
        int x;
        x=in.nextInt();
        while(x>4 || x<0) {
        	System.out.println("-1- Employe Fixe -2- Employe Commission -3- Employe Horaire  ");
            x=in.nextInt();

        }

        switch(x) {
        case 1 :EmployeFixe A2=new EmployeFixe();
            System.out.print("Donner Nom");
            A2.setNom(in.next());
            System.out.print("Donner ID");
	        A2.setId(in.nextInt());
            System.out.print("Donner Sallaire");
			A2.setSalaire((float)in.nextFloat());
			A2.afficher();
			break;
        case 2 :EmployeCommission A1=new EmployeCommission();
	        System.out.print("Donner Nom");
	        A1.setNom(in.next());
	        System.out.print("Donner ID");
	        A1.setId(in.nextInt());
	        System.out.print("Donner Sallaire");
			A1.setSalaire((float)in.nextFloat());
	        System.out.print("Donner Commission");
			A1.setCommission(in.nextFloat());
	        System.out.print("Donner Ventes");
			A1.setVentes(in.nextInt());
			A1.afficher();
			break;
        case 3 :EmployeHoraire A3=new EmployeHoraire();
	        System.out.print("Donner Nom");
	        A3.setNom(in.next());
	        System.out.print("Donner ID");
	        A3.setId(in.nextInt());
	        System.out.print("Donner Heures Prestees");
			A3.setHeuresPrestees(in.nextInt());
	        System.out.print("Taux Horaire");
			A3.setTauxHoraire(in.nextFloat());
			A3.afficher();
			break;
        }	
		
		
		
		
		
		
		
		
		
	}
}
