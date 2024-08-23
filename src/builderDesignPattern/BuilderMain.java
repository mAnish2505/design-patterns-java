package builderDesignPattern;

public class BuilderMain 
{
	public static void main(String args[])
	{
		User user1  = new User.UserBuilder()
		.setUserId("abc23")
		.setUserName("NameABC23")
		.setEmailId("abc23@gmail.com")
		.build();
		
		System.out.println(user1);
		
		User user2 = new User.UserBuilder()
				     .builder()
				     .setUserId("abc34")
				     .setUserName("NameABC34")
				     .setEmailId("abc34@gmail.com")
				     .build();
		
		System.out.println(user2);
		
	}

}
