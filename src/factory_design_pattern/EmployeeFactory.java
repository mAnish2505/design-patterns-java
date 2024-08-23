package factory_design_pattern;

public class EmployeeFactory
{

	  public static Employee getEmployeeType( AbstractEmployeeFactory factory)
	  {
		  return factory.createEmployee();
	  }
	
}
