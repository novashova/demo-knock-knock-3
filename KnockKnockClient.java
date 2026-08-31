import java.io.*;
import java.net.*;

public class KnockKnockClient {
    public static void main(String[] args) throws IOException {
        
        String hostName = "127.0.0.1";
        int portNumber = 4444;

        System.out.println("Connecting to server...");

        // TODO 1: Create a regular Socket connected to the hostName and portNumber
        
        // TODO 2: Set up your PrintWriter (with auto-flush) and BufferedReader (network)
        
        // TODO 3: Set up a SECOND BufferedReader to read from the keyboard (System.in)
        
        String fromServer;
        String fromUser;

        // TODO 4: Create a while loop to read lines from the server (in.readLine())
        // Inside the loop:
        //   - Print what the server says to the console.
        //   - If the server says "Bye.", break the loop.
        //   - Otherwise, read a line from the user's keyboard.
        //   - If the user typed something, send it to the server!

        // TODO 5: Close your sockets and streams!
    }
}