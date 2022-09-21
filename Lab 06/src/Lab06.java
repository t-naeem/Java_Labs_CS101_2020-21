import java.util.*;

public class Lab06 {
    
    //Variable Declaration
    
    static double netValueOfPower;
    static int netValueOfFactorial;
    static String revString;
    static int decimalValue;
    static StringBuilder binaryStringBuilder;
    static int remainder;
    static Scanner scan;
    static String userBinaryStr1;
    static String userBinaryStr2;
    static int binarySum;
    static String currWordString;
    static String outString;
    static double x;
    static double valueSinX;
    
       
    /**
    * This is a brief description of the method.
    * @param x is the base which is raised to some power
    * @param y is the power value to which x is raised 
    * @return doublue value of x to the power y
    */
    
    
    public static double power( double x, int y) {
        
        //initialize net value of power as 1
        
        netValueOfPower = 1;
        
        //Multiply x with net value of power as many times as y. Basicaly x * x * x .... * x. Number of x's are y
        
        for (int i = 1; i <= y; i++) {    
            //Multiply x with net value of power   
            netValueOfPower *= x;
        }
        		
        return netValueOfPower;   
    }
    
     
    /**
    * This is a brief description of the method.
    * @param n is the integer value of whose factorial needs to be computed
    * @return integer value of n factoiral
    */
    
    
    public static int factorial (int n) {
        
        //initilize current value of factorial as 1
        netValueOfFactorial = 1;
        
        //As long as we are in range [0,n). Basically this loop n * n-1 * n-2 * ... * 1 
        for (int i = 0; i < n; i++) {   
            //decrement n are multiply it with previous value of factorial   
            netValueOfFactorial *= n - i;
        }		
        return netValueOfFactorial;   
    }
    
    
    
    
    /**
    * This is a brief description of the method.
    * @param s is the String input
    * @return the string value of revese of inputted String s
    */
    
    
    public static String reverseString (String s) {
        
        //Initialize our output reverse string as empty
        
        revString = "";
        
        //Until we have reached the the first character of teh string staring from the end charcater
        
        for (int i = s.length() - 1; i >= 0; i--) {

            //Contactinate the current character of the iteration with the resultant reverse string
            
            revString = revString + s.charAt(i);
        }
        		
        return revString;   
    }
    
      
    /**
    * This is a brief description of the method.
    * @param base2 is the String input
    * @return the decimal value of the binary string inputted
    */
    
    
    public static int toDecimal(String base2) {
        
        //initilaize the outputting decimal value as 0
        decimalValue = 0;
        
        //Iff we have 0's or 1's in the string 
        if (base2.contains("0") || base2.contains("1")) {
            
            //until we have reached the end of string   
            for (int i = 0; i <= base2.length() - 1; i ++) {
                
                //formula for converting binary to decimal
                decimalValue = decimalValue * 2 + Character.getNumericValue(base2.charAt(i)) ;
            }
        }  
  	
        
        return decimalValue;   
    }
    
    
    
