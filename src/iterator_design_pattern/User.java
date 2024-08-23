package iterator_design_pattern;

public class User
{
	private String name;
	private String userId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public User(String name, String userId) {
		super();
		this.name = name;
		this.userId = userId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
