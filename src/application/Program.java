package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product();
		System.out.println("Entre com os Dados do produto : ");
		System.out.print("Name :");
		product.name = sc.nextLine();
		System.out.print("Price : ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade : ");
		product.quantity = sc.nextInt();
		
		//System.out.println(product.name +":" + product.price + "," + product.quantity);
		
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para ser adicionado ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		
		System.out.println("Atualização dos Dados do produto: " + product);
		System.out.println();
		
		System.out.println("Entre com o numero de produtos para ser removido do estoque: ");
		quantity = sc.nextInt();
		product.removeProdutcs(quantity);
		
		System.out.println("Atualização dos Dados do produto: " + product);
		
		System.out.println();
		
		sc.close();
	}

}
