package lounge_pojos;

public class Lounge {
	
	private int loungeId;
	private String loungeName;
	private String terminalName;
	private String loungeDescription;
	private int airport_Id;
	private String peopleCat_Ids;
	
	public int getLoungeId() {
		return loungeId;
	}
	public void setLoungeId(int loungeId) {
		this.loungeId = loungeId;
	}
	public String getLoungeName() {
		return loungeName;
	}
	public void setLoungeName(String loungeName) {
		this.loungeName = loungeName;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getLoungeDescription() {
		return loungeDescription;
	}
	public void setLoungeDescription(String loungeDescription) {
		this.loungeDescription = loungeDescription;
	}
	public int getAirport_Id() {
		return airport_Id;
	}
	public void setAirport_Id(int airport_Id) {
		this.airport_Id = airport_Id;
	}
	public String getPeopleCat_Ids() {
		return peopleCat_Ids;
	}
	public void setPeopleCat_Ids(String peopleCat_Ids) {
		this.peopleCat_Ids = peopleCat_Ids;
	}
}
