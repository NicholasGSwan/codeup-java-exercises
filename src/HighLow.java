import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randNumInt = randNum(100);
        int userGuess = -1;
        int numOfGuesses= 0;
        int maxGuesses = 10;
        System.out.println("Guess the number between 1 and 100.");
        while(numOfGuesses<maxGuesses&&userGuess!=randNumInt) {
            System.out.println("Number of guesses so far: "+numOfGuesses+"\n"+(maxGuesses-numOfGuesses)+" guesses left.");
            userGuess = sc.nextInt();

            if(userGuess<1||userGuess>100){
                System.out.println("Err, that's not quite right, try again:");
            }else if(userGuess>randNumInt){
                System.out.println("LOWER");
                numOfGuesses+=1;
            }else if (userGuess<randNumInt){
                System.out.println("HIGHER");
                numOfGuesses +=1;
            }
        }
        if(numOfGuesses==maxGuesses){System.out.println("You're out of guesses!");
        }else{
            System.out.println( "GOOD GUESS!");
        }


    }
    public static int randNum(int n){
        return (int)Math.floor((Math.random()* n)+1);
    }

}
