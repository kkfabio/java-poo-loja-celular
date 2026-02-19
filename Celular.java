package loja.de.celular;

/**
 * Representa um celular disponível na loja.
 */
public class Celular {

    private String nome;
    private String sistemaOperacional;
    private int armazenamento;
    private float tamanhoDeTela;
    private double preco;

    public Celular(String nome,
                   String sistemaOperacional,
                   int armazenamento,
                   float tamanhoDeTela,
                   double preco) {

        this.nome = nome;
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
        this.tamanhoDeTela = tamanhoDeTela;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public float getTamanhoDeTela() {
        return tamanhoDeTela;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format(
                "Modelo: %s | SO: %s | %d GB | Tela: %.1f\" | R$ %.2f",
                nome,
                sistemaOperacional,
                armazenamento,
                tamanhoDeTela,
                preco
        );
    }
}
