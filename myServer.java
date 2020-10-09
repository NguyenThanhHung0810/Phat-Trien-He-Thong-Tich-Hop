package BT_Tuan3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner; 

public class myServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			ServerSocket server = new ServerSocket(9540);
			System.out.println("Server da duoc tao"); 
			
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			
			outToClient.println("Xin chao, ban ten gi?"); 
			
			String ten = inFromClient.nextLine();
			System.out.println("clien: " + ten); 
			
			outToClient.println("Rat vui duoc tro chuyen voi " + ten); 
		}
		
		catch  (IOException e) 
		{
			e.printStackTrace(); 
		}
	}

}
