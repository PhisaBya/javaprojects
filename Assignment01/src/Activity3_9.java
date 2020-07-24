/* 
 * @author: Phisa Bya
 * @version: 9/26/17 
 * @description: this program determines if the fractions are improper or proper
 */
import java.util.*;
public class Activity3_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a numerator: ");
		int numer = input.nextInt();
		System.out.println("Enter a denominator: ");
		int denom = input.nextInt();
		int imFunction = numer/denom;
		if (numer < denom){
			System.out.println(numer + "/" + denom + " is a proper function" );
		}
		else if ((numer >= denom) & (numer % denom == 0)){
	       int impFrac = numer / denom;
	        System.out.print(numer);
	        System.out.print("/"+denom);
	        System.out.print(" is an improper fraction, and can be reduced to "+impFrac);
	        System.out.println(".");
	    }
	    else if (numer > denom){
	       int impFrac = numer / denom;
	       int mixFrac = numer % denom;
	        System.out.print(numer);
	        System.out.print("/"+denom);
	        System.out.print(" is an improper fraction, and its mixed fraction is "+impFrac);
	        System.out.print("+"+mixFrac);
	        System.out.print("/"+denom);
	        System.out.println(".");
	    }
	
	    }
		

}
