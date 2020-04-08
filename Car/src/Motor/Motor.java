package Motor;

import java.util.Scanner;



public class Motor {
	String Marque;
	int Power;

	Scanner scan = new Scanner(System.in);
	
	 Motor(){
			
		}
	 Motor(String marque, int power){
		  Marque = marque;
		  Power = power;
		
		 
	  }
	  public void initMoteurRapide() {
			
			 System.out.println("Votre moteur de voiture est :");
			 Marque = "moteur thermique";
			 Power = 850;
			
			
			System.out.println( Marque );
			System.out.println( "La puissance de votre voiture est de " + Power + " ch"  );
			
			
			
			
	}
	  public void initMoteurSlow() {
			
			 System.out.println("Votre moteur de voiture est :");
			 Marque = "moteur electrique";
			 Power = 250;
			
			System.out.println( Marque );
			
			System.out.println( "La puissance de votre voiture est de " + Power + " ch"  );
			
		}
}
