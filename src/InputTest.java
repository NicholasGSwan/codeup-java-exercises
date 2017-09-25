import util.Input;



public class InputTest {
    public static void main(String[] args){
        String userInput;
        boolean userBool;
        int userInt;
        double userDoub;
        userInput= Input.getString();
        System.out.println(userInput);

        userBool = Input.yesNo();
        System.out.println(userBool);

        userInt = Input.getInt();
        System.out.println(userInt);

        userInt = Input.getInt(1, 20);
        System.out.println(userInt);

        userDoub = Input.getDouble();
        System.out.println(userDoub);

        userDoub = Input.getDouble(3, 90);
        System.out.println(userDoub);

    }
}
