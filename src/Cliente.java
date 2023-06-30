import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    private final String enderecoIP = "10.199.11.160";
    private final int porta = 1234;

    public void realizarJogada(int linha, int coluna) throws IOException {
        Socket clienteSocket = new Socket(enderecoIP, porta);
        System.out.println("Conexão estabelecida com o servidor.");

        DataOutputStream outputStream = new DataOutputStream(clienteSocket.getOutputStream());
        outputStream.writeInt(linha);
        outputStream.writeInt(coluna);

        outputStream.close();
        clienteSocket.close();
    }
}
