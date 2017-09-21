import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userInput;
        String BobQuestionResponse = "Sure";
        String BobYellResponse = "Whoa, chill out!";
        String BobIgnoreResponse = "Fine, Be that way!";
        String BobAnythingElse = "Whatever.";

        while (true){
            System.out.println("Bob looks in your direction, but you're pretty sure he's not really looking at you.\n What do you say?");
            userInput = sc.nextLine();
            if (userInput.endsWith("?")){
                System.out.println(BobQuestionResponse);
            }else if (userInput.equals("") || userInput.startsWith(" ")&&userInput.endsWith(" ")){
                System.out.println(BobIgnoreResponse);
            }else
                if(userInput.endsWith("!")|| userInput.equals(userInput.toUpperCase())&& !userInput.isEmpty()){
                System.out.println(BobYellResponse);
            }else  {
                System.out.println(BobAnythingElse);
            }
            System.out.println("If you would like to leave, type \"leave\" or \"quit\".");
            if(userInput.equalsIgnoreCase("leave")||userInput.equalsIgnoreCase("quit")) {
                break;
            }
            }
        }
    }
