abstract class computer {
    public abstract void run();
    public void property() {
        System.out.println("Property of computer");
    }
}

class laptop extends computer {
    public void run() {
        System.out.println("This is a laptop");
    }
}

class desktop extends computer {
    public void run() {
        System.out.println("This is a desktop");
    }
}

public class a {
    public static void main(String[] args) {
        computer c = new laptop();
        c = new desktop();
        c.run();
        c.run();
        c.property();
        
    }
}