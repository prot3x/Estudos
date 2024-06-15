package app;

import java.util.Locale;
import java.util.Scanner;

import enterprise.Product;

public class Testevetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		Product[] vect = new Product[n];
        String name;
        String email;
        int room = 0;
        int rooms = 0;
        
        System.out.print("How many rooms will be rented? ");
        rooms = sc.nextInt();
		
		for (int i = 0; i < rooms; i++) {
			System.out.println("Rent #"+ i+1);
			System.out.print("name:");
			name = sc.nextLine();
			sc.next();
			System.out.print("email:");
			email = sc.nextLine();
			sc.next();
			System.out.print("room:");
			room = sc.nextInt();
			vect[room] = new Product (name, email, room);
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.printf(":%d", vect[i].room + ", %s", vect[i].name + ", %s", vect[i].email);
			}
		}
		
		sc.close();
	}
}
