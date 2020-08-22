package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// ctrl shift f (alinhamento do codigo)
		// variaveis
		double altura, peso, media;
		// objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		// objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("C�lculo IMC");
		// entrada
		System.out.print("Digite seu Peso: ");
		peso = leitor.nextDouble();
		System.out.print("Digite sua Altura: ");
		altura = leitor.nextDouble();
		// processamento
		media = peso / (altura * altura);
		// saida
		System.out.println("Seu IMC �: " + formatador.format(media));
		if (media < 17) {
			System.out.println("Muito abaixo do peso");
		} else if (media >= 17 && media < 18.50) {
			System.out.println("Abaixo do peso");
		} else if (media >= 18.50 && media < 25) {
			System.out.println("Peso Normal");
		} else if (media >= 25 && media < 30) {
			System.out.println("Acima do peso");
		} else if (media >= 30 && media < 35) {
			System.out.println("Obesidade I");
		} else if (media >= 35 && media < 40) {
			System.out.println("Obesidade II (severa)");
		} else {
			System.out.println("Obesidade III (m�rbida)");
		}

		leitor.close();
	}

}