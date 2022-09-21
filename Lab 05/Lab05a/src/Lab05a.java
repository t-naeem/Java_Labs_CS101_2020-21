import java.util.*;

public class Lab05a {
    public static void main(String[] args) throws Exception {
        //Variable Declaration
        Scanner scan;
        Scanner sc;
        int rectWidth;
        int rectHeight;
        int rectThickness;
        String continueCond;
        
        //Variable initialization
        
        scan = new Scanner(System.in);
        sc = new Scanner(System.in);
        

        //Unless user enters "y" and waanst to print the pattern
        
        do {
            
            //Ask for the width of the rectangle
            
            System.out.print("Enter width of the rectangle: ");
            rectWidth = scan.nextInt();
        
            //Ask for the height of the rectangle
            
            System.out.print("Enter height of the rectangle: ");       
            rectHeight = scan.nextInt();
        
            //Ask for the thickness of the rectangle
            
            System.out.print("Enter thickness of the rectangle: ");
            rectThickness = scan.nextInt();
        
        
            //Error Message if any of the negative values are inputted by the user
        
            if (rectWidth <= 0 || rectHeight <= 0 || rectThickness <= 0) {
                System.out.println("Error: all values must be positive!");
            }
        
            // For loop Body for printing width
            
            //As long as loop iteration is less than height

            for(int j = 1; j<= rectHeight; j++) {  
            
                //As long as loop iteration is less than width

                for(int i=1; i<=rectWidth; i++) {
                    
                    //Print * if our i is between thickness inputted and (width - thickness)

                    if((i <= rectThickness  || i > rectWidth - rectThickness)) {  

                        System.out.print("*");

                    }
                
                    //Otherwise 

                    else {
                        
                        //Print * if our j is between thickness inputted and (height - thickness)
                        
                        if (j <= rectThickness || j > rectHeight - rectThickness){
                            System.out.print("*");
                        }
                        
                        //Otherwise print a space
                        
                        else{
                            
                            System.out.print(" ");
                        }
                    

                    }

                }
               
                //Go to next Line
                
                System.out.println();

            }
            
            
            //If width - thickness and heignt - thickness is less than the thickness then there is a hole so alert the user
            
            if (rectWidth - rectThickness < rectThickness && rectHeight - rectThickness < rectThickness) {
                System.out.println("Oops... no hole!");
            }
            
            //Ask user if he wants to continue
            
            System.out.println("Do you wish to create another pattern: ");
            continueCond = sc.nextLine();
            
            
        } while (continueCond != null && continueCond.equals("y"));
        
        //Display Farewell message if user intends to leave
        
        
        System.out.println("Goodbye!");


        //Close Scanners
        scan.close();
        sc.close();
    }
    
}
