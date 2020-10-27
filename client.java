package demSo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static final int port = 8881;
	public static final String serverIp = "localhost";
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket(serverIp, port);
		
		DataOutputStream os = new DataOutputStream(socket.getOutputStream());
		DataInputStream is =new DataInputStream(socket.getInputStream());
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Xin mời bạn nhập số: ");
			String send=  sc.nextLine();
			os.writeUTF(send);
			String mess =is.readUTF();
			System.out.println("Server trả về: "+mess);
		}
		
	}
}

