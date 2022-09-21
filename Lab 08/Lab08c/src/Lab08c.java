import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Lab08c {
    
    public static void main(String[] args) throws Exception {
        
        //Variable Declaration
        BufferedReader buffReader;
        int currCountDigit;
        String fileToString;
        String[] singleWordList;
        List <String>  listStringLen;
        int maxCount;
        int timesAppeared;
        int maxTimeAppeared;
        int maxFreqStringLen;
        
        //initialization
        buffReader = new BufferedReader(new FileReader("file.txt"));
        fileToString = buffReader.readLine();
        singleWordList = fileToString.split(" ");
        listStringLen = new ArrayList <String>();
        maxCount = 0;
        timesAppeared = 0;
        maxTimeAppeared = 0;
        maxFreqStringLen = 0;
        
        //iterate over the list of stored words
        for (String i : singleWordList) {
            
            //Get and Store the length of the word in the list
            currCountDigit = i.length();
            
            //decrement the length of teh string if following characters are contained in them
            if (i.contains(",") || i.contains(".") || i.contains(";") || i.contains("\"")) {
                currCountDigit --;
            }
            
            listStringLen.add(String.valueOf(currCountDigit));   
    
            //check if current length digit is greater than maximum length 
            if (currCountDigit > maxCount) {
                maxCount = currCountDigit;
            }   

        }
        
        //iterate from 1 to maxCount i.e. 10
        for (int i = 1; i <= maxCount; i++) {
            
            //iterate over list of strings
            for (String j : listStringLen) {
                
                //count number of times the word of length i has appeared
                if (i == Integer.parseInt(j)) {
                    timesAppeared ++; 
                    //check for maximum number of times a word of specific length has appeared
                    if (timesAppeared > maxTimeAppeared) {
                        maxTimeAppeared = timesAppeared;
                        maxFreqStringLen = i;
                    }
                }
            }
            
            //Display
            System.out.print(timesAppeared + " words of length " + i + ", ");
    
            //reset times appeared for next loop iteration
            timesAppeared = 0;
    

        }
        
        //Display output
        System.out.println("\n The longest word has length " + maxCount);
        System.out.println("The most frequently occuring word length is " + maxFreqStringLen + " and it occured " + maxTimeAppeared + " times.");

       //close buffered read
       buffReader.close();
    }
}
