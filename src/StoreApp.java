import java.util.Scanner;
public class StoreApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double itemTotalPrice;
    System.out.println("Welcome to the Swan Shop!");
    while (true) {
        System.out.println("1) Sale\n2) Print receipt\n3) Exit");
        int optionSelect = sc.nextInt();
        switch (optionSelect){
            case 1: System.out.println("Item?:");
                String itemName = sc.nextLine();
                System.out.println("How many?:");
                int itemQuantity = sc.nextInt();
                System.out.println("Price?:");
                double itemPrice = sc.nextDouble();
//                double itemTotalPrice = itemsTotal(itemPrice, itemQuantity);
//            case 2: receipt();
            case 3: exitMethod();
        }
    }
    }
    public static void sale(){
        Scanner sc = new Scanner(System.in);


    }
    public static double itemsTotal(double price, int quantity){
        double subtotalBeforeRound = price*quantity;
        double roundTotal = (double) Math.round(subtotalBeforeRound * 100)/100;
        return roundTotal;
    }
//    public static String receipt(){
//
//    }
    public static void exitMethod(){
        System.out.println("See you later!");
        System.exit(0);
    }
}
