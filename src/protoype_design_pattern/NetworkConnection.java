package protoype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable
{
	List<String> domains = new ArrayList<>();
	 
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> list) {
		this.domains = list;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 NetworkConnection networkConnection = new NetworkConnection();
		 networkConnection.setIp(this.getIp());
		 networkConnection.setImportantData(this.getImportantData());
		 
		 for(String d : this.getDomains())
		 {
			 networkConnection.getDomains().add(d);
		 }
		 
		 return networkConnection;
	}

	private String ip;
	private String importantData;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	public NetworkConnection() {
		super();
	}
	
	public List<String> loadveryImportantData1()
	{
		System.out.println("Loading the Object1 : ");
		
		domains.add("www.abc1.com1");
		domains.add("www.abc2.com2");
		domains.add("www.abc3.com3");
		domains.add("www.abc4.com4");
		
		return domains;
			
	}
	
	public String loadveryImportantData2()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Loading Very Important Data : Object2 "; 
	}
	@Override
	public String toString() {
		return "PrototypeDesignPattern [domains=" + domains + ", ip=" + ip + ", networkConnection=" + importantData
				+ "]";
	}
	
	
	
	
}
