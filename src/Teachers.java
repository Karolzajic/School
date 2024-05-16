import java.util.List;
import java.util.ArrayList;
public class Teachers {
    private String name;


    public Teachers(String name) {
        this.name = name;

    }



    public void TeachSubject (Subject subject){
        subject.add(subject);
    }
}