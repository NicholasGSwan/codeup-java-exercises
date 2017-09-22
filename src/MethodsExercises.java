public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(add(4, 7));
        System.out.println(subtract(9, 6));
        System.out.println(multiply(5, 6));
        divide(8, 4);
        divide(9, 0);
        System.out.println(modulus(46, 9));
        System.out.println(altMult(5, 6));


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
}
