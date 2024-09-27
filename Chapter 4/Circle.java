public class Circle {

    
    public static double getDiameter(double radius) {
        return 2 * radius;
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius1 = 3.0;
        double radius2 = 20.0;

        double diameter1 = getDiameter(radius1);
        double area1 = getArea(radius1);
        double diameter2 = getDiameter(radius2);
        double area2 = getArea(radius2);

        System.out.println("Radius of the first circle: " + radius1);
        System.out.println("Diameter of the first circle: " + diameter1);
        System.out.println("Area of the first circle: " + area1);

        System.out.println("Radius of the second circle: " + radius2);
        System.out.println("Diameter of the second circle: " + diameter2);
        System.out.println("Area of the second circle: " + area2);
    }
}
