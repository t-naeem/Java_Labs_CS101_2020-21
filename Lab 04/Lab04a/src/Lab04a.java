import java.util.*;

public class Lab04a {
    public static void main(String[] args){
        
        //variables
        
        int num;
        int index; // used to refer to index in Part 5
        int value; // used to refer to index in Part 2
        int count; // used to refer to index in Part 6
        int negNum;
        
        //initialization
        index = 0;
        value = 0;
        count = 0;
        
         
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number whose series you want to be printed: ");
        num = scan.nextInt(); 
        
        //constant
        final int origNum;
        
        //initilization of constant
        
        origNum = num;
 
        
        //Part 1
        
        System.out.println("\n Part 1");
        
        while (origNum >= count){
            System.out.print(count + " ");
            count ++;           
        }
        
        //Part 2
        
        System.out.println("\n Part 2");
        
        while (value <= origNum){
           
            if (value % 5 == 0){
                System.out.println();
            }
            System.out.print(value + " ");
            
            value ++;            
        }
        
        //Part 3
        
        System.out.println("\n Part 3");
        
        while (num >= 0){                            
            System.out.print(num + " ");
            num --;            
        }
                
        
        //Part 4
        
        System.out.println("\n Part 4");
        
        negNum = -1 * num;
        
        while (negNum <= origNum){
            if (negNum % 2 == 0){
                System.out.print(negNum + " ");
            }
            negNum ++;            
        }

        
        // Part 5
        
        System.out.println("\n Part 5");
        
        while (origNum >= index){
        
            if (index % 2 == 0){
                if ((index * 2) % 5 == 0){
                    System.out.println();
                }
                System.out.print(index + " ");
            }
          
            index ++;           
        }
        

        //Part 6
        
        System.out.println("\n Part 6");
        index = 3;
        while (origNum >= index){
            if (index % 3 == 0 && index % 4 == 0){
                System.out.print(index + " ");
                count ++;
                if (count == 5){
                    System.out.println();
                }
            }
            
            index ++;
        }
        
        
        //Part 7
        
        System.out.println("\n Part 7");
        

        index = 2;
        
        while (index <= origNum) {
            if (origNum % index != 0){    
                System.out.print(index + " ");  
            }
                
            index ++;
        }
        
    scan.close();   
     
    }
}
