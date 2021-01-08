
public class FlightSearch {
	
	private String departureLocation;
	private String arrivalLocation;
	private String flightDate;
	private char flightClass;
	
		public FlightSearch(String departureLocation, String arrivalLocation, String flightDate, char flightClass) {
			this.departureLocation = departureLocation;
			this.arrivalLocation = arrivalLocation;
			this.flightDate = flightDate;
			this.flightClass = flightClass;
		}

		public String getArrivalLocation() {
			return arrivalLocation;
		}

		public void setArrivalLocation(String arrivalLocation) {
			this.arrivalLocation = arrivalLocation;
		}

		public String getFlightDate() {
			return flightDate;
		}

		public void setFlightDate(String flightDate) {
			this.flightDate = flightDate;
		}

		public char getFlightClass() {
			return flightClass;
		}

		public void setFlightClass(char flightClass) {
			this.flightClass = flightClass;
		}

		public String getDepartureLocation() {
			return departureLocation;
		}

		public void setDepartureLocation(String departureLocation) {
			this.departureLocation = departureLocation;
		}


	
	

}
