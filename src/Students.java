import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Students {
    private final String name;
    private  final Clazz clazz;



    private Map<Subject, List<Grades>> grades = new HashMap<>();


    public Students(String name, Clazz clazz) {
        this.name = name;
        this.clazz = clazz;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public Map<Subject, List<Grades>> getGrades() {
        return grades;
    }

    public void scheduleOfSubject(Subject subject){
        grades.put(subject,new ArrayList<>());
    }

    public List<Subject> getSubject(){
        return grades.keySet().stream().toList();
    }
    public double getAverageGrade(){
        return grades.values().stream().flatMap(List::stream).mapToDouble(Grades::getGrade).average().orElse(0.0);

    }
    public double getAverageGradeForSubject(Subject subject){
        List<Grades> gradeList = grades.get(subject);

        double sumGrades = gradeList.stream().mapToDouble(Grades::getGrade).sum();

        return sumGrades/gradeList.size();
    }
    public void setGrades(Map<Subject, List<Grades>> grades) {
        this.grades = grades;
    }

}
