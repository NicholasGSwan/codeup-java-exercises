public class Person {
    //properties available
    private String name;
    //constructor for Person class
    public Person(String personName){
        name = personName;
    }

    //methods available for this class
    public String getName(){
     return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, "+ this.name + ", nice to see you!");
    }
    public static void main(String[] args){
        Person nick = new Person("Nicholas");
        System.out.println(nick.getName());
        nick.sayHello();
        nick.setName("Nucleus");
        nick.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}
