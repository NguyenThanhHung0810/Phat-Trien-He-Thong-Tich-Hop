
package RMI;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Server duoc tao");
			Socket client = server.accept();
			System.out.println("Client ket noi den Server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Ban muon chon sach nao?");
			String tens = inFromClient.nextLine();
			System.out.println("client: " + tens);
			BufferedReader br= new BufferedReader(new FileReader("F:\\sach.txt"));
			String tep=br.readLine();
			if(tep.contains(tens))
				outToClient.println("Co sach " + tens);
			else
				outToClient.println("Rat tiec khong co sach " + tens);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
}