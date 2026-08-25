package question12.in.mindcraft;
public class FtPlayer implements Printable {

    public String name;
    public int goals;

    public FtPlayer(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    @Override
    public void printDetails() {
    	
        System.out.println("Football Player");
        System.out.println("Name: " + name);
        System.out.println("Goals: " + goals);
    }
}
