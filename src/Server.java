import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

    public static void main(String arg[]) {
        System.out.println("Hello World!");

        int portNumber = 9000;
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(new Date().toString());

        } catch (Exception e) {

        } finally {

        }
    }
}
