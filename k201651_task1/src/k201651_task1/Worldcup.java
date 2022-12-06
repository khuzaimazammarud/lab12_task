package k201651_task1;

public class Worldcup extends tournment{
	
	Worldcup(int id,String current_champ,int start_year,String headquater){
		super(id,current_champ,start_year,headquater);
	}
	
	@Override
	public void begin_tournemnet(sport s) {
		// TODO Auto-generated method stub
		super.begin_tournemnet(s);
		
		if(s.getStart_date() < 1950 ){
			
			if(s.getHeadquater_locationString() != "karachi" || s.getHeadquater_locationString()!="toronto") {
				
				System.out.println("World_up begin");
				
			}
			
		}
	}

}
