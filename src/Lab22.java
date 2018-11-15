import java.util.*;

/**
 * Implement Euclids algorithm recursively. For flow control use the if-statement only.
 *Euclids algorithm to calculate the greatest common divisor of two positive integer 
 *numbers a and b (gcd(a,b)) is recursively defined as:
 *gcd(a,b) := a if a = b
 *gcd(a,b) := gcd(a - b, b) if a > b
 *gcd(a,b) := gcd(a, b - a) if b > a
 * @author (Matthew LaFalce) 
 * @version (12-10-2015)
 */
public class Lab22 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int one = 0;
		int two = 0;
		
			System.out.print("Enter first positive integer: ");
			one = input.nextInt();
			System.out.print("Enter second positive integer: ");
			two = (int)input.nextInt();
			
		if((one >= 0) && (two >= 0)){
				System.out.println("The greatest common divisor is: " + gcd(one,two));
		}	
			
		System.out.println("Bye Bye Now :)");
		
		
		
	}
	 public static int gcd(int a, int b){
		if(a == b){
			return a;
		}
		if(a > b){
			return gcd(a-b,b);
		}
		if(a < b){
			return gcd(a,b-a);
		}
		return 0;
	}
		
	

}
