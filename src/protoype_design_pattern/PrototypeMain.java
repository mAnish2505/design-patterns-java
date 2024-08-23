package protoype_design_pattern;

import java.nio.channels.NetworkChannel;
import java.util.ArrayList;
import java.util.List;

public class PrototypeMain 
{
	public static void main(String args[])
	{
		NetworkConnection networkConnection1 = new NetworkConnection();
		networkConnection1.setIp("33.45.342.44");
		networkConnection1.setImportantData(" network connection of the obj1 : ");
		
		//String dataObj1 = networkConnection1.loadveryImportantData1();
		
		List<String> list = new ArrayList<>();
		list = networkConnection1.loadveryImportantData1();
		//System.out.println(list);
		
		System.out.println("Data Of Obj1: "+networkConnection1);
		
        NetworkConnection networkConnection2 =null;
        try 
        {
        //System.out.println("Here is Obj2 : "+networkConnection2);
  
        //implementing the shallow deep copy example in the Code
		/*
		 * networkConnection1.getDomains().remove(0);
		 * System.out.println("Data Of Obj1 from shallow copy : "+networkConnection1);
		 * networkConnection2 = (NetworkConnection) networkConnection1.clone();
		 * NetworkConnection networkConnection3 = (NetworkConnection)
		 * networkConnection1.clone();
		 * System.out.println("Data Of Obj1 from shallow copy : "+networkConnection3);
		 */
        //applying the logic of Deep Copy 
        //some logic written in Clone over ridden method.
        networkConnection2 = (NetworkConnection)networkConnection1.clone();
        NetworkConnection networkConnection3 = (NetworkConnection)networkConnection1.clone();
        networkConnection1.getDomains().remove(0);
        System.out.println("Data Of Obj1 from deep Copy : "+networkConnection2);
        System.out.println("Data Of Obj1 from deep Copy : "+networkConnection3);
        
        }
        catch(CloneNotSupportedException c) {
        	c.printStackTrace();
        }
        
    
	}
}
