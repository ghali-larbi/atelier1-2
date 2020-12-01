package atelier1;

import java.util.Scanner;

public class exercice4 {
	 public static void myFunctions(String nom,String prenom,int age) {
		 System.out.println("Bonjour "+nom+" "+prenom+" tu as "+age+"ans");
		  }
	 public static void myFunctions2(String genre,int age) {
		 if(genre.equals("homme") && age<18) {
			 System.out.println("vous etre homme mineur");
		 }
		 if(genre.equals("homme") && age>=18) {
			 System.out.println("vous etre homme mageur");
		 }
		 if(genre.equals("femme") && age<18) {
			 System.out.println("vous etre femme mineur");
		 }
		 if(genre.equals("femme") && age>=18) {
			 System.out.println("vous etre femme mineur");
		 }
		  }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("quel votre nom");
		 String nom=scanner.next();
		 System.out.println("quel votre prenom");
		 String prenom=scanner.next();
		 System.out.println("quel votre age");
		 int age=scanner.nextInt();
		myFunctions(nom,prenom,age);
		System.out.println("");
		
		 System.out.println("quel votre genre");
		 String genre=scanner.next();
		 System.out.println("quel votre age");
		 int age2=scanner.nextInt();
		 myFunctions2(genre,age2);
	}
	

}
