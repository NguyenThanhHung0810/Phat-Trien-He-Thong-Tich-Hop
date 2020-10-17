
package RMI;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("LocalHost",7777);
			System.out.println("Client");
			Scanner inFromServer = new Scanner(client.getInputStream());
			PrintStream outToServer = new PrintStream(client.getOutputStream());
			System.out.println("server: " + inFromServer.nextLine());
			Scanner scan = new Scanner(System.in);
			String tens = scan.nextLine();
			outToServer.println(tens);
			System.out.println("server: " + inFromServer.hasNext());
			} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}