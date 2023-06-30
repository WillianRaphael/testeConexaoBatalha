class Tabuleiro {
    private char[][] matriz;

    public Tabuleiro() {
        matriz = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = '-';
            }
        }
    }

    public void exibir() {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void marcarPosicao(int linha, int coluna, char marcador) {
        matriz[linha][coluna] = marcador;
    }

    public char[][] getMatriz() {
        return matriz;
    }
}