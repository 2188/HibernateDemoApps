package flight_pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@Column(name = "Location_ID")
	private int locationId;

	@Column(name = "Location_Code")
	private String locationCode;

	@Column(name = "LocationName")
	private String location_origin;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocation_origin() {
		return location_origin;
	}

	public void setLocation_origin(String location_origin) {
		this.location_origin = location_origin;
	}
}
