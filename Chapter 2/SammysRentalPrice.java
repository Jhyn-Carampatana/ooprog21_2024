import java.util.Scanner;
 public class SammysRentalPrice {
   public static void main(String [] args) {
   
   double Minute_Rate = 1.0;
   double Hourly_Rate = 40.0;
  
   
   System.out.println ("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + "\nS Sammy's makes it fun in the sun. S" + "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   Scanner scanner = new Scanner(System.in);
   
   System.out.println ("Enter the number of minutes the equipment was rented:");
   int totalMinutes = scanner.nextInt();
   
  
   int Minutes = totalMinutes % 60;
   
   int Hours = totalMinutes / 60;
   
   int Cost = 40 * Hours + Minutes;
   
   double totalPrice = (Hours * Hourly_Rate) + (Minutes * Minute_Rate);
   
   System.out.println ("Hours rented:" + Hours);
   
   System.out.println ("Minutes rented:" + Minutes);
   System.out.println ("Total Price: $" + totalPrice);
   
   scanner.close();
   
  }
 
 } 