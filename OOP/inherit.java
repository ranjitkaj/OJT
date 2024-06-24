class a {
    String name = "Ranji";
    public void show() {
        System.out.println("This is a class A");
    }
}

class b extends a {
    public void display() {
        System.out.println("This is a class B");
    }
}

class c extends b {
    public void display1() {
        System.out.println("This is a class C");
    }
}
public class inherit {

    public static void main(String[] args) {
        // a obj = new a();
        // b obj1 = new b();
        // obj1.display();  
        // obj.display();

        c obj = new c();
        obj.display1();
        obj.display();
        obj.show();

    }
    
}
