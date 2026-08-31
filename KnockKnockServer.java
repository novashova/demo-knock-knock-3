import java.net.*;
import java.io.*;

public class KnockKnockServer {
    public static void main(String[] args) throws IOException {
        
        int portNumber = 4444;
        System.out.println("Starting Knock-Knock Server on port " + portNumber);

        // TODO 1: Open a ServerSocket on the portNumber
        
        // TODO 2: Call accept() to wait for a client to knock on the door
        
        // TODO 3: Set up your PrintWriter (with auto-flush) and BufferedReader
        
        // TODO 4: Instantiate the KnockKnockProtocol "brain" (e.g., kkp)
        
        String inputLine, outputLine;

        // TODO 5: Get the very first message from the protocol by passing it 'null'
        // outputLine = kkp.processInput(null);
        // Then, send that outputLine to the client using your PrintWriter!

        // TODO 6: Create a while loop that constantly reads from the client (in.readLine())
        // Inside the loop:
        //   - Pass the client's input into kkp.processInput()
        //   - Send the resulting string back to the client
        //   - If the protocol returns "Bye.", break the loop.

        // TODO 7: Close your sockets and streams!
    }
}