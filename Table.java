import java.util.*;
public class Table {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");

    int number = sc.nextInt();

    
    int a=1;
    int b=10;
    
    while (a <= b) {
            System.out.println(a + " x " + number + "=" + a*number);

            a++;
    }

    sc.close();



    }
    

}
