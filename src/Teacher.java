
import java.util.List;
import java.util.ArrayList;
public class Teacher {
    private String name;
    private final List<Subject> subjects = new ArrayList<>();


    public Teacher(String name) {
        this.name = name;

    }
    public void teachSubject(Subject subject){
     subjects.add(subject);
    }


}