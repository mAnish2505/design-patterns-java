package factory_design_pattern;

public class FactoryDesignPatternMain 
{
	public static void main(String args[])
	{
	
		Employee e1 = EmployeeFactory.getEmployeeType( new AndroidDevFactoryAbstract());
		int salary1 =e1.getSalary();
		
		String occupationName1 = e1.getOccupationName();
		
		System.out.println(salary1);
		System.out.println(occupationName1);
		
		Employee e2 = EmployeeFactory.getEmployeeType(new WebDevAbstractFactory());
		e2.getSalary();
		e2.getOccupationName();
		
	}
}
