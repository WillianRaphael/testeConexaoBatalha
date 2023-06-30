import java.io.IOException;
import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();
        Servidor s = new Servidor();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Jogador 1: ");
        String nomeJogador1 = scanner.next();
        Jogador jogador1 = new Jogador(nomeJogador1);

        System.out.print("Digite o nome do Jogador 2: ");
        String nomeJogador2 = scanner.next();
        Jogador jogador2 = new Jogador(nomeJogador2);

        System.out.println("Jogador 1, posicione seus navios:");
        jogador1.posicionarNavios();

        System.out.println("Jogador 2, posicione seus navios:");
        jogador2.posicionarNavios();

        boolean jogoFinalizado = false;
        Jogador jogadorAtual = jogador1;
        Jogador oponente = jogador2;

        // c.realizarJogada(0, 0); // Comente esta linha, pois não é necessária aqui
        s.conectar();

        while (!jogoFinalizado) {
            System.out.println("\nTabuleiro do(a) " + jogadorAtual.getNome());
            jogadorAtual.getTabuleiroProprio().exibir();

            System.out.println("\nTabuleiro do(a) " + jogadorAtual.getNome() + " (Oponente)");
            jogadorAtual.getTabuleiroOponente().exibir();

            System.out.println("\nJogador " + jogadorAtual.getNome() + ", faça sua jogada.");
            System.out.print("Digite a linha: ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna: ");
            int coluna = scanner.nextInt();

            jogadorAtual.realizarJogada(jogador1, linha, coluna);
            jogadorAtual.realizarJogada(jogador2, linha, coluna);

            if (oponente.todosNaviosDestruidos()) {
                System.out.println("\nParabéns, " + jogadorAtual.getNome() + "! Você venceu o jogo.");
                jogoFinalizado = true;
            } else {
                Jogador temp = jogadorAtual;
                jogadorAtual = oponente;
                oponente = temp;
            }
        }

        scanner.close();
    }
}
