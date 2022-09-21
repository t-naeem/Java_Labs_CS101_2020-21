import java.util.*;
import java.nio.file.*;  
import java.io.*;

public class Lab03c {
    public static void main(String[] args) throws FileNotFoundException{
        //Variables
        
        String name;
        int age;
        double grossSalary;
        String comment;      
        int taxPercent;
        
        //Constants
        
        final String doctypeHTML = "<!DOCTYPE html>";
        final String html = "<html>";
        final String head = "<head>";
        final String title = "<title>";
        final String endTitle = "</title>";
        final String endHead = "</head>";
        final String body = "<body>";
        final String hr = "<hr>";
        final String h1 = "<h1>";
        final String endh1 = "</h1>";
        final String pAge = "<p>Age:";
        final String endPara = "</p>";
        final String pGrossSalary = "<p>Gross Salary (";
        final String pComments = "<p>Comments:";
        final String jpg = ".jpg";
        final String imgSrc = "<img src =\"";
        final String endImgTag = ".jpg\">";
        final String endBody = "</body>";
        final String endHtml = "</html>";
        
        
        //Asking input from user.
        
        Scanner scan = new Scanner(System.in);
        PrintStream originalStdOut = System.out;
        
        System.out.print("Enter your name:");
        name = scan.nextLine(); 
        System.out.print("Enter your age:");
        age = scan.nextInt();
        System.out.print("Enter your salary:");
        grossSalary = scan.nextDouble(); 
        Scanner sc = new Scanner(System.in);         
        System.out.print("Enter your comments:");
        comment = sc.nextLine();
        
        
        //Age Check

        if (age < 0){
            System.out.println("An error occured while typing the age.");
            System.exit(0); // terminate the program
        }
        
        // Gross Salary computations
        
        grossSalary = (grossSalary - 100);
               
        if (grossSalary < 0 || grossSalary > 10000){
            System.out.println("An error occured while tying the gross salary. Either it has exceeded limit of $10000 or it is less than 100.");
            System.exit(0);       
        }
        if (grossSalary < 1000){
            taxPercent = 5;
            grossSalary = 0.95 * grossSalary;
        }
        else if (grossSalary > 5000){
            taxPercent = 25;
            grossSalary = 0.75 * grossSalary;
        }
        
        else{
            taxPercent = 15;
            grossSalary = 0.85 * grossSalary;
        }
        
   
        System.setOut(new PrintStream( "magic.htm"));
        
        
        //html printing
        System.out.println(doctypeHTML);
        System.out.println(html);
        System.out.println(head);
        System.out.println(title + name + "'s Home Page" + endTitle);
        System.out.println(endHead);
        System.out.println(body);
        System.out.println(hr);
        System.out.println(h1 + name + endh1);
        System.out.println(pAge + age + endPara);
        System.out.println(pGrossSalary + taxPercent + "% tax):" + grossSalary + endPara);
        System.out.println(pComments + comment + endPara);
        if (Files.exists( Paths.get(name + jpg))){
            System.out.println(imgSrc + name + endImgTag);
        }
        System.out.println(hr);
        System.out.println(endBody);
        System.out.println(endHtml);  
        
        //Closing Html
        System.out.close();
        System.setOut(originalStdOut);
        System.out.println( "Webpage created.");
        
    }
}
