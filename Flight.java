
public class Flight implements Command{
	private IATC trafficController; 
	private String name; 
	
	Flight(IATC trafficController, String name){
		this.trafficController = trafficController; 
		this.name = name; 
	}
	
	public void land() {
		if(trafficController.isAvaailable()) {
			System.out.println("Flight" + name + " has landed"); 
			trafficController.setAvailablity(false);
		} else {
			System.out.println("Flight " + name + " is waiting for runway to clear"); 
		}
	}
	
	public void parked() {
		System.out.println("Flight " + name + " has now parked and the runway is clear for landing"); 
		trafficController.setAvailablity(true);
	}
}
