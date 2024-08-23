package iterator_design_pattern;

public class IteratorMain
{
	public static void main(String args[])
	{
	
		UserManagement userManagement = new UserManagement();
		userManagement.addUser(new User("Akash","1"));
		userManagement.addUser(new User("Bkash","2"));
		userManagement.addUser(new User("Ckash","3"));
		userManagement.addUser(new User("Dkash","4"));
		
		MyIterator myIterator = userManagement.getIterator();
		while(myIterator.hasNext())
		{
			User user = (User) myIterator.next();
			
			System.out.println(user.getName()+ " : "+user.getUserId());
		}
		
	
	}
}
