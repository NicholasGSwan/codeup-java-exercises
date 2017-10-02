package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }


    public static void main(String[] args){
        Student nicholas = new Student("Nicholas");
        System.out.println(nicholas.getName());
        nicholas.addGrade(98);
        nicholas.addGrade(85);
        nicholas.addGrade(100);
        nicholas.addGrade(92);
        System.out.println(nicholas.getGradeAverage());
    }


    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);

    }
    public double getGradeAverage(){
        int gradeToBeAveraged = 0;
        for(int grade: grades){
           gradeToBeAveraged+=grade;
        }
        int average = gradeToBeAveraged/grades.size();
        return average;
    }
    public void displayAllGrades(){
        for(int grade: this.grades){
            System.out.print(grade+"\n");
        }
    }

}
