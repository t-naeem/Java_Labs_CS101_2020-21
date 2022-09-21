import java.util.*;
import java.lang.Math;

public class Lab02d {
    public static void main(String[] args) {
        //variables
        float sideA;
        float sideB;
        float sideC;
        float s;
        double area;
        
        // Taking input from the user and storing them on variables
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of first side of triangle: ");
        sideA = scan.nextFloat();
        System.out.print("Enter the length of second side of triangle: ");
        sideB = scan.nextFloat();
        System.out.print("Enter the length of third side of triangle: ");
        sideC = scan.nextFloat();
        
        //initializing variable
        
        s = (sideA + sideB + sideC) / 2;
        
        // Calculating the area
        
        area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
         
        //Printing
        
        System.out.println("The area : " + area);
        System.out.println("The number of flowers are: " + (int) (area * 17));
    }
    
    
}
