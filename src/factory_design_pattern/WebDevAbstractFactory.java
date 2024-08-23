package factory_design_pattern;

public class WebDevAbstractFactory extends AbstractEmployeeFactory
{

	@Override
	public Employee createEmployee() {
		return new WenDevFactory();
	}
	
}
