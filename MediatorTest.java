
public class MediatorTest {
	public static void main(String[] args) {
		IATC trafficController = new ATC(); 
		Runway runway = new Runway(trafficController);
		Flight f1 = new Flight(trafficController,"flight1"); 
		trafficController.registerFlight(f1);
		trafficController.registerRunway(runway);
		runway.land();
		f1.land(); 
		Flight f2 = new Flight(trafficController, "flight2"); 
		trafficController.registerFlight(f2);
		f2.land(); 
		f1.parked();
		f2.land(); 
		f2.parked(); 
	}
}
