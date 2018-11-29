package flight_pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Carrier")
public class Carriers {

	@Id // @GeneratedValue
	@Column(name = "Id")
	private int carrierID;

	@Column(name = "Name")
	private String carrierName;

	// @OneToMany (cascade = CascadeType.ALL)
	// @JoinColumns ({ @JoinColumn(name = "Id")})
	// private Set<Flight> flightInfo;

	// public Set<Flight> getFlightInfo() {
	// return flightInfo;
	// }
	// public void setFlightInfo(Set<Flight> flightInfo) {
	// this.flightInfo = flightInfo;
	// }
	public int getCarrierID() {
		return carrierID;
	}

	public void setCarrierID(int carrierID) {
		this.carrierID = carrierID;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
}
