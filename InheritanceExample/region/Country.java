package region;

public class Country {
	private String cname;
	
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String toString() {
		return "Country [cname=" + cname + "]";
	}
}
