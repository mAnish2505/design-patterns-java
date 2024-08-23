package singleton_design_pattern;
public class EagerSingleTonDesignPattern 
{
    private static EagerSingleTonDesignPattern eagerway = new EagerSingleTonDesignPattern();
    
    
    private EagerSingleTonDesignPattern()
    {
    
    }
    
    public static EagerSingleTonDesignPattern getObject()
    {
    	return eagerway;
    }
	
}
