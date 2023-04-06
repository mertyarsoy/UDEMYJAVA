package MyApp;

class Program {
    int value;
    String text;

    public Program() {
        this(5);
        System.out.println("First Constructor");
        value = 12;
    }

    public Program(int value) {
        this.value = value;
        System.out.println("Second Constructor");
    }

    public Program(int value, String text) {
        this.value = value;
        this.text = text;
        System.out.println("Third Constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {

        Program myProgram = new Program();
        Program myProgram2 = new Program(2);
        Program myProgram3 = new Program(3, "Mert");

    }
}