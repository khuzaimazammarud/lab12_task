package k201651_task1;

public class tournment {
	
	
	private int id;
	public sport s;
	
	public tournment() {
		// TODO Auto-generated constructor stub
		s=new sport();	
	}
	
	public tournment(int id,String current_champ,int start_year,String headquater){
		
		this.setId(id);
		s =new sport(current_champ,start_year,headquater);
		
	}
	
	public void begin_tournemnet(sport s){
		
		if(s.getHeadquater_locationString() == "karachi" || s.getHeadquater_locationString()=="toronto"){
			
			System.out.println("Tournement_bigen");
			
		}	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
