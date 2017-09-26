package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
    String userInput = scanner.nextLine();
    return userInput;
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        System.out.print("y/n");
        String yesOrNo = getString();
        return yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("y");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(){
        int userInput = scanner.nextInt();
        scanner.nextLine();
        return userInput;
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }



    public int getInt(int min, int max){
        int userIn;
        while (true) {
            System.out.println("Between " + min + " and " + max + ",");
            userIn = getInt();
            if (userIn > max|| userIn < min){
                System.out.println("Try again...");
            }else if(userIn <= max && userIn >= min){
                break;
            }else {
                System.out.println("not sure what happened...");
            }
        }
        return userIn;
    }
    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        return getInt(min, max);
    }

    public double getDouble(){
        double userInput = scanner.nextDouble();
        scanner.nextLine();
        return userInput;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max){
        double userIn;
        while (true) {
            System.out.print(" between " + min + " and " + max + ",");
            userIn = getDouble();
            if (userIn > max|| userIn < min){
                System.out.println("Try again...");
            }else if(userIn <= max && userIn >= min){
                break;
            }else {
                System.out.println("not sure what happened...");
            }
        }
        return userIn;
    }
    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

}
