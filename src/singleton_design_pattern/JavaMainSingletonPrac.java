package singleton_design_pattern;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class JavaMainSingletonPrac 
{
	public static void main(String args[]) throws Exception,CloneNotSupportedException
	{
         //SingletonFactoryPractice single = new JavaMainSingletonPractice();	
		
		 SingletonFactoryLazyPractice single1 = SingletonFactoryLazyPractice.getObject();
		 
		 System.out.println(" hashcode value :"+single1.hashCode());
		 
		 EagerSingleTonDesignPattern eager1 = EagerSingleTonDesignPattern.getObject();
		// System.out.println(eager1.hashCode());
		  
		 EagerSingleTonDesignPattern eager2 = EagerSingleTonDesignPattern.getObject();
		// System.out.println(eager2.hashCode());
	
	    // breaking singleton design pattern 
	   //  1 - Reflection API - over riding the constructor constructor
		 
		 /*
		   Constructor<SingletonFactoryLazyPractice> constructor = SingletonFactoryLazyPractice.class.getDeclaredConstructor(); 
		   constructor.setAccessible(true);	
		   SingletonFactoryLazyPractice single2 = constructor.newInstance();
		   System.out.println(single2.hashCode());
		 */
		 
		 //Over Coming By Using the Instance 
		 InstanceWay enumTest = InstanceWay.Instance;
		 System.out.println(" enum test value "+enumTest.hashCode());
		 String returnedValue = enumTest.getName();
		 System.out.println(returnedValue);
		
		 //Breaking the Pattern using the Output and Input Stream 
		 //SingletonFactoryLazyPractice s = SingletonFactoryLazyPractice.getObject();
		 FileOutputStream fos = new FileOutputStream("");
		 ObjectOutputStream oo = new ObjectOutputStream(fos);
		 oo.writeObject(single1);
		 
		 FileInputStream fis = new FileInputStream("");
		 ObjectInputStream oi = new ObjectInputStream(fis);
		 oo.writeObject(single1);
		 
		 //By Cloning the Object
		// SingletonFactoryLazyPractice single2 = (SingletonFactoryLazyPractice)single1.clone();
		 
		 
	}	
}
