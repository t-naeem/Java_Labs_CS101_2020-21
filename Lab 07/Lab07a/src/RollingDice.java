import java.util.Random;

public class RollingDice {
    
    public static void main(String[] args) throws Exception {
        
        //Variables Declaration
        Random firstDie;
        Random secondDie;
        int rollCount;
        int firstResult;
        int secondResult;

        //VariableInitialization 
        rollCount = 0;
        firstDie = new Random();
        secondDie = new Random();
        firstResult = 0;
        secondResult = 1;
        
        System.out.println("--------------------Part 1--------------------------");
    
        //As long as the result is not 6 for both, we continue to roll
        while ( !(firstResult == 6 && secondResult == 6) ) {
            
            //Generate random number from 1-6
            firstResult = firstDie.nextInt(6);
            secondResult = secondDie.nextInt(6);
            firstResult ++;
            secondResult ++;
            
            //Display the result
            System.out.println("Result of first die: " + firstResult + " and Result of second die: " + secondResult);
            
            //if result of first and second die are equal
            if ((firstResult == 6) && (secondResult == 6)) {
                //print that it both die had a six on the faces
                System.out.println("Result of both die is 6");
            }
            //increment the roll count
            rollCount ++;
        }

        //Output the no of rolls it took to get both 6's
        System.out.println("Number of rolls taken: " + rollCount);


        System.out.println("\nPart 2");
        System.out.println("A while loop to loop through is required number of dice rolls by making new variables for each die.");






    }
}
