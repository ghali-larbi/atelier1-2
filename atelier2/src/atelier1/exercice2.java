package atelier1;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("entrer prix ht");
		float prix=scanner.nextFloat();
		System.out.println("entrer tva");
		float tva=scanner.nextFloat();
		System.out.println("ttc est : "+prix+prix*tva);
	}

}
