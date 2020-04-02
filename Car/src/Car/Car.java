package Car;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;




import java.util.Random;

import java.util.Scanner;


import Motor.Motor;
import Motor.MotorRapide;
import Wheels.Wheels;

public class Car {
	int Id;
	String Name;
	String Color;
	int Speed;
	String Power;
	Motor Moteur;
	Scanner scan = new Scanner(System.in);
	Wheels[] Arraywheels = new Wheels[4];
	String Volant;
	String Frein;
	String Retro;
	 String motdesordre;
	Car() {
		
	}
	
	
	Car(int id, String name, String color, int speed, String power,  Motor moteur, Wheels[] arraywheels,  String volant, String frein ) {
		Name = name;
		Color = color;
		Speed = speed;
		Power = power;
		Id = id;
		Motor Moteur = moteur;
		Wheels[] Arraywheels = arraywheels;
		Volant = volant;
		Frein = frein;
		
		
				
	}
	public void FillCarInfo(){
		 System.out.println("Veuillez écrire le nom de votre voiture ( modèle de voiture )");
		 Name = scan.next();
		 System.out.println("La marque de votre voiture est : " + Name);
		 System.out.println("Maintenant, vous pouvez choisir la couleur de votre voiture, soit Bleu (tape 1), soit jaune (tape 2), soit rouge (tape 3)");
		 
		 while( scan.hasNextInt() == false ) {
			 System.out.println("Choisie un nombre entre 1 , 2 et 3 pour corespondre au couleur");
			 scan.next();
			}
		 int answer = scan.nextInt();
		 switch(answer) {
		  case 1:
			  Color = "BLUE";
			  System.out.println( ansi().eraseScreen().fg(BLUE).a("La couleur de votre voiture est : " + Color).reset() );
			 
		    break;
		  case 2:
			  Color = "YELLOW";
			  System.out.println( ansi().eraseScreen().fg(YELLOW).a("La couleur de votre voiture est : " + Color).reset() );
			  break;
			  
		  case 3:
			  Color = "RED";
			  System.out.println( ansi().eraseScreen().fg(RED).a("La couleur de votre voiture est : " + Color).reset() );
			  break;
		  default:
			   
				 
			
		 }
		
		

	}
	
	protected void SpeedCarFast() {
		
		Speed = scan.nextInt();
		Power = "faible puissance";
		
		
		System.out.println("Votre voiture de couleur  à une vitesse de "  + Speed + "  et une puissance de " + Power );
		
		 System.out.println();
         if(Speed > 30) {
        	 Frein = "frein";
        	 Volant = "volant";
			Retro = "retro";
			
			 String[] tab = {Frein, Volant, Retro};
			 Random r = new Random();
			 String piecelost = tab[r.nextInt(tab.length)];
			
			
			 
			 System.out.println("Votre voiture avance rapidement, attention vous risquer de perdre des pieces en routes!!!");
			
			
			
			 char reponse = 'O';
			 Scanner sc = new Scanner(System.in);
			 while (reponse == 'O') {
				 System.out.println("Vous venez de perdre une piece : " + piecelost );
				 System.out.println("Taper dans la console le nom de la piece a reparer");
				 String piece = scan.next();
				 if(piece.equals(piecelost)) {
					 System.out.println(ansi().eraseScreen().fg(GREEN).a("La piece est desormais reparer"));
					 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture a fini sont parcoure apres 50 km, fin du jeu"));
				 }
				 else {
					
					 System.out.println("Piece toujour manquante...");
					
				 }
				 reponse = ' ';
				 while(reponse != 'O' && reponse != 'N' && !piece.equals(piecelost))
				  {
				   
				    System.out.println(ansi().eraseScreen().fg(RED).a("Voulez-vous réessayer ? (O/N)"));
				    reponse = sc.nextLine().charAt(0);
				   
				  }
				 
			 }
		
			
			 
		 }
		 else {
			 System.out.println(ansi().eraseScreen().fg(GREEN).a("Votre voiture avance normalement, tout va pour le mieux"));
			 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture a fini sont parcoure apres 50 km, fin du jeu"));
			
		 }
	}
	public void SpeedCarSlow() {
		Speed = scan.nextInt();
		Power = "faible puissance";
		
	
			 System.out.println("Votre voiture à une vitesse de "  + Speed + "  et une puissance de " + Power);
	
         if(Speed > 30) {
        	 
        	
    			 System.out.println("Votre voiture avance normalement, pas de boost de vitesse");
    			 System.out.println("La voiture a fini sont parcoure apres 50 km, fin du jeu");
    		
  
			 
		 }
		 else {
			
    		 System.out.println("Votre voiture avance doucement, vous avec le droit a un boost de vitesse...");
    		 System.out.println("Pour que le boost s'active, entreer les lettres du mot dans le meme ordre qui va apparaitre.");
    		
   	
			 Random rand = new Random();
			 String alphabet = "VITESSE";
			 int longueur = alphabet.length();
			 
			 for(int i = 0; i < 7; i++) {
				 int k = rand.nextInt(longueur);
			  
				 motdesordre = alphabet.charAt(k)+"";
			
			   System.out.print(motdesordre);
			   
				
			  
			 }
			
			 String boost = scan.next();
			
			 if(boost == motdesordre) {
				 
				 System.out.println(ansi().eraseScreen().fg(GREEN).a("Boost active avec succes"));
				 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture a fini sont parcoure apres 50 km, fin du jeu"));
				 
			 }
			 else {
				 System.out.println(ansi().eraseScreen().fg(RED).a("Ejecte d'activation du Boost"));
				 System.out.println(ansi().eraseScreen().fg(RED).a("La voiture n'a fini sont parcoure, fin du jeu"));
			 }
			
			 
			
		 }
	}
	}

