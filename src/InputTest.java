import util.Input;



public class InputTest {
    public static void main(String[] args){
        Input inputTest = new Input();
        String userInput;
        boolean userBool;
        int userInt;
        double userDoub;
        userInput= inputTest.getString("Enter a Sentence");
        System.out.println(userInput);

        userBool = inputTest.yesNo();
        System.out.println(userBool);

        userInt = inputTest.getInt("Enter a Number");
        System.out.println(userInt);

        userInt = inputTest.getInt(1, 20, "Enter a Number");
        System.out.println(userInt);

        userDoub = inputTest.getDouble("Enter a Number");
        System.out.println(userDoub);

        userDoub = inputTest.getDouble(3, 90, "Enter a Number");
        System.out.println(userDoub);

        userInput = inputTest.getString("Enter a sentence.");
        System.out.println(userInput);

    }
}
