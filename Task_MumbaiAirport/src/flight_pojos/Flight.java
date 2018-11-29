package flight_pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Flight")
public class Flight {

	@Id // @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "flightId")
	private int flightID;

	@Column(name = "Code")
	private String flightCode;

	@Column(name = "Name")
	private String flightName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "Id") })
	private Carriers Carriers;

	public Flight() {
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Carriers getCarriers() {
		return Carriers;
	}

	public void setCarriers(Carriers carriers) {
		Carriers = carriers;
	}
}
