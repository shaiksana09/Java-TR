package Car_Dealer;

class Car {
	    private String model;
	    private int price;

	    public Car(String model, int price) {
	        this.model = model;
	        this.price = price;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getPrice() {
	        return price;
	    }
}

class AddFeatures {
	    private String name;
	    private int cost;

	    public AddFeatures(String name, int cost) {
	        this.name = name;
	        this.cost = cost;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getCost() {
	        return cost;
	    }
}

class CarDealer {
	    private Car[] carmodels;
	    private AddFeatures[] addFeatures;

	    public CarDealer() {
	        carmodels = new Car[]{
	                new Car("Polo Trendline", 870000),
	                new Car("Polo Highline", 1009000),
	                new Car("Virtus Trendline", 1105000),
	                new Car("Virtus Highline", 1308000),
	                new Car("Taigun Trendline", 1489000),
	                new Car("Taigun Highline", 1542000),
	                new Car("Taigun Topline", 1771000)
	        };

	        addFeatures = new AddFeatures[]{
	                new AddFeatures("RTO", 113990),
	                new AddFeatures("Insurance", 47300),
	                new AddFeatures("TCS charges", 11000),
	                new AddFeatures("Additional Accessories", 15000)
	        };
	    }
        public String calTotalCost(String carmodel, boolean needInsu, boolean needAccess, int discount) {
                    Car selectedCar = null;
                    for (Car car : carmodels) {
                        if (car.getModel().equals(carmodel)) {
                            selectedCar = car;
                            break;
                        }
                    }

                    if (selectedCar == null) {
                        return "Invalid car model selected.";
                    }

                    int totalCost = selectedCar.getPrice();

                    if (needInsu) {
                        AddFeatures insurance = addFeatures[1]; 
                        totalCost += insurance.getCost();
                    }

                    if (needAccess) {
                        AddFeatures accessories = addFeatures[3]; 
                        totalCost += accessories.getCost();
                    }

                    if (needInsu || needAccess) {
                        if (discount > 30000) {
                            totalCost -= 30000;
                        } else {
                            totalCost -= discount;
                        }
                    } else {
                        if (discount > 0) {
                            return "Cannot apply a discount without selecting insurance or additional accessories. Total cost: " + totalCost;
                        }
                    }

                    totalCost += addFeatures[0].getCost(); 
                    totalCost += addFeatures[2].getCost(); 

                    return "Total cost: " + totalCost;
        }
}


	
