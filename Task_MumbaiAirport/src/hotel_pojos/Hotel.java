package hotel_pojos;

import java.sql.Blob;

public class Hotel {

	private int hotelId;
	private String hotelName;
	private String distanceInKM;
	private int ratingId;
	private String emunities;
	private Blob hotalImage;
	
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getDistanceInKM() {
		return distanceInKM;
	}
	public void setDistanceInKM(String distanceInKM) {
		this.distanceInKM = distanceInKM;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public String getEmunities() {
		return emunities;
	}
	public void setEmunities(String emunities) {
		this.emunities = emunities;
	}
	public Blob getHotalImage() {
		return hotalImage;
	}
	public void setHotalImage(Blob hotalImage) {
		this.hotalImage = hotalImage;
	}
	
	
	
}
