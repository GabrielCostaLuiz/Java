package exercicios;

import java.util.Scanner;

public class Corrida {
	
	//EXERCICIO TEMA LIVRE

	public static void main(String[] args) {
		int jogador, dado, pontuacao, pontuacao2;
		pontuacao = 0;
		pontuacao2 = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Corrida com dados");
		System.out.println("");
		System.out.println("O jogo consiste em chegar at� o numero 20 ou n�o ultrapassar na sorte do dado!");
		System.out.println("Se voc� e o Computador n�o chegarem ou chegarem no 20 empata!");
		System.out.println("Se um dos 2 ultrapassar 20 o outro ganha!");
		System.out.println("Se os 2 ultrapassar 20, quem estiver mais perto do 20 ganha!");
		System.out.println("");
		System.out.println("Sua pontua��o � igual a : " + pontuacao);
		System.out.print("Digite 1 para jogar o dado: ");
		jogador = leitor.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			dado = (int) (Math.random() * 10 + 2);
			System.out.println("O dado caiu no numero : " + dado);
			System.out.println("Sua pontua��o atual � : " + (pontuacao += dado));
			break;

		default:
			System.out.println("Para jogar o dado digite a tecla 1");
			break;
		}
		if (jogador > 1) {
			System.exit(0);
		}
		System.out.println("|__________________________________________________________|");

		System.out.println("");
		System.out.println("Vez do Computador");
		System.out.println("Pontua��o do Computador � igual a : " + pontuacao2);
		dado = (int) (Math.random() * 10 + 2);
		System.out.println("O dado caiu no numero : " + dado);
		System.out.println("Pontua��o atual do Computador � : " + (pontuacao2 += dado));
		System.out.println("|__________________________________________________________|");

		System.out.println("");
		System.out.println("Sua Vez Jogador");
		System.out.println("Sua pontua��o � igual a : " + pontuacao);
		System.out.print("Digite 1 para jogar o dado: ");
		jogador = leitor.nextInt();
		switch (jogador) {
		case 1:
			dado = (int) (Math.random() * 10 + 2);
			System.out.println("O dado caiu no numero : " + dado);
			System.out.println("Sua pontua��o atual � : " + (pontuacao += dado));
			break;

		default:
			System.out.println("Para jogar o dado digite a tecla 1");
			break;
		}
		if (jogador > 1) {
			System.exit(0);
		}

		System.out.println("|__________________________________________________________|");

		System.out.println("");
		System.out.println("Vez do Computador");
		System.out.println("Pontua��o do Computador � igual a : " + pontuacao2);
		dado = (int) (Math.random() * 10 + 2);
		System.out.println("O dado caiu no numero : " + dado);
		System.out.println("Pontua��o atual do Computador � : " + (pontuacao2 += dado));
		System.out.println("|__________________________________________________________|");

		System.out.println("");
		System.out.println("Sua Vez Jogador");
		System.out.println("Sua pontua��o � igual a : " + pontuacao);
		System.out.print("Digite 1 para jogar o dado: ");
		jogador = leitor.nextInt();
		switch (jogador) {
		case 1:
			dado = (int) (Math.random() * 10 + 2);
			System.out.println("O dado caiu no numero : " + dado);
			System.out.println("Sua pontua��o atual � : " + (pontuacao += dado));
			break;

		default:
			System.out.println("Para jogar o dado digite a tecla 1");
			break;
		}
		if (jogador > 1) {
			System.exit(0);
		}
		System.out.println("|__________________________________________________________|");

		System.out.println("");
		System.out.println("Vez do Computador");
		System.out.println("Pontua��o do Computador � igual a : " + pontuacao2);
		dado = (int) (Math.random() * 10 + 2);
		System.out.println("O dado caiu no numero : " + dado);
		System.out.println("Pontua��o atual do Computador � : " + (pontuacao2 += dado));
		System.out.println("|__________________________________________________________|");

		System.out.println("");
		 if (pontuacao <= 20 && pontuacao2 <= 20 || pontuacao == pontuacao2) {
				System.out.println("Empate");
		} else if  (pontuacao > 20 && pontuacao2 <= 20 || pontuacao > 20 && pontuacao2 > 20 && pontuacao > pontuacao2 || pontuacao < 20 && pontuacao2 <= 20) {
			System.out.println("Voc� Perdeu");
		} else {
			System.out.println("Voc� Ganhou");
		}
		System.out.println("Sua pontua��o final : " + pontuacao);
		System.out.println("Pontua��o final do Computador : " + pontuacao2);
		leitor.close();
	}
}