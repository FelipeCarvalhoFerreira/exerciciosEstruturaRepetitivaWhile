package exerciciosEstruturaRepetitivaWhile;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		/*
		System.out.println("Informar Numero");
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X > 0.0 && Y > 0.0 ) {
			System.out.println("Primeiro ");
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		while (X > 0.0 && Y < 0.0) {
			System.out.println("Segundo ");
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		while (X < 0.0 && Y < 0.0) {
			System.out.println("Terceiro ");
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		while (X < 0.0 && Y > 0.0) {
			System.out.println("Quarto ");
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}

	System.out.println("Cordenada NUla ");

	sc.close();
	*/
		
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
