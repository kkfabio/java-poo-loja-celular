package loja.de.celular;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Celular> celulares = new ArrayList<>();

    public void cadastrar(Celular celular) {
        celulares.add(celular);
    }

    public void listar() {

        if (celulares.isEmpty()) {
            System.out.println("Nenhum celular cadastrado.");
            return;
        }

        for (int i = 0; i < celulares.size(); i++) {
            System.out.println(i + " - " + celulares.get(i));
        }
    }

    public void remover(int indice) {

        if (indice >= 0 && indice < celulares.size()) {
            celulares.remove(indice);
            System.out.println("Celular removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }



}
