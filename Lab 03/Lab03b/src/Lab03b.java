import java.util.*;
import java.lang.Math;

public class Lab03b {
    public static void main(String[] args) {
        //Variables
        
        Float sideA;
        Float sideB;
        Float sideC;
        
        Float s;
        Double area;
        
        
        // Taking input from the user and storing them on variables
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of first side of triangle: ");
        sideA = scan.nextFloat();
        System.out.print("Enter the length of second side of triangle: ");
        sideB = scan.nextFloat();
        System.out.print("Enter the length of third side of triangle: ");
        sideC = scan.nextFloat();
        
        //checking if numbers you inputted actually form a triangle
        
        if ((sideA < (sideB + sideC)) && sideB < (sideA + sideC) && sideC < (sideA + sideB)){
            //initializing variable
        
            s = (sideA + sideB + sideC) / 2;
        
            // Calculating the area
        
            area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
            
            //printing
         
            System.out.println("The area : " + area);
            System.out.println("The number of flowers are: " + (int) (area * 17));
        }
        
        else{
            System.out.println("The numbers you inputted do not form the triangle.");
        }
    }
    
    
}
