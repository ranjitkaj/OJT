class Ranjit {
    String name;
    int age;

    public void show(){
        System.out.println(name + ":::" + age);
    }
}

public class obj {
    public static void main(String[] args) {
        Ranjit h1 = new Ranjit();
        h1.name = "Ranjit";
        h1.age = 20;
        h1.show();
        
    }
    
}
