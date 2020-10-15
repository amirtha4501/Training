/*
    REQUIREMENTS:
        - To build a server side program using Socket class for Networking
        - To build a client side program using ServerSocket class for Networking
    ENTITIES:
        - ServerClass
    WORK TO BE DONE:
        - get a server socket instance with port 3456
        - establish connection and wait for the client
        - create a data input stream instance with input stream as an argument
        - assign the input stream to the content
        - display the content

    PSEUDOCODE:
        {
            In the main function

            ServerSocket serverSocket = new ServerSocket(3456);  
            Socket client = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
            String content = dataInputStream;

            System.out.println("content", content);
        }
*/

import java.io.IOException;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerClass {

    public static void main(String[] args) throws IOException {
        
        ServerSocket serverSocket = new ServerSocket(3456);  
        Socket client = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
        String content = (String) dataInputStream.readUTF();

        System.out.println("Content: " + content);
    }
}
