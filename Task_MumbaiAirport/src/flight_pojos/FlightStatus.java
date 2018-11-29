package flight_pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="FilghtStatus")
public class FlightStatus {

	@Id //@GeneratedValue
	@Column (name = "statusId")
	private int flight_statusId;
	
	@Column (name = "StatusName")
	private String flight_Status;
	
	public int getFlight_statusId() {
		return flight_statusId;
	}
	public void setFlight_statusId(int flight_statusId) {
		this.flight_statusId = flight_statusId;
	}
	public String getFlight_Status() {
		return flight_Status;
	}
	public void setFlight_Status(String flight_Status) {
		this.flight_Status = flight_Status;
	}
	
	
	
}
