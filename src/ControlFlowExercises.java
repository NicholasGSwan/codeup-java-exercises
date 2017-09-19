public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        int countByTwos = 100;
        long squaringTwo = 2;
        int squarer;
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

    }
}
