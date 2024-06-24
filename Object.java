class Ranjit {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public String mul(int inp) {
        if(inp >= 2) {
            return ("multiplication is possible");
        }
        else {
            return ("multiplication is not possible");
        }
    }

    public String buyPC(int cost) {
        if(cost >= 10000) {
            return ("buy pc");
        }
        else {
            return ("not buy pc");
        }
    }
    
    

    public void display() {
        System.out.println("Ranjit");
    }

    public String d(){
        return "Ranjit Kumar";

    }

    int x = 10;

    int y = 15;

    public int z() {
        return x + y;
    }


}


public class Object {

    public static void main(String[] args) {

        // Object obj = new Object();
        // System.out.println(obj);

        Ranjit obj = new Ranjit();
        int c = obj.add(15, 28);
        System.out.println(c);
        System.out.println(obj.add(10, 20));
        System.out.println(obj.sub(10, 20));
        System.out.println(obj.mul(10));

        obj.display();

        System.out.println(obj.d());
        System.err.println(obj.d().toUpperCase());

        System.out.println(obj.buyPC(10000));

        System.out.println(obj.z());


        


    }
    
}
