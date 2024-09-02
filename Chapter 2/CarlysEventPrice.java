import java.util.Scanner;
 public class CarlysEventPrice {
 
 public static void main(String[]args) {
 int Large_Event_Thershold = 50;
 double Price_Per_Person = 35.0;

 Scanner scanner = new Scanner(System.in);
System.out.print("***********************************" + "\n* Carly's makes the food that makes " + "\n \t\t\t\t it a party. \t\t\t\t " + "\n************************************");
 
 
 System.out.println("\nEnter the number of guests attending the event:");
 int numberOfGuests = scanner.nextInt();
 
 boolean isLargeEvent = numberOfGuests >= Large_Event_Thershold;
 double totalPrice = numberOfGuests * Price_Per_Person;

 

 
 System.out.println ("Number of Guests:" + numberOfGuests);
 
 System.out.println ("Price Per Person:" + Price_Per_Person);
 
 System.out.println ("Total Price:" + totalPrice);
 
 System.out.println ("Is This a Large Event?" + isLargeEvent);
 
  scanner.close();
 
 
 }

}
 