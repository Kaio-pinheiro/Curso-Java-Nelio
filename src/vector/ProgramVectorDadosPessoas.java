package vector;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorDadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdHomens, qtdMulheres;
		double menorAltura, maiorAltura, alturaFemMedia, alturaFemTotal;

		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			generos[i] = sc.next().charAt(0);
		}
		menorAltura = alturas[0];
		maiorAltura = alturas[0];

		for (int i = 0; i < n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}

		}

		qtdHomens = 0;
		qtdMulheres = 0;
		alturaFemTotal = 0;
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				qtdHomens++;
			} else {
				qtdMulheres++;
				alturaFemTotal += alturas[i];
			}
		}
		alturaFemMedia = alturaFemTotal / qtdMulheres;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
		System.out.printf("Numero de homens = %d\n", qtdHomens);

		sc.close();
	}

}
