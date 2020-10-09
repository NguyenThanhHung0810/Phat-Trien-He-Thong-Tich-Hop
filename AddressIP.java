package BT_Tuan3;

import java.net.InetAddress;
import java.net.UnknownHostException; 

public class AddressIP {
//Tìm địa chỉ IP
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
			{
				InetAddress host = InetAddress.getByName("www.youtube.com");
				String hostName = host.getHostName();
				System.out.println("Host Name :" +hostName);
				System.out.println("Address IP :" +host.getHostAddress());
			}
		
			catch(UnknownHostException e)
			{
				System.out.println("Can not find the address");
				return;
			}
	}

}