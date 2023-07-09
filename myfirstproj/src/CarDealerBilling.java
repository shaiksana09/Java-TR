package Car_Dealer;

import java.util.Scanner;

public class CarDealerBilling {
	    public static void main(String[] args) {
	        CarDealer carDealer = new CarDealer();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Select Car Model: ");
	        String carmodel = scanner.nextLine();

	        System.out.print("Do You Need Insurance (yes/no): ");
	        String insuInp = scanner.nextLine();
	        boolean needInsu = insuInp.equalsIgnoreCase("yes");

	        System.out.print("Do you need Additional Accessories (yes/no): ");
	        String accessInp = scanner.nextLine();
	        boolean needAcce = accessInp.equalsIgnoreCase("yes");

	        System.out.print("Dealer discount: ");
	        int dealerDiscount = scanner.nextInt();

	        scanner.close();

	        String totalCost = carDealer.calTotalCost(carmodel, needInsu, needAcce, dealerDiscount);
	        System.out.println(totalCost);
        }
}