import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
// 10.2.1.133 Iker
//10.2.1.171 Adrian
// 10.2.1.164 Pablo
public class MainClient {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            Socket socket = new Socket("10.2.1.133", 7777);
            System.out.println("Conectado al servidor " + socket);

            var socketWriter = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                System.out.println("Escribe un mensaje:");
                socketWriter.println(scanner.nextLine());
                System.out.println("Mensaje enviado");
            }
        }
    }

