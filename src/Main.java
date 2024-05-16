import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Teachers teacher1 =  new Teachers("Igor Hnizdo");
        Teachers teacher2 = new Teachers("Jan Amos Komensky");
        Teachers teacher3 = new Teachers("Jakub Jahic");

        Subject programing = new Subject("Programing",teacher3);
        Subject history = new Subject("History", teacher1);
        Subject literature = new Subject("Literature", teacher2);

        Clazz clazz1 = new Clazz("3.B",teacher1);
        Clazz clazz2 = new Clazz("6.A", teacher2);

        Students student1 = new Students("Sebestova",clazz2);
        Students student2 = new Students("Mach",clazz2);
        Students student3 = new Students("Novák",clazz1);
        Students student4 = new Students("Sebková", clazz2);
        Students student5 = new Students("Smetana", clazz2);
        Students student6= new Students("Beneš", clazz2);



        teacher1.TeachSubject(history);
        teacher2.TeachSubject(literature);
        teacher3.TeachSubject(programing);

        List<Clazz> clazzes = List.of(clazz2,clazz1);
        List<Subject> subjects = List.of(literature,programing,history);
        List<Students> students= List.of(student5,student2,student3,student4,student1,student6);

        clazzes.forEach(clazz -> clazz.getStudents().forEach(students ->subjects.forEach(subject -> students.scheduleOfSubject())));

       Random randomGrades = new Random();
       clazzes.forEach(clazz -> clazz.getStudents().forEach(students->subjects.forEach(subject -> students.setGrades(subject, new Grades(randomGrades.nextInt(5git push -u origin main
       ))))));














    }
}