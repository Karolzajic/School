import java.util.List;
import java.util.Map;

public class Grades {
    int grade;


    public Grades(int grade) {
        if (grade <1 || grade > 5){
            throw new IllegalArgumentException( ":-( wrong, grade must be between 1 and 5.");
        }
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }


}
