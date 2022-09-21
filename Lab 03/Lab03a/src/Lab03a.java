import java.util.*;

public class Lab03a {
    public static void main(String[] args){
        //Variables
        
        int countEven;
        int totalSum;
        int userInput;
        
        //Initialization
        totalSum = 0;
        countEven = 0;
        
        
        //Asking input from user
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userInput = scan.nextInt();
        
        //For loop iteration from 0 to 50
        
        for (int x = 0; x <=50; x++){
            
            if (x >= 1 && x <= userInput){          //if 1 <= x >= userInput
                totalSum = totalSum + x;
            }
            
            System.out.println("Number between 0 and 50 is: " + x);
            
            if (!(x >= 12 && x <= 50)){
                System.out.println("out of range 12-25");
            }
            
            
            if (x % 2 == 0){
                countEven++;
                System.out.println("Hi Two!");
                if (x % 5 ==0){
                    System.out.println("High Five!");
                }
                
                if (x % 3 ==0 || x % 7 == 0){
                    System.out.println("Hi ThreeOrSeven!");
                }
            }
            
            
            else if (x % 5 ==0){
                System.out.println("High Five!");
                if (x % 3 ==0 || x % 7 == 0){
                    System.out.println("Hi ThreeOrSeven!");
                }
            }         
            
            else if (x % 3 ==0 || x % 7 == 0){
                System.out.println("Hi ThreeOrSeven!");
            }
            
            else
                System.out.println("Hi Others");
                              
        }
        //Printing
        
        System.out.println("The number of odd number(s) is " + (51 - countEven) + " and the number of even number(s) is " + countEven);
        
        if (totalSum == (userInput * (userInput + 1)) / 2){
            System.out.println("Yes, sum between 1 and number you inputted is same as n(n+1)/2 which is: "+ totalSum);
        }
          
        else{
            System.out.println("No, sum between 1 and number you inputted is not same as n(n+1)/2");
        }  
    }
}
