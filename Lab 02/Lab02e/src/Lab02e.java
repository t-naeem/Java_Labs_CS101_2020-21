import java.util.*;

public class Lab02e {
    public static void main(String[] args){
        //Variables
        
        String name;
        int age;
        double salary;
        String comment;
        
        //Asking input from user.
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = scan.nextLine(); 
        System.out.print("Enter your age:");
        age = scan.nextInt();
        System.out.print("Enter your salary:");
        salary = scan.nextDouble(); 
        Scanner sc = new Scanner(System.in);         
        System.out.print("Enter your comments:");
        comment = sc.nextLine();
        
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>" + name + "'s Home Page");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("<hr>");
        System.out.println("<h1>" + name + "</h1>");
        System.out.println("<p>Age:" + age + "</p>");
        System.out.println("<p>Salary:" + salary + "</p>");
        System.out.println("<p>Comments:" + comment + "</p>");
        System.out.println("<hr>");
        System.out.println("</body>");
        System.out.println("</html>");
        
        
        
    }
}
