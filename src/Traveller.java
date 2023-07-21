import java.util.Date;

public class Traveller extends Flight {
	String Name;
	long MobileNo;
	String email;
	String flightId;
	Date LocalDate;

	public Traveller() {}

	public Traveller(String name, long mobileNo, String email, String flightId, Date localDate) {
		super();
		Name = name;
		MobileNo = mobileNo;
		this.email = email;
		this.flightId = flightId;
		LocalDate = localDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public  String getFlightId() {
		return flightId ;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public Date getLocalDate() {
		return LocalDate;
	}

	public void setLocalDate(Date localDate) {
		LocalDate = localDate;
	}
	
} 
