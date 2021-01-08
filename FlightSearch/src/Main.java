import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//Departure location
		String departureLocation = "";
		System.out.print("Enter departure location: ");
		departureLocation = input.nextLine().toUpperCase();
		
		while (!departureLocation.matches("[a-zA-Z]+")) {
			System.out.println("Please enter a valid location name: ");
			departureLocation = input.nextLine().toUpperCase();
		}
		
		System.out.println(departureLocation);
		
		
//Arrival location
		String arrivalLocation = "";
		System.out.print("Enter arrival location: ");
		arrivalLocation = input.nextLine().toUpperCase();
		
		while (!arrivalLocation.matches("[a-zA-Z]+")) {
			System.out.println("Please enter a valid location name: ");
			arrivalLocation = input.nextLine().toUpperCase();
		}
		
		System.out.println(arrivalLocation);
		
//Flight date
		String flightDate = "";
		System.out.print("Please enter flight date (dd/mm/yyyy): ");
		flightDate = input.next();
		
		while (!flightDate.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")) {
			System.out.println("Please enter a valid date dd/mm/yyyy ");
			flightDate = input.next();
		} 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		try {
			Date d = sdf.parse(flightDate);
			String s2 = sdf.format(d);
			System.out.println(s2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//Flight class
		char flightClass = 0;
		System.out.print("Please choose class: Economic/Business ");
		flightClass = input.next().toUpperCase().charAt(0);
		
		boolean wrongType = true;
			
			while (wrongType) {
				if (flightClass == 'E' || flightClass == 'B' ) {
					System.out.println(flightClass);
					wrongType = false;
				}else {
					System.out.println("Invalid class. Please enter Economic or Business");
					flightClass = input.next().toUpperCase().charAt(0);
				}
			}
		
//Sort flight information by fare or duration
		
		
			 
			
		input.close();
		
		FlightSearch flight = new FlightSearch(departureLocation);
		

	}

}
