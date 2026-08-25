import com.mindcraft.pack1.Student;
import com.mindcraft.pack2.Batch;

public class Test {

    public static void main(String[] args) {

        Student s = new Student(1, "Max");

        Batch b = new Batch("Java", 25);

        s.display();

        b.display();
    }
}