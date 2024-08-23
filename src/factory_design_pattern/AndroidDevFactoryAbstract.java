package factory_design_pattern;

public class AndroidDevFactoryAbstract extends AbstractEmployeeFactory {

	@Override
	public Employee createEmployee() {
		
		return new AndroidDevFactory();
	}

}
