package singleton_design_pattern;
import java.util.HashMap;
import java.util.Map;

public class JavaPractice 
{
	public static void main(String args[])
	{
		int a[] = {4,5,7,33,56,90};
		int temp = 0;
		for(int i=0; i<a.length-1;i++)
		{
			for(int j =0; j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				  temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			//System.out.print(a[i]);	
		}
		
		//reverse a string using reverse function
		
		//method 1
	   String s1 = "AvinashSingh";
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb =sb.reverse();
		//System.out.println(sb);
		
	
	    //method2
	    String s2 = "AvinashSingh";
	    char c[]=s2.toCharArray();
	    for(int i=c.length-1;i>=0;i--)
	    {
	    	//System.out.print(c[i]);
	    }
	   
	     //method3 
	     String s3 = "AvinashSingh";
	     String s="";
	     for(int i= s3.length()-1;i>=0;i--)
	     {
	    	 s=s+s3.charAt(i);
	     }
	    // System.out.print(s);

	  //method4
		/*
		 * String s4 ="AvinashSingh"; String [] str = s4.split("");
		 * 
		 * for(String c1 : str) { System.out.print(c1); }
		 */
	     
	     String strMap = "This this is is done by Saket Saket";
	     String[] split = strMap.split(" ");
	     Map<String, Integer> map = new HashMap<>();
	     for(int i=0;i<split.length-1;i++)
	     {
	    	if(map.containsKey(split[i]))
	    	{
	    		int count = map.get(split[i]);
	    		map.put(split[i], count+1);
	    	}
	    	else {
	    	map.put(split[i], 1);
	     }
	     }
	     System.out.print(map);
	    }
	
  }


