public class Subject {
    private String name;
    private Teachers teacher;

    public Subject (String name, Teachers teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void add(Subject subject) {
    }


    public Object toList() {
        return null;
    }
}
