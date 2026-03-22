package Five;

public class Runner {
    public static void main(String[] args) {

        Teacher t = new Teacher("Amisha", 35, "English");
        Student s = new Student("Ritika", 14, "9th Grade");
        Staff st = new Staff("Rahul", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}