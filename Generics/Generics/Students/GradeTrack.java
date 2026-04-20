package Generics.Students;

import java.util.HashMap;
import java.util.Map;

public class GradeTrack {
    public static void main(String[] args) {
        Map<String, Double> m=new HashMap<>();
        m.put("ABC",89.2);
        m.put("XYZ",82.3);
        m.put("Ritik",77.8);
        m.put("Saurab",94.3);
        m.put("Harsh",73.3);
        System.out.println("List of students:"+m);
        m.put("Harsh",88.9);
        System.out.println("Harsh new Grade value: "+ m.get("Harsh"));
        m.remove("XYZ");
        m.remove("Ritik");
        System.out.println("List of student after removing student with grade value less then 85%: \n"+m);
    }
}