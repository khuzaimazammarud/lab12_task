package k201651_task1;

public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sport s = new sport("khzuema",1960,"karachi");
			
		Worldcup W = new Worldcup(1,"khzuema",1960,"karachi");
		Worldcup c = new Worldcup(1,"khzuema",1960,"torororo");
		
		c.begin_tournemnet(s);
		W.begin_tournemnet(s);//world cup function called
		
		s.<String>printtit(s.getHeadquater_locationString());
	
		s.<Integer>printtit(s.getStart_date());
		
		
	}

}
