import java.util.*;

public class Lab05d {
    public static void main(String[] args) throws Exception {
        
        //Variable Declaration
        
        Scanner scan;
        int noOfTermsInputted;
        final int PART_TWO_CONSTANT;
        double approxValOfPi;
        double currValueOfSeries;
        double userSpecifiedError;
        int noOfTermsNeeded;
        
        //Variable Initialization
        
        scan = new Scanner(System.in);
        PART_TWO_CONSTANT = 4;
        approxValOfPi = 0;
        

        
        
        //Part 1
        
        //printing the approximated mathmatical value of PI by using java math library
        
        System.out.println("Approximate Value of PI: " + Math.PI); 
        
        //Part 2
        
        //Asking user to input the number of terms
        
        System.out.print("Enter the number of terms of the infinite series to approximate the value of PI: ");
        noOfTermsInputted = scan.nextInt();
        
        //As long as loop iteration less than the numbers of terms inputted by the user
        
        for (int i = 1; i <= noOfTermsInputted; i ++) {
            
            //Compute current term of the series 
            
            currValueOfSeries = Math.pow(-1, (double)(i + 1)) * (PART_TWO_CONSTANT / (double)(2 * i -1));
            
            // Add the current term of the series to the approximated sum of PI as it is sum of the series.
            
            approxValOfPi +=  currValueOfSeries;
        
        }
        
        //Display the net answer
        
        System.out.println("Approximate of of Pi: " + approxValOfPi);
        
        //Part 3
        
        //Initialize the current value and approximated value back to zero again to compute them again for this part.
         
        currValueOfSeries = 0;
        approxValOfPi = 0;
        
        //Ask the user to input the error
        
        System.out.print("Specify the error: ");
        userSpecifiedError = scan.nextDouble();
        
        //Initilaizing the no of terms of series as 1.
        
        noOfTermsNeeded = 1;
        
        //As long as we are in the bounds |(Mathmatical value of Pi) - (Approximated value of PI wrt terms in the infinite series)| > Error 
        
        do {
            //Computing Current term of the series
            
            currValueOfSeries = Math.pow(-1, (double)(noOfTermsNeeded + 1)) * (PART_TWO_CONSTANT / (double)(2 * noOfTermsNeeded -1));
            
            //Adding the current value to the approximated value of Pi which is sum of the series
            
            approxValOfPi +=  currValueOfSeries;
            
            // Incrementing the no of terms of the series
            
            noOfTermsNeeded ++;
           
        } while (Math.abs(Math.PI - approxValOfPi) > userSpecifiedError);
        
        //Displaying the output
        
        System.out.println("Approximate of of Pi: " + approxValOfPi);
        System.out.println("no of terms needed: " + noOfTermsNeeded);
        
        
        
        //Closing Scanners
        
        scan.close();
        
    }

}
