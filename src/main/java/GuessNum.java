import java.util.Random;
import java.util.Scanner;


class GuessNum{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice =0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.print("You have 5 chances to guess the correct number.");

        do{
            System.out.println("Please select the difficulty level:");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                        Easy();
                    break;
                case 2:
                        Meduim();
                    break;
                case 3:
                        Hard();
                    break;
                case 4:
                        System.out.println("Exiting the program.....");
                        break;
                default:
                        System.out.println("Invalid Input...");
                  
            }
        
        }
        while(choice != 4);

    }

    public static void Easy(){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

    
        int random = rn.nextInt(100) + 1;
        int guess =0;
        int attempts =0;
        System.out.println("Great! You have selected the Easy difficulty level");
        System.out.println("Let's Start the game!!");

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < random) {
                System.out.println("Incorrect! The number is greater than."+ guess);
            }else if (guess > random) {
                System.out.println("Incorrect! The number is less than " + guess);
            }
            else {
                System.out.println("Congrats! " + guess + " is the correct number. You guessed it in " + attempts + " attempts.");
                break;
            }
            if (attempts == 10) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + random + ".");
            }
           
        }
        System.out.println();
    }



    public static void Meduim(){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

    
        int random = rn.nextInt(100) + 1;
        int guess =0;
        int attempts =0;
        System.out.println("Great! You have selected the Easy difficulty level");
        System.out.println("Let's Start the game!!");

        while (attempts < 5) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < random) {
                System.out.println("Incorrect! The number is greater than."+ guess);
            }else if (guess > random) {
                System.out.println("Incorrect! The number is less than " + guess);
            }
            else {
                System.out.println("Congrats! " + guess + " is the correct number. You guessed it in " + attempts + " attempts.");
                break;
            }
            if (attempts == 5) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + random + ".");
            }
           
        }
        System.out.println();
    }

    public static void Hard(){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

    
        int random = rn.nextInt(100) + 1;
        int guess =0;
        int attempts =0;
        System.out.println("Great! You have selected the Easy difficulty level");
        System.out.println("Let's Start the game!!");

        while (attempts < 3) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < random) {
                System.out.println("Incorrect! The number is greater than."+ guess);
            }else if (guess > random) {
                System.out.println("Incorrect! The number is less than " + guess);
            }
            else {
                System.out.println("Congrats! " + guess + " is the correct number. You guessed it in " + attempts + " attempts.");
                break;
            }
            if (attempts == 3) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + random + ".");
            }
           
        }
        System.out.println();
    }
  }
 

