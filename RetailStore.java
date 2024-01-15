// A retail store management wants to provide a discount on the bill amount for its customers. The bill details of the customer are as given below. Print the bill id, customer id, and the discounted bill amount for the customers.
import java.util.Scanner;

public class RetailStore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Bill ID: ");
        int billId = s.nextInt();
        System.out.print("Enter Customer ID: ");
        int customerId = s.nextInt();
        System.out.print("Enter Bill Amount: ");
        double billAmt = s.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        int discount = s.nextInt();

        double discountedBillAmt = billAmt - (billAmt * (discount / 100.0));

        System.out.println("Bill ID: " + billId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Discounted Bill Amount: " + discountedBillAmt);

        s.close();
    }
}
// INPUT 1

// Enter Bill ID: 1001
// Enter Customer ID: 101
// Enter Bill Amount: 199.99
// Enter Discount Percentage: 2
// Bill ID: 1001
// Customer ID: 101
// Discounted Bill Amount: 195.99020000000002

// INPUT 2

// Enter Bill ID: 1002
// Enter Customer ID: 102
// Enter Bill Amount: 210.5
// Enter Discount Percentage: 4
// Bill ID: 1002
// Customer ID: 102
// Discounted Bill Amount: 202.08