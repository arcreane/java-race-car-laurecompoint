package Car;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;




import java.util.Random;

import java.util.Scanner;


import Motor.Motor;



public class Car{
	int Id;
	String Name;
	String Color;
	int Speed;
	Motor Moteur;
	Scanner scan = new Scanner(System.in);
	String Wheels[] = {"roue1", "roue2", "roue3", "roue4"};
	String Volant;
	String Frein;
	String Retro;
	
	 String motdesordre;
	Car() {
		
	}
	
	
	Car(int id, String name, String color, int speed, Motor moteur, String wheels[] ,  String volant, String frein ) {
		Name = name;
		Color = color;
		Speed = speed;
		Id = id;
		Motor Moteur = moteur;
		String Wheels[]  =  {"roue1", "roue2", "roue3", "roue4"};
		Volant = volant;
		Frein = frein;
				
	}
	public void FillCarInfo(){
		
		 System.out.println("Veuillez écrire le nom de votre voiture ( modèle de voiture )");
		 Name = scan.next();
		 System.out.println("La marque de votre voiture est : " + Name);
		 System.out.println("Maintenant, vous pouvez choisir la couleur de votre voiture "+ Name + " , soit Bleu (tape 1), soit jaune (tape 2), soit rouge (tape 3)");
		 
		 while( scan.hasNextInt() == false ) {
			 System.out.println("Veuillez choisir un nombre entre 1 , 2 et 3 pour corespondre au couleur");
			 scan.next();
			}
		 int answer = scan.nextInt();
		 switch(answer) {
		  case 1:
			  Color = "BLUE";
			  System.out.println( ansi().eraseScreen().fg(BLUE).a("La couleur de votre voiture "+ Name + " est : " + Color) );
			 
		    break;
		  case 2:
			  Color = "YELLOW";
			  System.out.println( ansi().eraseScreen().fg(YELLOW).a("La couleur de votre voiture "+ Name + " est : " + Color) );
			  break;
			  
		  case 3:
			  Color = "RED";
			  System.out.println( ansi().eraseScreen().fg(RED).a("La couleur de votre voiture "+ Name + " est : " + Color) );
			  break;
		  default:
			   
				 
			
		 }
		
		

	}
	
	protected void SpeedCarFast() {
		
		
		 int[] speedcar = { 40, 50, 60, 70, 80, 90, 100 };
		 Random r1 = new Random();
		 Speed = speedcar[r1.nextInt(speedcar.length)];
		 
		 
		
		 while(Speed <= 60) {
			 System.out.println("Votre voiture à une vitesse de "  + Speed + "et n'a pas encore perdu de piece");
			 Speed++;
		 }
		 System.out.println();
         if(Speed >= 60) {
        	 System.out.println("Votre voiture à une vitesse de "  + Speed  );
        	 Frein = "frein";
        	 Volant = "volant";
			 Retro = "retro";
			 
			 System.out.println("Votre voiture avance rapidement, attention vous risquer de perdre des pièces en routes!!!");
			
			 char reponse = 'O';
			 char reponsetemps = 'O';
			
			 while (reponse == 'O') {
				 String[] tab = {Frein, Volant, Retro, Wheels[0],Wheels[1],Wheels[2], Wheels[3] };
				 Random r2 = new Random();
				 String piecelost = tab[r2.nextInt(tab.length)];
				
				 System.out.println("Vous venez de perdre une pièce : " + piecelost );
				 System.out.println("Taper dans la console le nom de la pièce a reparé en moins de 6 secondes pour reussir à la réparer");
				
				 long timestart = System.currentTimeMillis();
				 String piece = scan.next();
				 System.out.println(piece);
				 long timeend = System.currentTimeMillis();
				 float time = (timeend - timestart) / 1000F;
				   
				  System.out.println("Opération réparation de piece effectuée en: "+ Float.toString(time) + " secondes.");
				 if(time <  6 ){
					 if(piece.equals(piecelost)) {
						 System.out.println("Vous avez reparer la pièce dans le Temps impartie, vous avez mis   " + time + "  seconde a reparer votre piece") ;
						 System.out.println(ansi().eraseScreen().fg(GREEN).a("La pièce est désormais réparée"));
						
					 }
					 else {
						
						 System.out.println("Piece toujour manquante...");
						
					 }
					
					
				 }
				 else {
					 System.out.println("Vous n'avez pas réussi à réparer la pièce dans le Temps imparti, vous avez mis " + time + " seconde à reparer votre piece");
					  System.out.println(ansi().eraseScreen().fg(RED).a("Votre voiture  ne parvient pas à finir la course à cause de la piece manquante " + piecelost));
				 }
				
				
				
				 
			 }
		
			
			 
		 }
         else {
			 System.out.println("Votre voiture  à une vitesse de "  + Speed + "Et n'a pas perdu de piece" );
			 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture à fini sont parcoure apres 50 km, fin du jeu"));
		 }
		
	}
	public void SpeedCarSlow() {
		
		 int[] speedcar = { 30, 28, 20, 6, 9, 5, 25};
		 Random r3 = new Random();
		 Speed = speedcar[r3.nextInt(speedcar.length)];
		
		 while(Speed <= 20) {
			 System.out.println("Votre voiture à une vitesse de "  + Speed +  "et n'a pas encore le droit d'avoir un boost de vitesse" );
			 Speed++;
		 }
         if(Speed <= 30) {
        	 System.out.println("Votre voiture  à une vitesse de "  + Speed );
    		 System.out.println("Votre voiture   avance doucement, vous avez le droit à un boost de vitesse...");
    		 System.out.println("Pour que le boost s'active, entrer les lettres du mot dans le même ordre qui va apparaitre en moins de 3 secondes.");
    		
   	
			 Random rand = new Random();
			 String alphabet = "VITESSE";
			 int longueur = alphabet.length();
			 
			 for(int i = 0; i < 7; i++) {
				 int k = rand.nextInt(longueur);
			  
				 motdesordre = alphabet.charAt(k)+"";
			
			   System.out.print(motdesordre);
			   
				
			  
			 }
			 long timestart = System.currentTimeMillis();
			 String boost = scan.next();
			 System.out.println(boost);
			 long timeend = System.currentTimeMillis();
			 float time = (timeend - timestart) / 1000F;
			   
			  System.out.println("Opération réparation de piece effectuée en: "+ Float.toString(time) + " secondes.");
			
			  if(time <  3 ){
				  if(boost == motdesordre) {
						 
						 System.out.println(ansi().eraseScreen().fg(GREEN).a("Boost active avec succes"));
						
						 
					 }
					 else {
						 System.out.println(ansi().eraseScreen().fg(RED).a("Ejecte d'activation du Boost"));
						
					 } 
			  }
			  else {
				  System.out.println("Votre voiture  n'as pas eu de boost de vitesse");
			  }
			
			
			
			 
			
		 }
         else {
			 System.out.println("Votre voiture  à une vitesse de "  + Speed  + "et n'a pas besoins d'avoir un boost de vitesse" );
		 }
        
	}
	}

