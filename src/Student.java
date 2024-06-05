
import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private final String name;
    private  final Clazz clazz;
    private final Map<Subject, List<Grades>> grades = new HashMap<>();

    public Student(String name, Clazz clazz) {
        this.name = name;
        this.clazz = clazz;
        clazz.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void subjectRegistration(Subject subject){
        
       grades.put(subject,new ArrayList<>());
    }
    public List<Subject>getSubject(){
        return grades.entrySet().stream().map(entry-> entry.getKey()).toList();
    }
    public void setGrade (Subject subject, Grades grade){
        if (!grades.containsKey(subject)){
            throw new IllegalArgumentException("Student doesn´t registred this subject");
        }
        grades.get(subject).add(grade);
    }
    public List<Grades> getGrades(){
        return grades.values().stream().flatMap(List::stream).toList();
    }
    public double averageGrade(){
        return grades.values().stream()
                .flatMap(List::stream)
                .mapToDouble(grade-> grade.getGrade()).average().orElse(0.0);
    }

    public double averageGradeforSubject(Subject subject){ List<Grades> gradeList = grades.get(subject);

        double sum = gradeList.stream().mapToInt(grade->grade.getGrade()).sum();
        return sum / gradeList.size();

    }


    }



