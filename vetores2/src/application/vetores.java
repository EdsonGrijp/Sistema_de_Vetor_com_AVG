package application;

import java.util.Scanner;

import entities.Product;

public class vetores {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de itens: ");
		int n = sc.nextInt();
		Product [] vect = new Product[n];
		
		for (int i=0; i<n; i++)/*o n pode ser substituido por vect.length*/ {
			
			sc.nextLine();
			System.out.println("Digite o nome do item: ");
			String name = sc.nextLine();
			System.out.println("Digite o preço do item: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
			
			
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.println("Average Price: "+avg);
		sc.close();
	}
}
