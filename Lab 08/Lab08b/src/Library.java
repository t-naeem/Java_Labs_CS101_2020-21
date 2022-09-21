/*
 * Lab08c, Arrays
 * 
 * @author Talha Naeem, Student ID: 21801124
 * @version 20th December 2020
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    Scanner scan = new Scanner(System.in);

    
    int timesLoaned;
    String dueDate;
    ArrayList <String>  libary_books;
    int counter_index;
    String combined_books;


    //Constructor
    public Library(){
    
    timesLoaned = 0;
    libary_books =  new ArrayList<String>();

}

/*
 * Check if the given library is
 * empty
 * 
 */

//check if library is empty
public Boolean isEmpty() {


    if (libary_books.size() == 0 ) {
        return true;
    }
    else return false;

}

/*
 * Give the result as a string
 * of all te books in the library 
 */

//toString method
public String toString(){
    counter_index = 1;
    
    //return empty if nothing in the list
    if (libary_books.size() == 0 ) {
       return "The Library is EMPTY";
    }
    
    else {
        combined_books = "";
        
        //As long as counter is less than size of the list of library books
        while (counter_index < libary_books.size()){
            
            //we concatenate the list item in the string   
            combined_books = combined_books + "\n" + libary_books.get(counter_index) ;
            
            //increment twice because next one is for author
            counter_index += 2;       
        }
    
    return combined_books;
    }
}

/*
 * Add a book with a given author
 * and save it to memory
 * 
 */

// Add book with title and author in the list.

public void add(String title, String author) {
    libary_books.add(title);
    libary_books.add(title + " by " + author);
}


/*
 * Remove the book
 * by taking the user input
 * and returning string message
 */
public String remove(String book_title) {

    int curr_index;
    int next_index;

    curr_index = libary_books.indexOf(book_title);
    next_index = curr_index + 1;
    
    //check end of list
    if (curr_index == -1) {

        return "Book not found";  
    }
    
    else {
        libary_books.remove(next_index);
        libary_books.remove(curr_index);
       
        return "Book removed";

    }

}

/*
 * Find the given book
 * and return a result saying
 *  if its there or not
 */

public String findBook (String the_book_title){

    int this_index = libary_books.indexOf(the_book_title);
    return "The book exists and its  " + String.valueOf(this_index) ;

}

public Boolean bookExists (String the_book_title_1) {
    //checking if title of the book is in list
    if ( libary_books.indexOf(the_book_title_1) == -1)
    {
        return false;
    }
    else {
        return true;
    }
}

/*
 * Loan the book
 * and save the given dates/times loaned
 * 
 */
public void loanBook(String book_title) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter due date for the book being loaned in DD/MM/YYYY format");
    dueDate = scan.nextLine(); 
    timesLoaned ++; 
    System.out.println("Book Title: "+ book_title + " Due Date:  " + dueDate + " Number Of Times Loaned: " + timesLoaned); 

}

/*
 * Return the book
 * by resetting everything
 * 
 */
public void returnBook(String book_title_1) {
    dueDate = "Date Resetted: dd/mm/yyyy"; 
    timesLoaned --; 
    System.out.println("Book returned successfully"); 
    System.out.println("Book Title: "+ book_title_1+ " Due Date: " + dueDate + " Times Loaned: " + timesLoaned); 

}

}
