package k201651_task1;

public class sport {
	
	private String current_champString;
	private int start_date;
	private String headquater_locationString;
	
	
	
	public sport() {
		// TODO Auto-generated constructor stub
	}
	
	public sport(String current_champString, int start_date, String headquater_locationString){
		
		
		this.current_champString = current_champString;
		this.start_date = start_date;
		this.headquater_locationString= headquater_locationString;
		
	}
	
	public String getCurrent_champString() {
		return current_champString;
	}
	public void setCurrent_champString(String current_champString) {
		this.current_champString = current_champString;
	}
	public int getStart_date() {
		return start_date;
	}
	public void setStart_date(int start_date) {
		this.start_date = start_date;
	}
	public String getHeadquater_locationString() {
		return headquater_locationString;
	}
	public void setHeadquater_locationString(String headquater_locationString) {
		this.headquater_locationString = headquater_locationString;
	}
	
	public <T> void printtit(T data) {
		
		System.out.println("The Attribute receive is :" + data);
		
	}

}
