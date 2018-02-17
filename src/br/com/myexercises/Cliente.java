package br.com.myexercises;

import java.util.Scanner;

public class Cliente {

	// Constantes
	static final int OPCAO_ENTRAR_VALOR_COMPRA = 1;
	static final int OPCAO_EXIBIR_MEDIA = 2;
	static final int OPCAO_EXIBIR_HISTORICO = 3;
	static final int OPCAO_EXIBIR_SITUACAO = 4;
	static final int OPCAO_SAIR = 5;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcaoMenu;

		final int QTD_COMPRAS = 5;
		String nomeCliente = "";
		double somaCompras = 0;
		double compras[] = new double[QTD_COMPRAS];
		double mediaCompras = 0;

		do {

			imprimeMenu();

			opcaoMenu = scanner.nextInt();
			scanner.nextLine();

			switch (opcaoMenu) {
			case OPCAO_ENTRAR_VALOR_COMPRA:
				System.out.println("Digite o nome do cliente: ");
				nomeCliente = scanner.nextLine();

				if (nomeCliente == null || nomeCliente.trim().equals("")) {
					System.out.println("Informe o nome do cliente, escolha a opcao 1 - Entrar Cliente\n");
				} else {
					for (int i = 0; i < QTD_COMPRAS; i++) {
						System.out.println("Digite o total da compra " + (i + 1) + " do cliente.");
						compras[i] = scanner.nextDouble();
						scanner.nextLine();
						somaCompras += compras[i];
					}

				}

				break;

			case OPCAO_EXIBIR_MEDIA:
				mediaCompras = somaCompras / QTD_COMPRAS;
				System.out.println("Media: " + mediaCompras);
				scanner.nextLine();
				break;

			case OPCAO_EXIBIR_HISTORICO:
				for (int i = 0; i < QTD_COMPRAS; i++) {
					System.out.println("compra" + (i + 1) + ": " + compras[i]);

				}

				break;

			case OPCAO_EXIBIR_SITUACAO:
				if (QTD_COMPRAS < 5) {
					System.out.println("Cliente " + nomeCliente + " aprovado para efetuar novas compras.");
				} else {
					System.out.println("Cliente " + nomeCliente + " excedeu o limite de compras diarias.");
				}
				break;

			case OPCAO_SAIR:
				System.out.println("Sitemas Encerrado");
				break;
			// Opcao invalida
			default:
				break;
			}

		} while (opcaoMenu != OPCAO_SAIR);

		scanner.close();

	}

	// Metodo imprime o menu do sistema
	private static void imprimeMenu() {
		System.out.println("Cadastro de Clientes\n");

		System.out.println("Digite a opcao desejada");

		System.out.println(OPCAO_ENTRAR_VALOR_COMPRA + " - Entrar Valor da Compra");
		System.out.println(OPCAO_EXIBIR_MEDIA + " - Exibir Media");
		System.out.println(OPCAO_EXIBIR_HISTORICO + " - Exibir Historico de Compras");
		System.out.println(OPCAO_EXIBIR_SITUACAO + " - Exibir Situacao do Cliente ");
		System.out.println(" =======================");
		System.out.println(OPCAO_SAIR + " - Sair");

	}

}