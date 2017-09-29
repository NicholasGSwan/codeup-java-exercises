package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args){
        Input input = new Input();
        HashMap<String, Student> students= new HashMap<>();
        Student nicholas = new Student("Nicholas Swan");
        Student tomas = new Student ("Tomas Hipolito");
        Student jordan = new Student ("Jordan Leslie");
        Student terrell = new Student ("Terrell");
        nicholas.addGrade(78);
        nicholas.addGrade(87);
        nicholas.addGrade(92);
        nicholas.addGrade(100);
        tomas.addGrade(80);
        tomas.addGrade(95);
        tomas.addGrade(97);
        tomas.addGrade(98);
        jordan.addGrade(90);
        jordan.addGrade(97);
        jordan.addGrade(98);
        jordan.addGrade(100);
        terrell.addGrade(95);
        terrell.addGrade(91);
        terrell.addGrade(98);
        terrell.addGrade(75);
        students.put("TerrellSanchez", terrell);
        students.put("Ugly_gray_duck", nicholas);
        students.put("JLsrsbzns", jordan);
        students.put("TomasTheHipo", tomas);

    while(true) {
        System.out.println("Here are all the users:");
        for (String usernames : students.keySet()) {
            System.out.println(usernames);
        }
        while (true) {
            String userIn = input.getString("Which one would you like to know more about?\nOr type \"ALL\" to display information for all users.");
            if(userIn.equalsIgnoreCase("all")) {
                getAllStudentInfo(students);
                break;
            }else if (students.get(userIn) == null) {
                System.out.println("not a valid input, try again...");
            } else {
                getStudentInfo(students.get(userIn));
                break;
            }
        }
        if(!input.yesNo("Would you like to continue?\n")){
            System.out.println("Ok, goodbye!");
            break;
        }

    }

    }
    public static void getStudentInfo(Student student){
        System.out.println("Name: "+ student.getName()+"\nTheir grades are:\n");
        student.displayAllGrades();
        student.getGradeAverage();
        System.out.println("\n\n");
    }
    public static void getAllStudentInfo(HashMap<String, Student> students){
        for(Student student:students.values()){
            getStudentInfo(student);
        }
    }
}
