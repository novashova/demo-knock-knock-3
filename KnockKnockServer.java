import java.net.*;
import java.io.*;

public class KnockKnockServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        
        int portNumber = 777;
        System.out.println("Starting Knock-Knock Server on port " + portNumber);


        ServerSocket serverSocket = new ServerSocket(portNumber);
        System.out.println("Server is calling on port: " + portNumber);

        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        System.out.println("Connected");

        KnockKnockProtocol kkp = new KnockKnockProtocol();
        
        String inputLine, outputLine;
        
        outputLine = kkp.processInput(null);
        out.println(outputLine);


        while((inputLine = in.readLine()) != null){
            outputLine = kkp.processInput(inputLine);
            System.out.println(inputLine);
            out.println(outputLine);

            if(inputLine.equals("Bye.")){
                out.println("Bye!");
                break;
            }
        }

        serverSocket.close();
        clientSocket.close();
        in.close();
        out.close();
    }
}