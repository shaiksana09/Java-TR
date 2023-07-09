package Rentride;
	class Driver {
	    private String name;
	    private String carmodel;
	    private double rate;
	    private double disFromCust;

	    public Driver(String name, String carmodel, double rate, double disFromCust) {
	        this.name = name;
	        this.carmodel = carmodel;
	        this.rate = rate;
	        this.disFromCust = disFromCust;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getCarModel() {
	        return carmodel;
	    }

	    public double getRate() {
	        return rate;
	    }

	    public double getDistanceFromCustomer() {
	        return disFromCust;
	    }
	}

	class Ride {
	    private double distance;
	    private String carRequested;

	    public Ride(double distance, String carRequested) {
	        this.distance = distance;
	        this.carRequested = carRequested;
	    }

	    public double getDistance() {
	        return distance;
	    }

	    public String getCarRequested() {
	        return carRequested;
	    }
	}

	class RentARide {
	    private Driver[] drivers;

	    public RentARide(Driver[] drivers) {
	        this.drivers = drivers;
	    }

	    public String findDriverForRide(Ride ride) {
	        double shortestDistance = Double.MAX_VALUE;
	        Driver closestDriver = null;
	        boolean specificCarRequested = (ride.getCarRequested() != null && !ride.getCarRequested().isEmpty());
	        boolean carFound = false;

	        for (Driver driver : drivers) {
	            if (driver.getRate() < 4) {
	                continue;
	            }

	            if (specificCarRequested) {
	                if (driver.getCarModel().equalsIgnoreCase(ride.getCarRequested())) {
	                    carFound = true;
	                    if (driver.getDistanceFromCustomer() < shortestDistance) {
	                        shortestDistance = driver.getDistanceFromCustomer();
	                        closestDriver = driver;
	                    }
	                }
	            } else {
	                if (driver.getDistanceFromCustomer() < shortestDistance) {
	                    shortestDistance = driver.getDistanceFromCustomer();
	                    closestDriver = driver;
	                }
	            }
	        }

	        if (closestDriver != null) {
	            if (!specificCarRequested || (specificCarRequested && carFound)) {
	                return "Driver " + closestDriver.getName() + " will get you to the destination." +
	                        " Your charge will be Rs " + (ride.getDistance() * 8);
	            } else {
	                return "No driver available for the requested car model. Please select another car.";
	            }
	        } else {
	            return "No suitable driver found for your ride request.";
	        }
	    }
    }

