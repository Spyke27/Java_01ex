package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.println();
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter the number of product to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "+product);
		System.out.println();
		
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		scan.close();
	}

}
