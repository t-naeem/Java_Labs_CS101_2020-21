import java.util.*; 
import java.lang.Math;

public class Lab02c {
    
    public static void main(String[] args) {
        //variables
        float numA;
        float numB;
        float addition;
        float difference;
        float product;
        float division;
        float remainder;
        float max;
        float min;
        
        
        //Asking for the numbers from the users
        
        System.out.print("Enter Your first number: ");
        Scanner scan = new Scanner(System.in);
        numA = scan.nextFloat();
        numA = (float) Math.pow(2,31);
        System.out.print("Enter Your second number: ");
        numB = scan.nextFloat();
        
        //Declaring and initializing the variable
        
        addition = numA + numB;
        difference = numA - numB;
        product = numA * numB;
        division = numA / numB;
        remainder = numA % numB;
        max = Math.max(numA, numB);
        min = Math.min(numA, numB);
        
        //Printing the result
        
        System.out.println("The sum of two numbers is " + addition);
        System.out.println("The difference of two numbers is " + difference);
        System.out.println("The product of two numbers is " + product);
        System.out.println("The division of two numbers is " + division);
        System.out.println("The remainder of two numbers is " + remainder);
        System.out.println("The maximum of two numbers is " + max);
        System.out.println("The minimum of two numbers is " + min);      
        
    }
}
