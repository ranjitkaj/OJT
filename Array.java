import java.util.*;
public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        int arr2[] = {10, 20, 30, 40, 50};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);

        System.err.println(Arrays.compare(arr2, arr));
        System.out.println(Arrays.equals(arr, arr2));

        Scanner sc= new Scanner(System.in);     
        // System.out.print("Enter first number- ");  
        // int a= sc.nextInt();  
        // System.out.print("Enter second number- ");  
        // int b= sc.nextInt();  
        System.out.print("Enter number- ");  
        int c= sc.nextInt(); 
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();

        int a=1;
        int b=10;
        
        while (a <= b) {
                System.out.println(a*c);
                a++;
        }

        
        // System.out.println("Your name is: " + name);

        sc.close();
         
    }
}
