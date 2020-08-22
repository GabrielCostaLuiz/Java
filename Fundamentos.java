package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Gabriel Costa Luiz";
		// numeros inteiros
		int idade = 17;

		// char so funfa com 1 letra e sempre come�a com ' '
		char sexo = 'M';

		// numeros inteiros e numeros n inteiros
		double temperatura = 26.7;

		// aceita s� dois valores, verdadeiro ou falso
		boolean arCondicionado = false;

		System.out.println("Uso de variaveis na lingague Java");
		System.out.println("Exemplos: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("___________________________________");
		System.out.println("");
		double i = 8;
		System.out.println("Operadores Aritm�ticos e Atribui��es");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i =" + i + " + 5 | i = " + (i + 5));
		System.out.println("i =" + i + " - 5 | i = " + (i - 5));
		System.out.println("i =" + i + " * 5 | i = " + (i * 5));
		System.out.println("i =" + i + " / 5 | i = " + (i / 5));
		// resto da divisao
		System.out.println("i =" + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5      | i = " + (i += 5));
		System.out.println("i -= 5      | i = " + (i -= 5));
		System.out.println("i *= 5      | i = " + (i *= 5));
		System.out.println("i /= 5      | i = " + (i /= 5));
		i++;
		System.out.println("i++        | i = " + i);
		System.out.println("i--        | i = " + i);
		System.out.println("____________________________________");
		System.out.println("");
		System.out.println("Estruturas de Controle");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("Exemplo 1 - Uso do 'if' ");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatorio");
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else' ");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else - if' ");
		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Voto facultativo");
		}
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do 'switch case' ");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usu�rios");
		System.out.println("3. Relat�rios");
		int opcao = 1;
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Usu�rios");
			break;
		case 3:
			System.out.println("Relat�rios");
			break;
		default:
			System.out.println("Op��o Invalida");
			break;
		}
		System.out.println("");
		System.out.println("Estruturas de repeti��es");
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'for' ");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 5 - Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + "x" + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura 'while' ");
		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura 'do while' ");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("Game Over");
		System.out.println("");
		System.out.println("_____________________");
		System.out.println("");
		System.out.println("Adicionais");
		System.out.println("");
		int sorteio;
		// * 10 � entre 0 e 9
		sorteio = (int) (Math.random() * 10);
		System.out.println("Valor: " + sorteio);
		System.out.println("");
		System.out.println("");
		System.out.println("alguma variavel acompanhando Static, ele vai guardando as informa�oes");
	}
}
