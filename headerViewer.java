package BT_Tuan3;

import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.*;
import java.io.*;
import java.util.*; 

public class headerViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++)
		{
			try 
				{
				 URL u = new URL("https://www.facebook.com/");
				 URLConnection uc = u.openConnection( );
				 System.out.println("Content-type: " + uc.getContentType( ));
				 System.out.println("Contentencoding: " + uc.getContentEncoding( ));
				 System.out.println("Date: " + new Date(uc.getDate( )));
				 System.out.println("Last modified: " + new Date(uc.getLastModified( )));
				 System.out.println("Expiration date: " + new Date(uc.getExpiration( )));
				 System.out.println("Content-length: " + uc.getContentLength( ));
				}
		
			catch (MalformedURLException ex) 
				{
				 System.err.println("https://www.facebook.com/" + " is not a URL I understand");
				}
			catch (IOException ex)  
				{
				 System.err.println(ex); 				}
				}
	 System.out.println( ); 
	}
}
