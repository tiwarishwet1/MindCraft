package question12.in.mindcraft;

public class CktPlayer implements Printable {

    public String name;
    public int runs;

    public CktPlayer(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    @Override
    public void printDetails() {
        System.out.println("Cricket Player");
        System.out.println("Name: " + name);
        System.out.println("Runs: " + runs);
    }
}
