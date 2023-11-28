
public class Runway implements Command{
	private IATC trafficController; 
	
	Runway(IATC trafficController){
		this.trafficController = trafficController; 
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Runway is avaialble for landing");
		trafficController.setAvailablity(true);
	}
	
}
