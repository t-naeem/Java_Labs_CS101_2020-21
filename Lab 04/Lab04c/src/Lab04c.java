public class Lab04c {
    public static void main(String[] args){
        
        // Q: Can you predict what the following code will print out?
        // A: An infinite loop.
        //------------------------------------------------------------
        
        double d;
        d = 0.1;
        while ( d <= 1.0 )
        {
           System.out.println( d);
           d = d + 0.1;
        }
        System.out.println( d + " <- final value after loop!");    }
        
        //-------------------------------------------------------------
        // Q: Modify the condition such that it uses less-than instead of not-equal. What will happen if you run it now?
        // A: Program will give final answer which is 1.0999999999999999
        // Q: Can you explain why this happens? What is the moral of the story?
        // A: Because d is never equal to 1.000000000000000 and while loop will never reach the terminatory condition as 
        //    continuation contidition is alwaays satisfied. Moral of the story is that we should not preferabally use != 
        //    when dealing with doubles or floats becasue of the aforementioned reasoning
}
