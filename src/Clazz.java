import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Clazz {
    private String name;
    private Teachers primaryTeacher;
    private List<Students> students = new ArrayList<>();


    public Clazz(String name, Teachers primaryTeacher) {
        this.name = name;
        this.primaryTeacher = primaryTeacher;

    }

    public String getName() {
        return name;
    }

    public Teachers getPrimaryTeacher() {
        return primaryTeacher;
    }

    public List<Students> getStudents() {
        return students;
    }
    public void addStudent(){
        addStudent();
    }
}
