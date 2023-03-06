import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        Random die1 = new Random();
        Random die2 = new Random();

        while (true) {

            int roll1 = die1.nextInt(6) + 1;
            int roll2 = die2.nextInt(6) + 1;
            int crapsRoll = roll1 + roll2;


            System.out.println("Welcome to Craps! Lets test your luck! Press 'Enter' to Continue");

            enter.nextLine();

            System.out.println("Your first roll is: " + roll1 + " Press enter to see the next roll.");
            enter.nextLine();

            System.out.println("Your second roll is: " + roll2);


            System.out.println("You got a " + crapsRoll + " for your first group!");

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Too bad, you rolled " + crapsRoll + " which is a losing number. Please try again.");
                enter.nextLine();

            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You're a natural! You win! You rolled a " + crapsRoll);
                enter.nextLine();

            } else {
                int point = crapsRoll;

                boolean cont = true;

                while (cont) {
                    System.out.println("POINT! Try to roll it again! Press Enter");
                    roll1 = die1.nextInt(6) + 1;
                    roll2 = die2.nextInt(6) + 1;
                    crapsRoll = roll1 + roll2;

                    enter.nextLine();

                    System.out.println("Your first roll is: " + roll1 + " Press enter to see the next roll.");
                    enter.nextLine();

                    System.out.println("Your second roll is: " + roll2);


                    System.out.println("You got a " + crapsRoll + " for your second group!");

                    if (crapsRoll == point) {
                        System.out.println("You rolled point, you WIN!");
                        cont = false;
                    } else if (crapsRoll == 7) {

                        System.out.println("You rolled a 7. GAME OVER");
                        cont = false;
                    }
                }
                System.out.println("Good Game!");
            }

        }

    }
}

