import java.io.*;
import java.net.*;

public class KnockKnockClient {
    public static void main(String[] args) throws IOException {
        
        String hostName = "10.97.14.83";
        int portNumber = 777;

        System.out.println("Connecting to server...");

        // TODO 1: Create a regular Socket connected to the hostName and portNumber
        Socket socket = new Socket(hostName, portNumber);
        
        // TODO 2: Set up your PrintWriter (with auto-flush) and BufferedReader (network)
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        
        // TODO 3: Set up a SECOND BufferedReader to read from the keyboard (System.in)
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        
        String fromServer;
        String fromUser;

        while((fromServer = in.readLine()) != null){
            System.out.println(fromServer);
            fromUser = stdIn.readLine();
            if(fromUser != null)
                out.println(fromUser);
            if(fromUser.equals("Bye."))
                break;
        }

        socket.close();
        in.close();
        out.close();
        stdIn.close();

    }
}