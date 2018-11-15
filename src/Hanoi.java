import java.util.*;

/**
 * Write a description of class Towers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hanoi {

    /**
     * Constructor for objects of class Towers
     */
    public static void main(String [] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rings: ");
        int r = input.nextInt();

        move(r, 1, 2, 3);
    }

    /**
     * Make one disk move
     *
     * @param   r   The disk to be moved
     * @param   p1  The post to move it from
     * @param   p2  The post to move it to
     * @param   p1  The spare' post
     */
    public static void move(int r, int p1, int p2, int p3) {
    	if(r <= 0){
    		return;
    	}
	    	// move top rings from p1 to p3
	    	move(r-1, p1, p3, p2);
	    	
	    	//move the bottom ring from p1 to p2
	    	System.out.println("Move ring "+ r + " from post "+ p1 + " to post " + p2);
	    	
	    	// move the upper rings from p3 to p2
	    	move(r-1, p3, p2, p1);
    	
    }
}
