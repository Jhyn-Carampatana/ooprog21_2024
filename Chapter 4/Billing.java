public class Billing {
    public static double computeBill(double Price, int Quantity, int CouponDiscount) {
        double Subtotal = Price * Quantity;  
        double discount = Subtotal * CouponDiscount / 100.0; 
        double totalAfterDiscount = Subtotal - discount;
        double totalWithTax = totalAfterDiscount + (totalAfterDiscount * 0.08); 
        return totalWithTax;
    }

    public static void main(String[] args) {
        // Test the computeBill method with different inputs
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2, 1, 1));
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(24.4, 2, 2));
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2, 3, 10));
    }
}

   