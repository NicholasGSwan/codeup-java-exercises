package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args){
        ArrayList<String> options = new ArrayList<>();
        options.add("1. Print csv Report");
        options.add("2. View Overall Class Average");
        options.add("3. Return to main menu");
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
            String userIn = input.getString("Which one would you like to know more about?\n Type \"ALL\" to display information for all users.\n Type \"OPTIONS\" for other options.");
            if(userIn.equalsIgnoreCase("all")) {
                getAllStudentInfo(students);
                break;
            }else if(userIn.equalsIgnoreCase("options")){
                printOptions(options);
                int userIn2 = input.getInt("Which option?(input number)");
                switch(userIn2){
                    case 1: printCsvFormat(students);
                    break;
                    case 2: System.out.println("The class average is: "+getAllStudentsAverage(students));
                    break;
                    case 3: break;
                    default: System.out.println("That wasn't an option...");
                }
                break;
            }else if (students.get(userIn) == null) {
                System.out.println("not a valid input, try again...");
            } else {
                getStudentInfo(students.get(userIn));
                break;
            }
        }
        if(!input.yesNo("Would you like to try another student?\n")){
            System.out.println("Ok, goodbye!");
            break;
        }

    }

    }
    public static void getStudentInfo(Student student){
        System.out.println("Name: "+ student.getName()+"\nTheir grades are:\n");
        student.displayAllGrades();
        System.out.println("Average: "+student.getGradeAverage());

        System.out.println("\n\n");
    }
    public static void getAllStudentInfo(HashMap<String, Student> students){
        for(Student student:students.values()){
            getStudentInfo(student);
        }
        System.out.println("The class average is: "+ getAllStudentsAverage(students));
    }
    public static double getAllStudentsAverage(HashMap<String, Student> students){
        int iterator = 0;
        double gradeAveragesToAverage = 0;
        for (Student student:students.values() ){
            iterator++;
            gradeAveragesToAverage += (student.getGradeAverage());
        }
        return gradeAveragesToAverage/iterator;
    }
    public static void printOptions(ArrayList<String> options){
        for(String option: options){
            System.out.println(option);
        }
    }
    public static void printCsvFormat(HashMap<String, Student> students){
        System.out.println("name, github_username, average");
        for(String studentUserName: students.keySet()){
            System.out.println(students.get(studentUserName).getName()+", "+studentUserName+", "+students.get(studentUserName).getGradeAverage());
        }
    }
}
