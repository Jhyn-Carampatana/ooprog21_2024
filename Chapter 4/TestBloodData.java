import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BloodData bloodData = new BloodData();

        
        System.out.print("Enter Blood Type: ");
        String bloodType = input.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = input.nextLine();

        
        bloodData.setBloodType(bloodType);
        bloodData.setRhFactor(rhFactor);

        
        bloodData.displayBloodInfo();
    }
}
