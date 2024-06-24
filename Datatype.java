import java.util.*;
public class Datatype {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of boolean: ");
        boolean number = sc.nextBoolean();
        System.out.println(number);

        System.out.println("Enter the value of short: ");
        short a = sc.nextShort();
        System.out.println(a);

        System.out.println("Enter the value of int: ");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.println("Enter the value of long: ");
        long c = sc.nextLong();
        System.out.println(c);

        System.out.println("Enter the value of float: ");   
        float d = sc.nextFloat();
        System.out.println(d);

        System.out.println("Enter the value of double: ");
        double e = sc.nextDouble();
        System.out.println(e);

        System.out.println("Enter the value of char: ");
        char f = sc.next().charAt(0);
        System.out.println(f);

        System.out.println("Enter the value of String: ");
        String h = sc.next();
        System.out.println(h);


        System.out.println("Enter the value of byte: ");
        byte i = sc.nextByte();
        System.out.println(i);




        sc.close();


    }
    
}
