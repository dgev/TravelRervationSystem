package TourReservationSystem;

import java.util.HashMap;
import java.util.Map;

public class Tour {
    private String tourID;
    private String descriptoin;
    private int duration;
    private Map <String, TourInstance> tourInst = new HashMap <String, TourInstance>();
	
	public Tour(String description, int duration) {
    }

	public String getTourID() {
		return tourID;
	}

	public void setTourID(String tourID) {
		this.tourID = tourID;
	}

	public String getDescriptoin() {
		return descriptoin;
	}

	public void setDescriptoin(String descriptoin) {
		this.descriptoin = descriptoin;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void addTourInst() {
		
	}
	
	public void removeTourInst() {
		
	}
	
	
}
