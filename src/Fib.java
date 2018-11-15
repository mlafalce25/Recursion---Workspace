import java.util.*;

/**
 * Write a description of class Fib here.
 *
 * @author (Matt LaFalce)
 * @version (12-8-2015)
 */
public class Fib {
    private int x;

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int f, s, m;
        do {
            System.out.print("Enter first two terms and the maximum: ");

            f = input.nextInt();
            s = input.nextInt();
            m = input.nextInt();

            System.out.print(f + " ");
            fib(f, s, m);
            System.out.println();
        } while (m != 0);
        System.out.println("Good bye");
    }

    /**
     * Print the next term in a Fibonacci sequence
     *
     * @param   f   First term in the sequence
     * @param   n   Next term in the sequence
     * @param   m   Maximum value in the sequence
     */
    public static void fib(int i, int j, int max)
    {
		System.out.print(j + " ");
		if(j+i > max){ 
			return;
		}
		fib(j, j+i , 100);
    }
}
