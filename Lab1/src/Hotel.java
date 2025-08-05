import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base bill amount: ");
        double baseAmount = sc.nextDouble();

        double gst = baseAmount * 0.18; // assuming 18% GST
        double maintenance = baseAmount * 0.05; // assuming 5% maintenance
        double totalBeforeDiscount = baseAmount + gst + maintenance;
        double discount = (totalBeforeDiscount > 1000) ? totalBeforeDiscount * 0.10 : totalBeforeDiscount * 0.05;
        double totalAfterDiscount = totalBeforeDiscount - discount;

        System.out.println("\n--- Bill Breakdown ---");
        System.out.println("Base Amount: ₹" + baseAmount);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Maintenance (5%): ₹" + maintenance);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Total Payable: ₹" + totalAfterDiscount);
    }
}