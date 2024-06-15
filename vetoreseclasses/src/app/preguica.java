package app;

import java.util.Locale;
import java.util.Scanner;

public class preguica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0.0;
		
		System.out.print("Quantos elementos vai digitar? ");
	    int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		for (int i = 0; i < vect.length; i++) {
			media += vect[i];
			
		}media = media/n;
		System.out.printf("MEDIA DO VETOR: %.3f\n", media);
		for (int i = 0; i < vect.length; i++) {
		if (vect[i] < media) {
			System.out.println(	"ELEMENTOS ABAIXO DA MEDIA: "+ vect[i]);
		}
		}
		
		sc.close();
	}

}
