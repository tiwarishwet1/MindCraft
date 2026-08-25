package question13and14;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Vehicle v1 = new Vehicle(1, "Porsche", 50000);
        Vehicle v2 = new Vehicle(1, "Porsche", 50000);
        Vehicle v3 = new Vehicle(2, "Bentley", 90000);

        Vehicle v4 = v1.clone();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println(v1 == v2);
        System.out.println(v1 == v4);

        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));
        System.out.println(v1.equals(v4));

        System.out.println("v1 HashCode: " + v1.hashCode());
        System.out.println("v2 HashCode: " + v2.hashCode());
        System.out.println("v3 HashCode: " + v3.hashCode());
        System.out.println("v4 HashCode: " + v4.hashCode());
    }
}
