import java.io.IOException;

public class userin {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader a = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = a.readLine();
        System.out.println("Enter your Age : ");
        int age = Integer.parseInt(a.readLine());
        System.out.println("Hello, " + name + "! Welcome to your" + " program." + " Your age is " + age + ".");

        System.out.println(2*age);


        // StringBuffer b = new StringBuffer("Ranjit");
        // System.out.println(b);

        // System.out.println(b.reverse());




        // java.util.Scanner a = new java.util.Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = a.nextLine();

        // System.out.println("Enter your password: ");
        // String pass = a.nextLine();

        // String b = name.toLowerCase(); 
        // String c = name.toUpperCase();



        // if (name.equals("Ranjit") | name.equals(b) | name.equals(c)) {
        //     if (pass.equals("12345")) {
        //         System.out.println("Welcome " + name + "!");
        //     } else {
        //         System.out.println("Invalid password.");
        //     }
        // } else {
        //     System.out.println("Invalid username.");
        // }


        // // if (name.equals("Ranjit") && pass.equals("12345")) {
        // //     System.out.println("Welcome " + name + "!");
        // // } else {
        // //     System.out.println("Invalid username or password.");
        // // }

        
        // a.close();

    }

    
}
