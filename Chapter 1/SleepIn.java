public class SleepIn {
   public static boolean sleepIn(boolean weekdays, boolean vacation) {
   return !weekdays || vacation;
   
   }
   
   public static void main (String[] args) {
   System.out.println(sleepIn(false,false));
   System.out.println(sleepIn(true,false));
   System.out.println(sleepIn(false,true));
   System.out.println(sleepIn(true,true)); 
  
  }
 
 }