    /**
    * This is a brief description of the method.
    * @param n is the integer input
    * @return the string value of resulting binary number from teh decimal input integer
    */
    
    
    public static String intToBinary(int n){
        
        //Initilaize the outputting binary string as empty    
        String binaryString = "";
        
        //As long as n is greater than 0  
        while(n > 0){
            
            //Get get remainder of current value of n
            remainder = n % 2;
            
            // Ad the remainder to the binary string   
            binaryString = binaryString + remainder;
            
            //reverse the string   
            binaryString = reverseString(binaryString);
            
            //Divide n by 2   
            n = n / 2;
        }
 
        return binaryString;
    }
    
    
    public static void main(String[] args) throws Exception {
        
        //Part 1
        
        //As long as we are iterating from -1 to 10  
        for (int i = -1; i <= 10; i++) {
            
            //Display the powers in one line with appropriate spaces
            System.out.print(power(i, 1) + "  " + power(i, 2) + "  " + power(i, 3) + "  " + power(i, 4));
            
            //Move to next Line
            System.out.println();
        }
        
        
        //Part 2
        
        //As long as we are iterating from 1 to 15  
        for (int i = 1; i <= 15; i++) {  
              
            //Display output of factorial in one line with appropriate spaces   
            System.out.print(factorial(i) + "  ");
        }
        
        System.out.println();
        
        //Part 3
        
        scan = new Scanner(System.in);
        
        //Ask binary string from user    
        System.out.println("Enter Base-2 binary string: ");
        userBinaryStr1 = scan.nextLine();
        
        //Ask another binary strinf from teh user   
        System.out.println("Enter another Base-2 binary string: ");
        userBinaryStr2 = scan.nextLine();
        
        //Initialize binary sum as sum of two binary string, but first convert them to decimal and then add   
        binarySum = toDecimal(userBinaryStr1) + toDecimal(userBinaryStr2);
        
        //Display the binary sum by converting from decimal to binary first  
        System.out.println("Binary Sum of the inputted numbers is: " + intToBinary(binarySum));
        System.out.println(binarySum);
        System.out.println(toDecimal((intToBinary(binarySum))));
        
        
        //Part 4
        
        //Initialize string as ""  
        outString = "";
        
        //Ask input string from the user   
        System.out.print("Enter the string: ");
        String userInputString = scan.nextLine();
        
        //Intialize current word separated by space as empty
        currWordString = "";
        
        //for each word in a list
        
        for  (int i = 0; i < userInputString.length(); i ++) {
            
            //If index corresponds to a space
            if (String.valueOf(userInputString.charAt(i)).equals(" ")) {
                
                //Reverse the current word
                currWordString = reverseString(currWordString);
                
                //Concatenate with output string
                outString = outString + " " + currWordString;
                
                //Empty the current word
                currWordString = "";
            }
            
            //Otherwise
            else {
                
                //Add teh current character in the word
                currWordString = currWordString + userInputString.charAt(i); 
            }
        }
        
        //Display the output string 
        System.out.print(outString + "\n");
        
        //Part 5
        
        System.out.print("Enter the value of angle x: ");
        x = scan.nextDouble();
        
        //Convert to radians
        x = Math.toRadians(x);
        
        //Initialize the value of answer sin(x) as 0   
        valueSinX = 0;
        
        //iterate from 0 to 10. Basically making 10 columns     
        for (int i = 0; i <= 10; i ++) {
            
            //Display Column Number    
            System.out.print(i + "         ");
            
        }
        
        //Move to next line     
        System.out.println();
        
        for (int i = 0; i <= 10; i ++) {
            
            //Display -1^i        
            System.out.print(power(-1, i) + "       ");
            
        }
        
         //Move to next line     
         System.out.println();
       
        
        for (int i = 0; i <= 10; i ++) {
            
            //Display x^(2n+1)    
            System.out.print((float)power(x, 2 * i + 1) + "  ");
            
        }
        
        //Move to next line     
        System.out.println();
        
        
        for (int i = 0; i <= 10; i ++) {
            
            //Display factorial         
            System.out.print(factorial(2 * i + 1) + "    ");
            
        }
        
        //Move to next line   
        System.out.println();
        
        //itrate from 0 to 10   
        for (int i = 0; i < 10; i++) {       
            //Add each term of the series to the value of sin(x)       
            valueSinX += (power(-1, i) / (double) factorial(2 * i + 1)) * power(x, 2 * i + 1);
            
            //Display the each term of the series from 0 to 10 in one line separated by appropriate spaces aliningning with column number.        
            System.out.print((float)valueSinX + "  ");
        }
        
        //Move to next line and print conclusion   
        System.out.println("\n Number of terms are less");
        
        
        //Part 6
        
        //Display Math.sin(x) value    
        System.out.println("\n Actual value of Sin x is : " + Math.sin(x));
        System.out.println("Differnce: " + (Math.sin(x) - valueSinX));
        
        //Close the scanner
        scan.close();
    }
}
