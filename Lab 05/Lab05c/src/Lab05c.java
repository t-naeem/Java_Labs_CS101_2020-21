import java.util.*;

public class Lab05c {
    public static void main(String[] args) throws Exception {
        
        //Variable Declaration
        
        Scanner scan;
        String operatorInputted;
        float valueInputted;
        String userInputString;
        float netResult;
        
        
        //Variable initialization
        
        scan = new Scanner(System.in);
        valueInputted = 0;
        netResult = 0;
        operatorInputted = "";
        userInputString = "";
        
        System.out.println("Welcome to SimpleCalc.");
        
        //Do While Loop: As long as user does not input Quit. Do this:
        
        do {
            
            //Display the Main Menu:
            
            System.out.println("---------------------");
            System.out.println("[ " + netResult + " ]");
            System.out.println("---------------------");
            System.out.println("+,-,*,/ value \n Clear \n Quit");
            System.out.print("Select: ");
            
            //Ask input from the user
            
            userInputString = scan.nextLine();

            
            //Make Net result as zero if user inputs Clear
            
            if (userInputString.equals("Clear")) {
                netResult = 0;
            }
             
            //Otherwise if user inputs any operator followed by a space

            else if (userInputString.contains(" ") && (userInputString.contains("+") || userInputString.contains("-") || userInputString.contains("*") || userInputString.contains("/"))) {
                  
                // Get the first character of the user input which will be the operator: 
                
                operatorInputted = Character.toString(userInputString.charAt(0));
                
                // Get all the values of user input after the space which will be teh value inputted by the user.
                
                valueInputted = Float.parseFloat(userInputString.substring(2));

                //Perform Addition if + operator is used with teh value inputted
                
                if (operatorInputted.equals("+")) {
                    netResult += valueInputted;
                }
                
                //Perform Subtraction if - operator is used with the value inputted
                
                else if (operatorInputted.equals("-")) {
                    netResult -= valueInputted;
                }
                
                //Perform Multiplication if * operator is used with the value inputted

                else if (operatorInputted.equals("*")) {
                    netResult *= valueInputted;
                }
                
                //Perform Division if / operator is used with the value inputted
            
                else if (operatorInputted.equals("/") && valueInputted > 0) {
                    netResult /= valueInputted;             
                }
            }
            
            //Throw input error message if user did not enter Space and Quit
            
            else if (!userInputString.equals("Quit") && !userInputString.contains(" ")) {
                System.out.println("Input Error: You should enter OPERATOR, enter SPACE, and then enter NUMERICAL VALUE");
            }
            
            
        } while (!userInputString.equals("Quit"));
        
        //Display Farewell message after user says QUIT
        
        System.out.println("Thanks for using SimpleCalc, goodbye.");
        
        //close scanner
        
        scan.close();
    }
}
