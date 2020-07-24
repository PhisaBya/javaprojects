/*
 * Author: Phisa Bya
 * Version: 9/21/17
 * Description: Rock, Paper, Scissor game
 */
import java.util.*; 
public class RockPaperScissor {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Lets play Rock, Paper, Scissor ");
	System.out.println("Choice your move: "); 
	System.out.println("1. Rock ");
	System.out.println("2. Paper ");
	System.out.println("3. Scissor ");
	int choice = input.nextInt();
	int computer = (int)(Math.random()*3 - 1 + 1) + 1; // find random number from 1-3
	// display user choice and computer choice
	if (choice == 1 && computer == 1 ){
		System.out.print("You chose rock. The computer chose rock. It's a draw. ");
	}
	else if (choice == 1 && computer == 2){
		System.out.print("You chose rock. The computer chose paper. You lost :(");
	}
	else if (choice == 1 && computer == 3){
		System.out.print("You chose rock. The computer chose scissor. You win :) " );
	}
	else if (choice == 2 && computer == 1){
		System.out.print("You chose paper. The computer chose rock. You win :) " );
	}
	else if (choice == 2 && computer == 2 ){
		System.out.print("You chose paper. The computer chose paper. It's a draw. ");
	}
	else if (choice == 2 && computer == 3){
		System.out.print("You chose paper. The computer chose scissor. You lost :( ");
	}
	else if (choice == 3 && computer == 1){
		System.out.print("You chose scissor. The computer chose rock . You lost :(" );
	}
	else if (choice == 3 && computer == 2){
		System.out.print("You chose scissor. The computer chose paper. You win :)");
	}
	else if (choice == 3 && computer == 3){
		System.out.print("You chose scissor. The computer chose scissor. It's a draw.");
	}
	}
	}

