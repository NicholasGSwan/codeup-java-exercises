package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
    System.out.println("Please enter:");
    scanner.nextLine();
    String userInput = scanner.nextLine();
    return userInput;
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        String yesOrNo = getString();
        if (yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("y")){
            return true;
        }else{
            return false;
        }
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(){
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
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
                System.out.println("Awesome!");
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
        System.out.println("Enter a number:");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max){
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
    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

}
