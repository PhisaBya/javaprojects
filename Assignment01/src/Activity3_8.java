/* 
 * @author: Phisa Bya
 * @version: 9/26/17 
 * @description: this program determines if the random number is in the range of the user input
 */
import java.util.*;
public class Activity3_8 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int randomx = (int)((Math.random()*10 +10 + 1 )-10);
	int randomy = (int)((Math.random()*10 +10 + 1)-10);
	
	
	System.out.println("Enter the range for x (enter two numbers): ");
	double x1 = input.nextDouble();
	double x2 = input.nextDouble();
	System.out.println("Enter the range for y (enter two numbers): ");
	double y1 = input.nextDouble();
	double y2 = input.nextDouble();
	if ( randomx < x1 || randomx > x2 || randomy < y1 || randomy > y2){
		System.out.println("Point " + "(" + randomx + "," + randomy + ")" + " is not inside the rectangle");
	}
		else {
		
			System.out.println("Point " + "(" + randomx + "," + randomy + ")" + " is inside the rectangle");
	}
}
}
