/** @author <Temur Beraia> */
package homework6;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades){
        if(name == null || grades == null){
            throw new IllegalArgumentException("Name and/or grades cannot be null");
        }
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade(){
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

    public String getStatus(){
        if(averageGrade() >= 60){
            return "Pass";
        }else{
            return "Fail";
        }
    }
}
