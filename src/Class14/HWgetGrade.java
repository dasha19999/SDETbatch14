package Class14;

public class HWgetGrade {
    char getGrade (int score){
        char grade;
        if(score>90) {
            grade = 'A';
        }else if (score>80) {
            grade = 'B';
        } else if (score>70) {
            grade = 'C';
        }else if (score>50) {
            grade = 'D';
        }else {
            grade='F';

        }
        return grade;

    }

    public static void main(String[] args) {
        HWgetGrade task5=new HWgetGrade();
        System.out.println(task5.getGrade(81));
    }
}
