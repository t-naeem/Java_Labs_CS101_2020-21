import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.lang.Math.*;


import java.nio.file.Files;
import java.nio.file.Paths;

public class Lab04f {
    public static void main(String[] args) throws IOException {
        
        //variable declaration

        File f;
        File f1;
        FileWriter fw;
        FileWriter fw1;
        FileReader fr;
        BufferedReader br;
        FileReader fr1;
        BufferedReader br1;
        BufferedWriter bw1;
        Scanner scan;
        int n;
        Scanner sc;
              
        
        //Variable Initialization and Asking input(s).
         
        f = new File("RandomNumbersGenerator.txt");  // creates a file with the title "StoredNumbers"
        fw = new FileWriter(f);   //initialize file writer
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        
        f1 = new File("ModifiedRandomNumbersGenerator.txt");  // creates a file with the title "StoredNumbers"
        fw1 = new FileWriter(f1);   //initialize file writer 1.
        bw1 = new BufferedWriter(fw1);
        fr1 = new FileReader(f1);
        br1 = new BufferedReader(fr1);
        
        
        
        // fr = new FileReader(f1); //initialize file reader.
        // br = new BufferedReader(fr); //initilaize buffered reader so that strings can also be read
        
        scan = new Scanner(System.in); // for scanning number of inputs to be inputted by the user.
        
                       
        System.out.println("Enter how many times you want the values to be inputed: "); //Ask how many times you want a certain no. to be printed
        
        n = scan.nextInt(); //scan number of inputs (n) to be inputted by the user
        int on = n;
        
        
       
        
        //As long as number of inputs (n) is greater than zero.    
        
        int count = 0;
        
        while (n > 0){ 
            
            Random r = new Random();
            int rand = r.nextInt(101);
            
            fw.write(rand + "\n");  //Write that particular value in the file.
            
            n --;  // Decrement the number of inputs (n).
            count ++;

        } 
        
        fw.close(); //close the filewriter
        
        
        
        sc = new Scanner(System.in); //for scanning each value.
        
        System.out.println("Enter how many values you want to make negative at random locations in file: ");
        
        int negNums = sc.nextInt();
        
        
        //String line = Files.readAllLines(Paths.get("RandomNumbersGenerator.txt")).get(n);

        int lineCount = 1;
        int index = 0;
        
        Random randNum = new Random();
        Set<Integer>set = new LinkedHashSet<Integer>();
        
        while (set.size() < negNums) {      
            
            set.add(randNum.nextInt(count)+1);
        }
        
        List<Integer> targetList = new ArrayList<>(set);
        Collections.sort(targetList);
        
        
        
        // System.out.println(targetList);
        // System.out.println(targetList.size());
        
        String i= "";
        
        while (on > 0) {
            fw1.write(Files.readAllLines(Paths.get("RandomNumbersGenerator.txt")).get(lineCount-1) + "\n");
            lineCount ++;
            on --;
            
        }
        fw1.close();
        
        int lineCount1 = 0;
        
        while (negNums - 1 > 0){ 
            System.out.println("index "+ index);
            System.out.println("linecount " + lineCount1);
            //System.out.println(targetList.get(index));
            
            int lineCont = targetList.get(index);
            System.out.println("List Index " + lineCont);
            
            String ValAccess = Files.readAllLines(Paths.get("RandomNumbersGenerator.txt")).get(lineCont);
            System.out.println(ValAccess);
            
            System.out.println(i.contains(ValAccess));
            
			if (i.contains(ValAccess)) {
                System.out.println("hi \n");
                i = i.replaceAll(ValAccess, "-" + ValAccess);
 
            }
            
            lineCont ++;
            index ++;
            lineCount1 ++;
            negNums --;  // Decrement the number of inputs (n).

        } 
        br.close();
        
 
        
        //Close the io files and scanners. 
        bw1.close();
        fw1.close();
        scan.close(); //close scanner for number of inputs
        sc.close();   //close scanner for scanning each value inputted.
        
        
    }

}
