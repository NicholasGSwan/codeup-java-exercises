package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
    System.out.println("Please enter:");
    String userInput = scanner.nextLine();
    return userInput;
    }

    public static boolean yesNo(){
        String yesOrNo = getString();
        if (yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("y")){
            return true;
        }else{
            return false;
        }
    }

    public static int getInt(){
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
        return userInput;
    }



    public static int getInt(int min, int max){
        int userIn;
        while (true) {
            System.out.println("Between " + min + " and " + max + ",");
            userIn = getInt();
            if (userIn > max|| userIn < min){
                System.out.println("Try again...");
            }else if(userIn <= max && userIn >= min){
                System.out.println("Awesome!");
                break;
            }else {
                System.out.println("not sure what happened...");
            }
        }
        return userIn;
    }

    public static double getDouble(){
        System.out.println("Enter a number:");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public static double getDouble(double min, double max){
        double userIn;
        while (true) {
            System.out.println("Between " + min + " and " + max + ",");
            userIn = getDouble();
            if (userIn > max|| userIn < min){
                System.out.println("Try again...");
            }else if(userIn <= max && userIn >= min){
                System.out.println("Awesome!");
                break;
            }else {
                System.out.println("not sure what happened...");
            }
        }
        return userIn;
    }

}
