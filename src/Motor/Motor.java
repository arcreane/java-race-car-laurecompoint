package Motor;

import java.util.Scanner;



public class Motor {
	String Marque;

	Scanner scan = new Scanner(System.in);
	
	 Motor(){
			
		}
	 Motor(String marque){
		  Marque = marque;
		
		 
	  }
	  public void initMoteurRapide() {
			
			 System.out.println("Votre moteur de voiture est :");
			 Marque = "moteur thermique";
			
			
			System.out.println( Marque );
			
			
			
			
	}
	  public void initMoteurSlow() {
			
			 System.out.println("Votre moteur de voiture est :");
			 Marque = "moteur electrique";
			
			
			System.out.println( Marque );
			
			
			
		}
}
