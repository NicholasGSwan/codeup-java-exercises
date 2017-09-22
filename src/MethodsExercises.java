import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
//        System.out.println(add(4, 7));
//        System.out.println(subtract(9, 6));
//        System.out.println(multiply(5, 6));
//        divide(8, 4);
//        divide(9, 0);
//        System.out.println(modulus(46, 9));
//        System.out.println(altMult(5, 6));
//        getInteger(3, 14);
        otherFactorial(getInteger(1, 20));
        getFactorial();
        rollTheDice();

    }
    public static int add(int x, int y){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x-y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
    public static void divide(int x, int y){
        if (y != 0) {
            System.out.println(x / y);
        }else{
            System.out.println("cannot divide by zero");
        }

    }
    public static int modulus(int x, int y){
       while(x > y){
           x -= y;
       }
       return x;
    }
    public static int altMult(int x, int y){

        if (y==1){
            return x;
        }

        return x + altMult(x, y-1);
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            int userInput = sc.nextInt();
            sc.nextLine();
            if(userInput<max && userInput>min){
                System.out.println("Thanks! The number you chose is "+userInput+".");
                return userInput;
            }else{
                System.out.println(userInput+" is not between "+min+" and "+max+". Try again!" );
            }
        }
    }
    public static void getFactorial(){
        Scanner sc = new Scanner(System.in);
        int userIn;
        long factorial = 1;

        while (true) {
            String factorialString = "";
            while (true) {

                System.out.println("Give a number between 1 and 20:");
                userIn = sc.nextInt();
                if (userIn >= 1&& userIn<=20) {
                    break;
                }
                System.out.println("FAILURE! Try again!");
            }
            String j = String.valueOf(userIn);
            factorialString += j+"! = ";
            for (int i = userIn; i >= 1; i--) {
                factorial *= i;
                String k = String.valueOf(i);
                factorialString += k+" x ";
            }
            factorialString = factorialString.substring(0, factorialString.length()-3);
            factorialString += " = "+String.valueOf(factorial);
            sc.nextLine();
            System.out.println("The factorial of " + userIn + " is " + factorial + ".\nThis looks like: "+factorialString+"\nWould you like to try another number?(y/n)");

                String letsGo = sc.nextLine();
//                letsGo = letsGo.substring(0, 1);
                if (letsGo.equalsIgnoreCase("y")) {
                    System.out.println("Cool, let's go again!");
                } else if (letsGo.equalsIgnoreCase("n")||letsGo.isEmpty()) {
                    break;
                }
        }

    }
    public static void rollTheDice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's roll some dice!");
        while(true) {
            System.out.println("How many sides on the first dice?");
            int usrIn1 = sc.nextInt();
            System.out.println("How many sides on the second dice?");
            int usrIn2 = sc.nextInt();
            int randomNumber1 = randNum(usrIn1);
            int randomNumber2 = randNum(usrIn2);
            System.out.println(randomNumber1);
            System.out.println(randomNumber2);
            sc.nextLine();
            System.out.println("Would you like to roll again? (y/n)");
            String yOrN = sc.nextLine();
            if (!yOrN.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
    public static int randNum(int n){
        return (int)Math.floor((Math.random()* n)+1);
    }
    public static void otherFactorial(int number){
        int acum = 1;
        for(int i = 1; i <= number; i++){
            String middleOfThing ="";
            for(int j = 1; j<=i; j++){
                middleOfThing += j +" x ";
            }
            middleOfThing = middleOfThing.substring(0, middleOfThing.length()-3);
            System.out.println(i+"! = "+ middleOfThing+" = "+ (acum*=i) );
        }
    }
}
