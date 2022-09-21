import java.util.*;

public class Lab2a {
    public static void main(String[] args) {
        //variables
        final String s = "Talha Naeem";
        String t;
        int age;
        
        //Part 1
        
        System.out.println("Hello, Talha Naeem, welcome to Java!");
        
        //Part 2
        
        System.out.println("Hello");
        System.out.println("Talha Naeem");
        System.out.println("Welcome to Java!");
        
        //Part 3
    
        System.out.println("Hello " + s  + " welcome to Java!");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        
        //Part 4
        
        t = scan.nextLine();
        System.out.println("Hello" + " " + t + " " + "welcome to Java!");
        System.out.print("Enter Your name: ");
        
        //Part 5
        
        t = scan.nextLine();
        System.out.print("Enter ur age: ");
        age = scan.nextInt();
        
        //Part 6
        
        System.out.println("Your age is " + age);
        
        
        
        
    }
}
