import java.util.*;

public class Lab05b {
    public static void main(String[] args) throws Exception {
        
        //Variable Declaration
        Scanner scan;
        int rowEntryInputted;
        int columnEntryInputted;
        int lineSplitCounter;
        
        //Variable Intialization
        
        scan = new Scanner(System.in);
        
        //Ask Row Entry from the user
        
        System.out.print("Enter the row: ");
        rowEntryInputted = scan.nextInt();
        
        //Ask Column Entry from the user
        
        System.out.print("Enter the columns: ");
        columnEntryInputted = scan.nextInt();
        
        //Loop Body for displaying Coordinate System
        
        System.out.println("Loop Body for displaying Coordinate System");
        
        //As long as loop iteration is less than the row entry inputted by the user
        
        for (int i = 1; i <= rowEntryInputted; i ++) {
            
            //As long as loop iteration is less than the column entery inputted by teh user
            
            for (int j = 1; j <= columnEntryInputted; j ++) {
                
                //Print all contents of rows first with approriate spacing
                
                if (i >= 10 && i < 100 || j >= 10 && j < 100){
                    System.out.print("   " + i + "," + j + "  ");
                }
                
                else if (i >= 10 && i < 100 && j >= 10 && j < 100){
                    System.out.print(i + "," + j);
                }
                
                else {
                    System.out.print("   " + i + "," + j + "   ");
                }             
            }
            
            //Go to next line if all row entries are inputted
            
            System.out.println();
        }
        
        //Loop Body for displaying Product of Coordinate System
        
        System.out.println("Loop Body for displaying Product of Coordinate System \n");
        
        //As long as loop iteration is less than the row entry inputted by the user
        
        for (int i = 1; i <= rowEntryInputted; i ++) {
            
            //As long as loop iteration is less than the column entery inputted by teh user
            
            for (int j = 1; j <= columnEntryInputted; j ++) {
                
                //Print all contents of rows first with approriate spacing
                
                if (i >= 10 && i < 100 || j >= 10 && j < 100){
                    System.out.print("   " + i * j + "  ");
                }
                
                else if (i >= 10 && i < 100 && j >= 10 && j < 100){
                    System.out.print(i * j);
                }
                
                else {
                    System.out.print("   " + i * j + "   ");
                }             
            }
            
            //Go to next line if all row entries are inputted
            
            System.out.println();
        }
        
        //Loop Body for displaying cell number
        
        System.out.println("Loop Body for displaying Cell Number \n");
        
        lineSplitCounter = 1;  //for splitting the line after a specific number
        
        for (int i = 0; i < rowEntryInputted * columnEntryInputted; i ++) {
            System.out.print( i + ",");
            if (lineSplitCounter % columnEntryInputted == 0) {
                System.out.println();
            }
            lineSplitCounter ++;
        }
        
        //Loop Body for displaying Row number of row equals column
        
        System.out.println("Diplaying Row number of row equals column \n");
        
        for (int j = 1; j <= columnEntryInputted; j ++) {
            for (int i = 1; i <= rowEntryInputted; i ++) {
                
                if (i == j){
                    System.out.print(i + ",");
                }
                
                else {
                    System.out.print("-,");
                }             
            }
            System.out.println();
        }
        
        
        //Closing Scanners
        scan.close();
    }
}
