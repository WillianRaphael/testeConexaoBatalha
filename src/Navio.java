import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Navio {
    private String nome;
    private int tamanho;
    private char marcador;
    private List<Posicao> posicoes;

    public Navio(String nome, int tamanho, char marcador) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.marcador = marcador;
        this.posicoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public char getMarcador() {
        return marcador;
    }

    public List<Posicao> getPosicoes() {
        return posicoes;
    }

    public void adicionarPosicao(Posicao posicao) {
        posicoes.add(posicao);
    }
}