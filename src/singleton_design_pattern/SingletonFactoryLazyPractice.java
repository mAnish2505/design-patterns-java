package singleton_design_pattern;
import java.io.Serializable;

public class SingletonFactoryLazyPractice implements Serializable
{
	
	private static SingletonFactoryLazyPractice sglFactoryaPat;
	
	
	//making constructor to return the object (to overcome the problem of the Reflective api) 
	private SingletonFactoryLazyPractice()
	{
		if(sglFactoryaPat!=null)
		{
			throw new RuntimeException(" you can not over ride or access the constructor :");
		}
	}

	 public static SingletonFactoryLazyPractice getObject()
	 {
		 if(sglFactoryaPat==null)
		 {
			 synchronized(SingletonFactoryLazyPractice.class)
			 {	
				 if(sglFactoryaPat==null)
				 {
				     sglFactoryaPat = new SingletonFactoryLazyPractice();
			     }
		     }
	     }
		 return sglFactoryaPat; 
	 }
	 
	 //over coming the  the problem of ObjectOutputStream
	 public Object readResolveObject()
	 {
		 return sglFactoryaPat;
	 }
	 
	 //to overcome the problem of the Cloning to break the pattern 
	 
	 public Object cloneObject() throws CloneNotSupportedException
	 {
		return super.clone(); 
	 }
}
