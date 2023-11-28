
public interface IATC {
	public void registerFlight(Flight flight);
	public void registerRunway(Runway runway); 
	public void setAvailablity(Boolean status); 
	public Boolean isAvaailable(); 
}
