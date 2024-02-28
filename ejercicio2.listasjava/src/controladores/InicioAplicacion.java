package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InicioAplicacion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		int numero;
		do {
			System.out.print("Introduce un número entero (0 o negativo para salir): ");
			numero = scanner.nextInt();

			if (numero > 0) {
				numeros.add(numero);
			}
		} while (numero > 0);

		System.out.println("Lista original: " + numeros);

		List<Integer> numeros2 = new ArrayList<>();
		for (int i = 0; i < numeros.size(); i++) {
			if (!numeros2.add(numeros.get(i))) {
				numeros.set(i, 0);
			}
		}

		System.out.println("Lista con duplicados sustituidos por 0: " + numeros);
	}

}
