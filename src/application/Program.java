package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos empregados serão registrados?");
		int quantEmpregados = sc.nextInt();
		
		List<Empregado> empregado = new ArrayList<>();
		
		for (Empregado x : empregado) {
			sc.nextLine();
			
			
			
			System.out.println("Empregado #" + x);
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			while (hasId(empregado, id)) {
				System.out.print("ID já existe, tente outro: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			
			
			empregado.add(new Empregado(id, nome, salario));

		}
		
		
		
		
		sc.close();

	}

	
	public static boolean hasId(List<Empregado> empregado, int id) {
		Empregado emp = empregado.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
