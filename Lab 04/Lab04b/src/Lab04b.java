import java.util.*;

public class Lab04b {
    public static void main(String[] args){
        
        //------------------------------------Part A------------------------------------
        
        // variable declaration
        
        Scanner scan;
        char ch;
        Scanner sc;
        int width;
        int index;
        
        
        // variable initialization
        
        scan = new Scanner(System.in);
        
        System.out.print("Enter any character to print its triangular pattern: "); // Asking input from the user
        
        ch = scan.next().charAt(0);        
        sc = new Scanner(System.in);
        
        System.out.print("Enter the width of the pattern : "); // Asking input from the user
        
        width = sc.nextInt();       
        index = 1;
        

        
        
        
        
        //As long as index is less than the width 
        
        while (index <= width){
            
            // for (int i = 1; i <= index; i++){
            //     System.out.print(ch);
            // }
             
            System.out.println(String.valueOf((ch)).repeat(index)); //print the inputted character same number of times as index          
            
            index ++; //increment the index 
        }
        
        
        //------------------------------------Part B------------------------------------
        
        //variable declaration
        
        Scanner scanB;
        char chB;
        Scanner scB;
        int widthB;
        
        //variable initialization
        scanB = new Scanner(System.in);
        
        System.out.print("Enter any other character to print its reverse triangular pattern: "); // Asking input from the user
        
        chB = scanB.next().charAt(0);        
        scB = new Scanner(System.in);
        
        System.out.print("Enter the width of the pattern : "); // Asking input from the user
        
        widthB = scB.nextInt(); 
        
        
        
             
        
        
        
        //As long as width is greater than 1 
        
        while (widthB >= 1){
            
            System.out.println(String.valueOf((chB)).repeat(widthB)); //print the inputted character same number of times as index
            widthB --; //decrement the width
        }
        
        scan.close();
        sc.close();
        
        scanB.close();
        scB.close();
    }
    
}
