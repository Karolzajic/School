import java.util.ArrayList;
import java.util.List;

public class Clazz {
    private String name;
    private Teacher primaryTeacher;
    private List<Student> students = new ArrayList<>();


    public Clazz(String name, Teacher primaryTeacher) {
        this.name = name;
        this.primaryTeacher = primaryTeacher;

    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        addStudent(student);
    }
}
