import java.util.Scanner;

public class HotelBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roomCharge = 2000;
        int foodCharge = 500;
        int laundryCharge = 200;

        System.out.println("    HOTEL BILLING SYSTEM     ");

       System.out.println("Room rent for 1 days (2000): ");

        System.out.print("Enter number of days stayed : ");
        int days = sc.nextInt();

        int roomBill = roomCharge * days;

        System.out.println("\nServices Used:");
        System.out.println("1. Food Service (500)");
        System.out.println("2. Laundry Service (200)");
        System.out.println("3. Both");
        System.out.println("4. None");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int serviceBill = 0;

        switch (choice) {
            case 1:
                serviceBill = foodCharge;
                break;
            case 2:
                serviceBill = laundryCharge;
                break;
            case 3:
                serviceBill = foodCharge + laundryCharge;
                break;
            case 4:
                serviceBill = 0;
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        double totalBill = (roomBill + serviceBill)*days;

        System.out.println("    BILL DETAILS ");
        System.out.println("Room Bill      : " + roomBill);
        System.out.println("Service Charges: " + serviceBill*days);
        System.out.println("Total Bill     : " + totalBill);

        sc.close();
    }
}