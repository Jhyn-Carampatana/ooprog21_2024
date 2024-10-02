public class MathTest {
    public static void main(String[] args) {
    double number = 37.0;
    
    double radians = Math.toRadians (270);
    System.out.println("Sqrt: " + Math.sqrt(number));
    System.out.println("Sin: " + Math.sin(radians));
    System.out.println("Cos: " + Math.cos(radians));
    System.out.println("Floor:" + Math.floor(22.7));
    System.out.println("Ceil: " + Math.ceil(22.3));
    System.out.println("Round: " + Math.round(22.5));
    
    int num1 = 68, num2  = 71;
    
    System.out.println("Max: " + Math.max(num1, num2));
    System.out.println("Min:" + Math.min(num1, num2));
    
    double randomNumber = Math.random () * 100;
    System.out.println("Random: " +  randomNumber);
    
    }
  }