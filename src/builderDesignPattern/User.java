package builderDesignPattern;

public class User
{
	//we are making final because we want to make them as immutable objects 
	
	private final String userId;
	private final String userName;
	private final String emailId;
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmailId() {
		return emailId;
	}
	
    
	private User(UserBuilder builder)
	{
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.emailId = builder.emailId;
	}
	
	@Override
	public String toString() {
		
		return this.userId+ " : "+ this.userName + " : "+ this.emailId+ " : "; 
	}

	public static class UserBuilder{
		
		private String userId;
		private String userName;
		private String emailId;
		
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setEmailId(String emailId){
			this.emailId = emailId;
			return this;
		}
		
		public UserBuilder() {	
		}
		
		public User build()
		{
			User user = new User(this);
			return user ;
		}
		
		public static UserBuilder builder()
		{
			return new UserBuilder();
		}
	}
}
