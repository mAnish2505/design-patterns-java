package factory_design_pattern;

public class WenDevFactory implements Employee{


	
	@Override
	public String getOccupationName() {
		
		System.out.println(" Getting the Occupation Name : ");
	    return "Web Developer ";
	}

	@Override
	public int getSalary() {
		
		System.out.println("Getting the Salary of the Web Developer : ");
		return 49999;
	}
	

}
