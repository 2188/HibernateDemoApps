package flight_pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight_details")
public class FlightDetails {

	@Id
	@Column(name = "Flight_Details_id")
	private int flightDetl_ID;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "flight_Id_fk", referencedColumnName = "flightId") })
	private Flight flight;

	@Column(name = "Travel_Type_ID")
	private int travelTypeId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "location_Id_fk", referencedColumnName = "Location_ID") })
	private Location location;

	@Column(name = "Status_ID")
	private int StatusId;

	@Column(name = "Arrival_Time")
	private String arrivalTime;

	@Column(name = "Departure_Time")
	private String departureTime;

	public int getFlightDetl_ID() {
		return flightDetl_ID;
	}

	public void setFlightDetl_ID(int flightDetl_ID) {
		this.flightDetl_ID = flightDetl_ID;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getTravelTypeId() {
		return travelTypeId;
	}

	public void setTravelTypeId(int travelTypeId) {
		this.travelTypeId = travelTypeId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getStatusId() {
		return StatusId;
	}

	public void setStatusId(int statusId) {
		StatusId = statusId;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
}
