/*

A number-guessing game.

*/

import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int myNum = rand.nextInt(100) + 1;
    int count = 0;

    System.out.println("Hey, whats your name?");
    System.out.print("(type in your name)");
    String name = input.next();
    System.out.printf("%s, I'm thinking of a number between 1 and 100\n", name);
    System.out.println("Try to guess my number");
    System.out.print("Your guess? ");
    int guess = input.nextInt();

    while (guess != myNum){
      if (guess > myNum){
        System.out.println("Your guess is too high, try again");
        System.out.printf("Your guess ");
        guess = input.nextInt();
      } else {
        System.out.println("Your guess is too low, try again");
        System.out.printf("Your guess ");
        guess = input.nextInt();
      }
      count ++;
    }
    System.out.printf("You figured it out you guessed %d in %d tries", myNum, count);
  }
}
