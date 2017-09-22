import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randNumInt = randNum(100);
        int userGuess;
        System.out.println("Guess the number between 1 and 100.");
        while(true) {
            userGuess = sc.nextInt();
            if(userGuess<1||userGuess>100){
                System.out.println("Err, that's not quite right, try again:");
            }else if(userGuess>randNumInt){
                System.out.println("LOWER");
            }else if (userGuess<randNumInt){
                System.out.println("HIGHER");
            }else if (userGuess==randNumInt){
               break;
            }else{
                System.out.println("Uh, that's weird...");
            }
        }
        System.out.println("GOOD GUESS!");

    }
    public static int randNum(int n){
        return (int)Math.floor((Math.random()* n)+1);
    }

}
