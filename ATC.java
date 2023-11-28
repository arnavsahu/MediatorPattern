
public class ATC implements IATC{
	private Runway runway; 
	private Flight flight; 
	private boolean available; 
	@Override
	public void registerFlight(Flight flight) {
		// TODO Auto-generated method stub
		this.flight = flight; 
	}

	@Override
	public void registerRunway(Runway runway) {
		// TODO Auto-generated method stub
		this.runway = runway; 
	}

	@Override
	public void setAvailablity(Boolean status) {
		// TODO Auto-generated method stub
		this.available = status; 
	}

	@Override
	public Boolean isAvaailable() {
		// TODO Auto-generated method stub
		return available; 
	}
	
}
