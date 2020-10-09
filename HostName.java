package BT_Tuan3;

import java.net.InetAddress;
import java.net.UnknownHostException; 

public class HostName {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
			{
				if(args.length!=1)
					{
						System.out.println("Cach su dung java");
					}
				InetAddress host = InetAddress.getByName("www.youtube.com");
				String hostName = host.getHostName();
				System.out.println("Host Name:" +hostName);
				System.out.println("Adress IP:" +host.getHostAddress());
				byte[] b=host.getAddress();
				int i=b[0]>0?b[0]:256+b[0];
				
				if((i>=1)&(i<=126))
					{
						System.out.println(host+ "Thuoc dia chi lop A");
					}
				
				if((i<=191)&(i>=128))
					{
						System.out.println(host+ "Thuoc dia chi lop B");
					}
						
				if((i<=223)&(i>=192))
					{
						System.out.println(host+ "Thuoc dia chi lop C");
					}
				
			}
		catch(UnknownHostException e)
			{
				System.out.println("Không tìm thấy địa chỉ");
				return;
			}
	}

}
