import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Lab04d {
    public static void main(String[] args) throws FileNotFoundException {
        
        //variable declaration
        
        Scanner scan;
        String filename;
        PrintWriter fout;
        Scanner sc;
        int numOfValues;
        double randValue;
        
        //Variable initialization and asking input from the user.
        
        scan = new Scanner(System.in);
        
        System.out.print("Enter the name of the file: "); //Ask user the file name
        
        filename = scan.nextLine();
        
        fout = new PrintWriter( filename + ".txt");
        
        sc = new Scanner(System.in);
        
        System.out.print("Enter how many times you want the random integer value to be inputted in the file: "); //Ask how many times
        
        numOfValues = sc.nextInt();
        
        //Throw an error message if value <= 0.
        
        if (numOfValues < 0){
            System.out.println("An error occured while generating your file.The value you entered is less than or equal to zero.");
        }
        
        //Otherwise print the random values as many times as user asked.
        
        while (numOfValues > 0) {
            randValue = Math.random(); //initilizing the randValue so that it randomizes all the time.
            fout.println(randValue);
            numOfValues --;
        }
        
        //Print file generated succesful message if program compiles correctly.
        
        System.out.println("Your file was generated successfully.");
        
        //Closing the scanners and print writers.
        
        scan.close();
        sc.close();
        fout.close();
    }
}
