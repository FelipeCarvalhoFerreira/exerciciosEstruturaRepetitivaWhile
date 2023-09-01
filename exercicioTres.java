package exerciciosEstruturaRepetitivaWhile;

import java.util.Locale;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Informar Numero");
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();
		
		while (senha != 2002) {
		System.out.println("senha invalida " + senha);
		senha = sc.nextInt();
		
		}
		
		System.out.println("senha permitido " + senha);
		
		sc.close();

	}

}
