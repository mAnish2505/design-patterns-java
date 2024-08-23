package observer_design_pattern;

public class Subscriber implements Observer{

	String name;

	public Subscriber(String name) {
		super();
		this.name = name;
	}



	@Override
	public void notified(String title) {
		System.out.println("Hello "+this.name+" new video uploaded : notification -> "+title);

	}

}
