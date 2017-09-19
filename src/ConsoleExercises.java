import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        int userInput;
        String userInputA;
        String userInputB;
        String userInputC;
        String userInputD;
        Scanner sc = new Scanner(System.in);


        System.out.print("Give me an integer: ");
        userInput = sc.nextInt();
        System.out.println(userInput);
//        sc.nextLine();
        System.out.println("");
        //if you don't input an integer, it fails. InputMismatchException
        System.out.println("Give me 3 words: ");
        userInputA = sc.next();
//        System.out.println("Give me another word, please:");
        userInputB = sc.next();
//        System.out.println("And one final word, if you wouldn't mind: ");
        userInputC = sc.next();
        System.out.println(userInputA);
        System.out.println(userInputB);
        System.out.println(userInputC);
        String leftovers = sc.nextLine();
        System.out.println(leftovers);
        System.out.println("Give me a sentence: ");
        userInputD = sc.nextLine();
        System.out.println(userInputD);
        //calculating perimeter
        double area;
        double perimeter;
        double volume;
        String length;
        String width;
        String height;
        System.out.println("Give me the length of the room, please: ");
        length = sc.nextLine();
        System.out.println("Now give me the width: ");
        width = sc.nextLine();
        System.out.println("And finally, the height of the room: ");
        height= sc.nextLine();
        double heightDbl = Double.parseDouble(height);
        double lengthInt = Double.parseDouble(length);
        double widthInt = Double.parseDouble(width);
        area = lengthInt * widthInt;
        perimeter = 2 * lengthInt + 2 * widthInt;
        volume = heightDbl * lengthInt * widthInt;
        System.out.println("The area of the room is "+area+" and the perimeter is "+perimeter+". The volume is "+ volume +".");

    }
}
