package observer_design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber aman  = new Subscriber("Aman");
		Subscriber raman  = new Subscriber("Raman");
		
		channel.subscribe(aman);
		channel.subscribe(raman);
		channel.newVideoUploaded("Learn Design Pattern");
		
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("press 1 to upload the new video : ");
			System.out.println("press 2 to create new subscriber : ");
			System.out.println("press 3 to exit : ");
			
			int c =Integer.parseInt(bf.readLine());
			if(c==1)
			{
				//new video upload code
			}
			else if(c==2)
			{
				// create new subscriber 
			}
			
			else if(c==3){
				//exit
			}
			else
				{
				//exit wrong input
				}
		}
		
	}
	
}
