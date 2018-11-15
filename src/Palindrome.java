import java.util.*;

/**
 * Write a description of class Palindrome here.
 * 
 * @author (Matthew LaFalce) 
 * @version (12-10-2015)
 */
public class Palindrome
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Palindrome
     */
    public static void main(String [] args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        String text;
        
        do {
            System.out.print("Enter text: ");
            text = input.nextLine();
            
            if (palindrome(text, 0, text.length() - 1)) {
                System.out.println("Palindrome!!");
            }
        } while (!text.equals("quit"));
        System.out.println("Bye");
    }

    static boolean palindrome(String t, int b, int e) {
    	e = t.length()-1;
    	if(t.length()==0 || t.length() == 1){
    		return true;
    	}
    	if(t.charAt(b) == t.charAt(e)){
    		return palindrome(t.substring(1,t.length()-1),0,e);
    	}
    	return false;
    }
}
