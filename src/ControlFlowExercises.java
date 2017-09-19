public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        int countByTwos = 0;
        while(i <= 15){
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(countByTwos);
            System.out.println("");
            countByTwos += 2;

        }while(countByTwos<100);
    }
}
