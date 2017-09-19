import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner userInput;
        userInput = new Scanner(System.in);
        int i = 5;
        int countByTwos = 100;
        long squaringTwo = 2;
        while(i <= 15){
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(countByTwos);
            System.out.println("");
            countByTwos -= 5;

        }while(countByTwos>=-10);
        do{
            System.out.println(squaringTwo);
            squaringTwo *= squaringTwo;
        }while(squaringTwo<100000);
        for (int j = 5; j <= 15; j++)System.out.println(j);
        for (int j = 0; j <= 100; j+=2) {
            System.out.println(j);
            System.out.println();
        }
        for (int j = 100; j >= -10; j -= 5)System.out.println(j);
        for (long j = 2; j < 100000; j *= j )System.out.println(j);
        for (int j = 1; j<100; j++){
            if(j%3 ==0 & j%5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }else if (j%3 == 0){
                System.out.println("Fizz");
                continue;
            }else if(j%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(j);
        }
        System.out.println("What number would you like to go up to?");
        int userInputInt = userInput.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed \n------ | ------- | -----");
        String tableFormat = "%-7d|%-9d|%-7d%n";
        int k = 1;


        while (true) {
            while (k <= userInputInt){
                System.out.format(tableFormat, k, k*k, k*k*k);
                k++;
            }
            userInput.nextLine();
            System.out.println("Would you like to continue? (y/n)");
            String yesOrNo = userInput.nextLine();
            if (yesOrNo.equals("y")) {
                System.out.format(tableFormat, k, k*k, k*k*k);
                k++;
            }else {
                break;
            }
        }

        while (true) {
            System.out.println("What is your numerical grade?");
            int usersGrade = userInput.nextInt();
            String usersLetterGrade;
            if(usersGrade < 60){
                usersLetterGrade = "F";
            }else if(usersGrade < 67) {
                usersLetterGrade = "D";
            }else if(usersGrade < 80) {
                usersLetterGrade = "C";
            }else if(usersGrade < 88) {
                usersLetterGrade = "B";
            }else  {
                usersLetterGrade = "A";
            }
            System.out.println("Your grade in that class was: " + usersLetterGrade);
            userInput.nextLine();
            System.out.println("Would you like to enter another grade? (y/n)");
            String yesOrNo = userInput.nextLine();
            if (yesOrNo.equals("n")) {
                break;
            }
        }

    }
}
