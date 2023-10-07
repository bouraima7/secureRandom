import java.util.*;

public class GuessTheNumberTest {

    public static void main (String [] args ){

        //Creates a GuessTheNumber object
        //Calls the play method
        //asks the user if they would like to keep playing
        Scanner input = new Scanner (System.in);
        GuessTheNumber g = new GuessTheNumber();
        System.out.println("Welcome to my random number guessing game!");
        System.out.println("Would you like to play? ('y' for yes, 'n' for no:" );
        String begin = input.next();
        if (begin.equals("y")){
            g.play();// 1st time user plays
            //after user plays, they are asked if they want to play again
            boolean again = false;
            while ( again == false){
                System.out.print("Would you like to play again? : ");
                String playAgain = input.next();
                if (playAgain.equals("y")){
                    g.play();
                }
                else {
                    again=true;
                }
            }



        }
        else {
            System.out.println("Thank you for visiting us! Have a nice day");
        }


    }
}
