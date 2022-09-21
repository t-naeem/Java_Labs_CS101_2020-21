import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

public class Lab04g {
    public static void main(String[] args) throws IOException {
        
        //variable declaration
        
        final int upperbound;
        File f;
        FileWriter fw;
        Scanner scan;
        int n;
        Scanner sc;
        int limit;
        int maximum;
        int minimum;
        int sum;
        int count;
        FileReader fr;
        BufferedReader br;
        String i;       
        
        //Variable Initialization and Asking input(s).
        
        upperbound = 1000;
         
        f = new File("StoredNumbers.txt");  // creates a file with the title "StoredNumbers"
        fw = new FileWriter(f);   //initialize file writer
        
        fr = new FileReader(f); //initialize file reader.
        br = new BufferedReader(fr); //initilaize buffered reader so that strings can also be read
        
        
        scan = new Scanner(System.in); // for scanning number of inputs to be inputted by the user.
        
        
        sum = 0; // initialize sum as 0.
        count = 0; //initialize count as 0.
        limit = 0; //initialize limit as 0.
        maximum = 0; // initialize maximum as 0.
        minimum = 0; // initialize minimum as 0.
               
        System.out.println("Enter how many times you want the values to be inputed: "); //Ask how many times you want a certain no. to be printed
        
        n = scan.nextInt(); //scan number of inputs (n) to be inputted by the user
        
        
        sc = new Scanner(System.in); //for scanning each value.
         
        
        //As long as number of inputs (n) is greater than zero.    
        
        while (n > 0){ 
            
            //Get out of the loop if limit has exceeded the upperbound
            
            if (limit > upperbound) {
                break;
            }
            
            //otherwise carry on with the loop
            
            Random r = new Random();
            int rand = r.nextInt();
            
            fw.write(rand + "\n");  //Write that particular value in the file.
            
            n --;  // Decrement the number of inputs (n).
            
            limit ++; //increment the limit
        }
        
        fw.close(); //close the filewriter
        
        
        //As long as there is a line that is yet to be read in the file.
        
        
        while ((i = br.readLine()) != null){
  
            
            //Break the loop when we come up with a negative number
            
            if (Integer.parseInt(i) < 0) {
                break;
            } 
            
            //if integer on the current line is greater than maximum replace it
            
            if (Integer.parseInt(i) > maximum) {
                maximum = Integer.parseInt(i);
            }
            
            //if integer on the current line is less than minimum replace it
            
            if (Integer.parseInt(i) < minimum) {
                minimum = Integer.parseInt(i);
            }
            
            sum += Integer.parseInt(i); //Add the value on that line to the net sum
            count ++;  //increment the count which is counting umber of lines in the file.
        }       
        
        // Report the output.
        
        System.out.println("The total sum is " + sum + " and total count is " + count);
        System.out.println("The maximum of all geenrated numbers is " + maximum + " and mimimum of all numbers is " + minimum);
        
        //print average iff count > 0.
        
        if (count > 0) {
            System.out.println("The average of the all the numbers is " + (sum / count));          
        }
        
        //Close the io files and scanners. 
        
        fr.close();   //close file reader.
        br.close();   //close buffered reader.
        scan.close(); //close scanner for number of inputs
        sc.close();   //close scanner for scanning each value inputted.
        
        
    }
}
