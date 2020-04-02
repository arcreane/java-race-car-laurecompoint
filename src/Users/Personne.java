package Users;

import java.util.Scanner;

import Car.CarFast;

public class Personne {
	
	int Id;
	String LastName;
	String FirstName;
	Scanner scan = new Scanner(System.in);
	
    Personne() {
		
	}
	
	
    Personne(int id, String lastname,  String firtsname) {
		LastName = lastname;
		FirstName = lastname;
		
		
		Id = id;
		
		
	}

	public static Personne createuser() {
		// TODO Auto-generated method stub
		 Personne user = new Personne();
			
	       
	        user.UserInfo();
			return user;
	}


	private void UserInfo() {
		// TODO Auto-generated method stub
		System.out.println("Ecrit ton prenom et ton nom pour pouvoir commencer le jeu de voiture");
		 FirstName = scan.next();
		 LastName = scan.next();
		 System.out.println("Votre nom est" + "  " + FirstName + "  " + LastName );
		
	}

}
