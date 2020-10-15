/*
    REQUIREMENTS:
        - To build a server side program using Socket class for Networking
        - To build a client side program using ServerSocket class for Networking
    ENTITIES:
        - ClientClass
    WORK TO BE DONE:
        - get a socket instance with ip address and port 3456
        - create a data output stream instance with output stream as an argument
        - write content to the output stream
        - print "done"

    PSEUDOCODE:
        {
            In the main function

            Socket client = new Socket("localhost", 3456);
            DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());    

            String content = "Message from client class";
            dataOutputStream.write(content);
            
            dataOutputStream.close();
            System.out.println("Done.");

        }
*/

import java.io.IOException;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ClientClass {

    public static void main(String[] args) throws IOException {
 
        Socket client = new Socket("localhost", 3456);
        DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());    

        String content = "Message from client class";
        dataOutputStream.writeUTF(content);
        
        dataOutputStream.close();
        System.out.println("Done.");
    }
}
