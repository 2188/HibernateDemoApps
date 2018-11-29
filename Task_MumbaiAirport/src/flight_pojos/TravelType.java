package flight_pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Travel_Type")
public class TravelType {

	@Id// @GeneratedValue
	@Column (name="Id")
	private int travelTypeID;
	
	@Column (name="TravelTypeItem")
	private String travelTypeName;
	
	public int getTravelTypeID() {
		return travelTypeID;
	}
	public void setTravelTypeID(int travelTypeID) {
		this.travelTypeID = travelTypeID;
	}
	public String getTravelTypeName() {
		return travelTypeName;
	}
	public void setTravelTypeName(String travelTypeName) {
		this.travelTypeName = travelTypeName;
	}
	
	
	
}
