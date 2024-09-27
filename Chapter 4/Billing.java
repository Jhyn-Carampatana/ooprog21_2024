public class Billing {
      public static double computeBill(double Price, int Quantity, int CouponDiscount) {
        return calculateTotal(Price * Quantity, CouponDiscount);
    }

    public static double computeBill(double Price, int Quantity) {
        return calculateTotal(Price * Quantity, 0);
    }

       public static double computeBill(double Price) {
        return calculateTotal(Price, 0);
    }

    private static double calculateTotal(double Subtotal, int CouponDiscount) {
        double discount = Subtotal * CouponDiscount / 100.0; 
        double totalAfterDiscount = Subtotal - discount;
        double totalWithTax = totalAfterDiscount + (totalAfterDiscount * 0.08); 
        return totalWithTax;
    }
    public static void main(String[] args) {
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2, 1, 1));
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(24.4, 2));
        System.out.printf("The total price for the bill is: $%.15f%n", computeBill(23.2));
    }
}


   
