import util.Input;
public class ServerNameGenerator {

   public String[] adjectivesArray = {"loyal", "trustworthy", "tall", "short", "strapping", "handsome", "quick", "chivalrous", "rude", "courteous"};
   public String[] nounsArray = {"book", "owl", "guitar", "keyboard", "refrigerator", "taco", "car", "vampire", "piggy", "slippers"};

    public int randNum(int max, int min){
        return (int)Math.floor((Math.random()* max)+ min);
    }
    public int randNum(int max){
        return randNum(max, 0);
    }

   public String getRandomArrayElement(String[] array){
       return array[randNum(array.length)];
   }
   public static void main(String[] args){
       Input input = new Input();
       do{
       ServerNameGenerator server = new ServerNameGenerator();
       String randomName = server.getRandomArrayElement(server.adjectivesArray)+"-"+server.getRandomArrayElement(server.nounsArray);
       System.out.println(randomName);}while(input.yesNo("Again?"));
   }

}


