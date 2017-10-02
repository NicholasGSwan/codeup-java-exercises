package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
        attendance = new HashMap<>();
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
    public void recordAttendance(String date, String presentOrAbsent){
        attendance.put(date, presentOrAbsent);
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
    public double attendancePercent(){
        double numberOfDays = 0;
        double numberOfPs = 0;
        for(String pOrA: attendance.values()) {
            numberOfDays++;
            if (pOrA.equalsIgnoreCase("p")) {
                numberOfPs++;
            }
        }
        return (numberOfPs/numberOfDays)*100;
    }
    public void whenTheyWereAbsent(){
        for(String dates: attendance.keySet()){
            if(attendance.get(dates).equalsIgnoreCase("a")){
                System.out.println(dates);
            }
        }
    }

}
