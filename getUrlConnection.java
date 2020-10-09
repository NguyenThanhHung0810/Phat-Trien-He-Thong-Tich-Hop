package BT_Tuan3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection; 

public class getUrlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL u;
		URLConnection uc;
		try
			{
				u=new URL("https://www.facebook.com/");
				uc=u.openConnection();
			}
		catch  (MalformedURLException e) 
			{
				e.printStackTrace();
			}
		catch  (IOException e)  
		{
			e.printStackTrace(); 
		}
	}

}
