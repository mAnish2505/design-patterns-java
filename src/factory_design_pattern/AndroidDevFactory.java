package factory_design_pattern;

public class AndroidDevFactory implements Employee{


	@Override
	public String getOccupationName() {
		
		System.out.println(" Getting the occupation Name : ");
		
		return "Android Developer";
	}
	
	@Override
	public  int getSalary() {	
	
		System.out.println(" Here is the Salary of the Android Developer : ");
		
		return 50000;
	}

}
