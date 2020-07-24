/*
 * Author: Phisa Bya
 * Version: 9/23/17
 * Description: This program is a console that has 4 games for the user to choose
 */
import java.util.*;
public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create scanner
		System.out.println("Choose which game you would like to play: "); // display menu for users
		System.out.println("1. Rock Paper Scissor ");
		System.out.println("2. Guessing game ");
		System.out.println("3. Calculator game ");
		System.out.println("4. Guess birthday ");
		int gameChoice = input.nextInt(); // get game input
		
		if (gameChoice == 1){ // if statement for game #1
			System.out.println("Lets play Rock, Paper, Scissor ");
			System.out.println("Choice your move: "); 
			System.out.println("1. Rock ");
			System.out.println("2. Paper ");
			System.out.println("3. Scissor ");
			int choice = input.nextInt(); // get user move
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
			else {
				System.out.print("Your input is invalid ");
			}
		}
		else if (gameChoice == 2){ // if statement for game #2
			System.out.println("Choose a number from 1-10 ");
			int num = input.nextInt(); // get user input from 1-10
			int numGuess = (int)((Math.random()* 10)+1);
			if (num == numGuess){
				System.out.println("You chose: " + num);
				System.out.println("The computer chose: " + numGuess);
				System.out.println("You won the game!!! " );
			}
			else if (num != numGuess){
				System.out.println("You chose: " + num);
				System.out.println("The computer chose: " + numGuess);
				System.out.println("You lost the game!!! " );
			}
		}
		else if (gameChoice == 3){ // if statement for game #3
			System.out.println("Welcome to the Calculator Game!! "); // display menu
			System.out.println("Enter your first number: ");
			int num1 = input.nextInt(); // get user input for first number
			System.out.println("Enter your second number: ");
			int num2 = input.nextInt(); // get user input for second number
			System.out.println("Would you like to: "); // display choices for user
			System.out.println("1. Add ");
			System.out.println("2. Subtract ");
			System.out.println("3. Multiply ");
			System.out.println("4. Divide ");
			System.out.println("5. Remainder or Modulus ");
			int option = input.nextInt(); // get user option
			if (option == 1){ 
				int add = num1 + num2;
				System.out.print(num1 + " + " + num2 + " = " + add);		
			}
			else if (option == 2){
				int subtract = num1 - num2;
				System.out.print(num1 + " - " + num2 + " = " + subtract);
			}
			else if (option == 3){
				int multiply = num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + multiply);
			}
			else if (option == 4){
				double divide = ((double)(num1))/(num2);
				System.out.print(num1 + " / " + num2 + " = " + divide);
			}
			else if (option == 5){
				int remainder = (num1)%(num2);
				System.out.print(num1 + " % " + num2 + " = " + remainder);
			}
			else {
				System.out.println("Invalid input "); // display invalid input
			}
			
		}
		else if (gameChoice == 4){ // if statement for choice #4
			String set1 =
					 " 1 3 5 7\n" +
					 " 9 11 13 15\n" +
					 "17 19 21 23\n" +
					  "25 27 29 31";

					 String set2 =
					" 2 3 6 7\n" +
					"10 11 14 15\n" +
					"18 19 22 23\n" +
					 "26 27 30 31";

					String set3 =
					" 4 5 6 7\n" +
					"12 13 14 15\n" +
					"20 21 22 23\n" +
					"28 29 30 31";

					String set4 =
					" 8 9 10 11\n" +
					"12 13 14 15\n" +
					"24 25 26 27\n" +
					"28 29 30 31";

					 String set5 =
					 "16 17 18 19\n" +
					 "20 21 22 23\n" +
					 "24 25 26 27\n" +
					 "28 29 30 31";

					 int day = 0;

					 // Prompt the user to answer questions
					 System.out.print("Is your birthday in Set1?\n");
					 System.out.print(set1);
					 System.out.print("\nEnter 0 for No and 1 for Yes: ");
					 int answer = input.nextInt();

					 if (answer == 1)
					 day += 1;

					 // Prompt the user to answer questions
					 System.out.print("\nIs your birthday in Set2?\n");
					 System.out.print(set2);
					 System.out.print("\nEnter 0 for No and 1 for Yes: ");
					 answer = input.nextInt();

					 if (answer == 1)
					 day += 2;

					 // Prompt the user to answer questions
					 System.out.print("Is your birthday in Set3?\n");
					 System.out.print(set3);
					 System.out.print("\nEnter 0 for No and 1 for Yes: ");
					 answer = input.nextInt();

					 if (answer == 1)
					 day += 4;

					 // Prompt the user to answer questions
					 System.out.print("\nIs your birthday in Set4?\n");
					 System.out.print(set4);
					 System.out.print("\nEnter 0 for No and 1 for Yes: ");
					 answer = input.nextInt();

					if (answer == 1)
					 day += 8;

					 // Prompt the user to answer questions
					 System.out.print("\nIs your birthday in Set5?\n");
					 System.out.print(set5);
					 System.out.print("\nEnter 0 for No and 1 for Yes: ");
					 answer = input.nextInt();

					 if (answer == 1)
					 day += 16;

					 System.out.println("\nYour birthday is " + day + "!");
		}
		else {
			System.out.println("Input is invalid "); // display input is invalid
		}

	}

}
