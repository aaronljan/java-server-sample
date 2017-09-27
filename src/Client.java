import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = JOptionPane.showInputDialog("Here");
        Socket s = new Socket(serverAddress, 9000);
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String ans = input.readLine();
        JOptionPane.showMessageDialog(null, ans);
        System.exit(0);
    }
}
