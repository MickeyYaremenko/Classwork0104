package by.htp.smth;

public class Client {
	private int passportID;
	private String name;
	private RentUnit rentunit;

	public Client(int passportID, String name) {
		this.passportID = passportID;
		this.name = name;
		
	}

	public int getPassportID() {
		return passportID;
	}

	public String getName() {
		return name;
	}

	public RentUnit getRentunit() {
		return rentunit;
	}

	public void setRentunit(RentUnit rentunit) {
		this.rentunit = rentunit;
	}

}
