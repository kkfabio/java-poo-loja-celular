package loja.de.celular;

import java.util.Scanner;

/**
 * Classe responsável por executar o sistema da loja de celulares.
 * Realiza a leitura de dados informados pelo usuário via terminal
 * e cria um objeto {@link Celular} com as informações fornecidas.
 *
 * @author Fábio Nunes
 * @version 1.1
 * @since 1.0
 */
public class Loja {

    /**
     * Método principal da aplicação.
     * Coleta informações do celular pelo console,
     * instancia um objeto {@link Celular}
     * e exibe o resumo da compra.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== Me fale as informações do seu celular =====");

        System.out.print("Qual o modelo do seu celular? ");
        String nome = sc.nextLine();

        System.out.print("Qual o sistema operacional? ");
        String sistemaOperacional = sc.nextLine();

        System.out.print("Armazenamento (GB): ");
        int armazenamento = sc.nextInt();

        System.out.print("Tamanho da tela: ");
        float tamanhoTela = sc.nextFloat();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Celular celular = new Celular(
                nome,
                sistemaOperacional,
                armazenamento,
                tamanhoTela,
                preco
        );

        System.out.println("\nResumo:");
        System.out.println(celular);

        sc.close();
    }
}
