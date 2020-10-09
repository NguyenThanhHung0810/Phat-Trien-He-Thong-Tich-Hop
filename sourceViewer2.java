package BT_Tuan3;

import java.net.*;
import java.io.*;

public class sourceViewer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			try 
			{
				URL u=new URL("https://www.facebook.com/");
				URLConnection uc=u.openConnection();
				InputStream raw=uc.getInputStream();
				InputStream buffer=new BufferedInputStream(raw);
				
				Reader r= new InputStreamReader(buffer);
				int c;
				while((c=r.read()) != -1)
				{
					System.out.println((char) c);
				}
			}
			catch(MalformedURLException ex)
			{
				System.out.println(args[0] + " is not a parseable URL");
			}
			catch(IOException ex)
			{
				System.out.println(ex);
			}
		}
	}

}
