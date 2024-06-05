
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Igor Hnizdo");
        Teacher teacher2 = new Teacher("Jan Amos Komensky");
        Teacher teacher3 = new Teacher("Jakub Jahic");


        Subject programing = new Subject("Programing", teacher3);
        Subject history = new Subject("History", teacher1);
        Subject literature = new Subject("Literature", teacher2);


        Clazz clazz1 = new Clazz("3.B", teacher1);
        Clazz clazz2 = new Clazz("6.A", teacher2);

        Student student1 = new Student("Sebestova", clazz2);
        Student student2 = new Student("Mach", clazz2);
        Student student3 = new Student("Novák", clazz1);
        Student student4 = new Student("Sebková", clazz2);
        Student student5 = new Student("Smetana", clazz2);
        Student student6 = new Student("Beneš", clazz2);

        teacher3.teachSubject(literature);


        teacher2.teachSubject(literature);
        teacher3.teachSubject(programing);
        teacher1.teachSubject(history);


        List<Clazz> clazzes = List.of(clazz2, clazz1);
        List<Subject> subjects = List.of(literature, programing, history);
        List<Student> students = List.of(student5, student2, student3, student4, student1, student6);

        clazzes.forEach(clazz -> clazz.getStudents().forEach(student -> subjects.forEach(student::subjectRegistration)));

        if (students.stream().anyMatch(student -> student.getSubject().size() < 3)) {
            throw new RuntimeException(" Student has to have at least 3 subject in registration");
        }
        if (clazzes.stream().anyMatch(clazz -> clazz.getStudents().size() < 3)) {
            throw new RuntimeException("Class has to inlude at least 3 students");
        }

        Random randomGrades = new Random();
        clazzes.forEach(clazz -> clazz.getStudents().forEach(student -> subjects.forEach(subject -> student.setGrade(subject, new Grades(randomGrades.nextInt(6))))));
        

        public static void studentOverviewByAverageGrade(List<Student> students){
           List<String> studentOverviewBaG = students.stream()
                    .sorted(Comparator.comparingDouble(Student::averageGrade))
                    .map(student -> student.getName() + ": "
                            + String.format("%.1f", student.averageGrade())
                            + " (" + student.getGrades().stream()
                            .map(Grades::getGrade)
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")) + ")")
                    .toList();


            System.out.println("Owerview of student by thier average grade: ");


        }
    }
}