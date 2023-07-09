package Extension;

import java.util.Scanner;

public class Rentride {
	    public static void main(String[] args) {
	        Driver[] drivers = {
	                new Driver("A", "5 Seater", 4, 500, "Gurgaon, Noida", "Delhi"),
	                new Driver("B", "HatchBack", 4.3, 1000, "Gurgaon"),
	                new Driver("C", "5 Seater", 4.8, 200, "Noida"),
	                new Driver("D", "Sedan", 4.1, 700, "Noida"),
	                new Driver("E", "5 Seater", 4.7, 430, "Delhi")
	        };

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Customer Ride Distance: ");
	        double rideDis = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Car Requested: ");
	        String carReq = sc.nextLine();
	        
	        System.out.print("Destination: ");
	        String dest = sc.nextLine();
	        Ride ride = new Ride(rideDis, carReq, dest);

	        RentARide rentRide = new RentARide(drivers);
	        String result = rentRide.findDriverForRide(ride);
	        System.out.println(result);
	        sc.close();
	    }
}
