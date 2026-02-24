package loja.de.celular;

import java.util.Scanner;

/**
 * Ponto de entrada da aplicação.
 * Responsável por controlar o fluxo do sistema via menu interativo.
 * @author Fábio Nunes
 * @version 2.1
 * @since 1.0
 */
public class Main {

    /**
     * Inicia o sistema de gerenciamento da loja.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar celular");
            System.out.println("2 - Listar celulares");
            System.out.println("3 - Remover celular");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");


            if (!sc.hasNextInt()) {
                System.out.println("Opção inválida! Escolha uma opção válida.");
                sc.nextLine();
                continue;
            }

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida! Escolha uma opção válida.");
                continue;
            }

            if (opcao == 0) {
                System.out.println("Encerrando sistema...");
                break;
            }

            switch (opcao) {

                case 1:
                    System.out.print("Modelo: ");
                    String nome = sc.nextLine();

                    System.out.print("Sistema Operacional: ");
                    String sistemaOperacional = sc.nextLine();

                    System.out.print("Armazenamento (GB): ");
                    int armazenamento = sc.nextInt();

                    System.out.print("Tamanho da tela: ");
                    float tamanhoTela = sc.nextFloat();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    Celular celular = new Celular(
                            nome,
                            sistemaOperacional,
                            armazenamento,
                            tamanhoTela,
                            preco
                    );

                    loja.cadastrar(celular);
                    System.out.println("Celular cadastrado com sucesso!");
                    break;

                case 2:
                    loja.listar();
                    break;

                case 3:
                    loja.listar();
                    System.out.print("Digite o índice para remover: ");

                    if (sc.hasNextInt()) {
                        int indice = sc.nextInt();
                        loja.remover(indice);
                    } else {
                        System.out.println("Índice inválido.");
                        sc.nextLine();
                    }
                    break;
            }
        }

        sc.close();
    }
}
