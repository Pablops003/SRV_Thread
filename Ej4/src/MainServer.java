
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// 10.2.1.133 Iker
//10.2.1.171 Adrian
// 10.2.1.164 Pablo

public class MainServer {
    public static void main(String[] args) throws IOException {

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()){
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("Servidor iniciado " + serverSocket);
            Socket clientSocket = serverSocket.accept();
            System.out.println("Cliente conectado " + clientSocket);

            var socketReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.println("Esperando mensajes de " + clientSocket + "...");
            socketReader.lines().forEach(System.out::println);

        }


        System.out.println("Servidor parado 🛑");
    }
}