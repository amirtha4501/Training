/*
    REQUIREMENTS:
        - To find the IP Address and host name of your local computer
    ENTITIES:
        - Finder
    WORK TO DONE:
        - create a class called Finder
        - get Inet address of a machine using get localhost
        - get host address
        - get host name
        - print the ip address and host name
*/

import java.net.InetAddress;
import java.net.UnknownHostException;

class Finder {
	
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress inetAddress = InetAddress.getLocalHost();
		
		String ip = inetAddress.getHostAddress();
		String host = inetAddress.getHostName();
		
		System.out.println("IP Address: " + ip + "\nHost name: " + host);
	}
}
