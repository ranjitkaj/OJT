
public class Userinput {
    public static void main(String[] args) {

        java.util.Scanner a = new java.util.Scanner(System.in);

        // System.out.println("Enter your name: ");
        // String name = a.nextLine();
        // System.out.println("Hello, " + name + "! Welcome to your program.");

        System.out.println("Enter a number: ");
        int number = a.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");

        }

        if(number > 0) {
            System.out.println("The number is positive.");


        a.close();
        
    }
}
}
