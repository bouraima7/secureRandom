import java.util.*;

public class GuessTheNumber {

    //generates a random number between 1 an 10
    public void play(){
        //Math random to pick a number between 1 and 10
        int randomNumber = 1 + (int) (Math.random() * 10); //creates a random value between 1 and 10
        int numOfGuesses = 0;
        //askForGuess(randomNumber);
        numOfGuesses = askForGuess(randomNumber);
        System.out.println("Hey, you got the right number! It took you "+ numOfGuesses + " guesses to guess the correct number!");


    }

    private int askForGuess (int randomNumber){

        // This will ask the user to guess the random number
        //If the user guesses correctly, it will end and return how many times it took to guess
        Scanner input = new Scanner(System.in);

        int key = randomNumber;

        int guess; // this is what the user guessed the number is
        //System.out.println( "Guess what the random number is : ");
        //guess = input.nextInt();

        int nn=0; //counter
        boolean hit = false;
        while (hit == false){ //looping this until user guesses right number
            System.out.println("Guess a number (1-10): ");
            guess = input.nextInt();
            int count =1;
            if (guess == key ){
                // they got the right number
                // flag (boolean)
                System.out.println("You have guessed the right number! ");
                hit = true; //breaks the loop
            } else if (guess > key) {
                //too high
                System.out.println("The number you have guessed is too high. Try again");
                count++;
            }
            else {
                //too low
                System.out.println("The number you have guessed is too low. Try again");
                count++;
            }
            nn++;
        }





        return nn; // counter that is returning to indicate how many guesses it took to get the right number
    }

}
