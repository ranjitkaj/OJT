import java.util.*;
public class Task24 {
    public static void main(String[] args) {
        // Swap Two Numbers

                int a = 10;
                int b = 20;
                
                System.out.println("Before swapping:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                
                // Swapping logic
                int temp = a;
                a = b;
                b = temp;
                
                System.out.println("After swapping:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);

        //  WAP to convert Integer numbers and Binary numbers in java

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

            
                String binary = Integer.toBinaryString(number);
                System.out.println("Binary representation of " + number + " : " + binary);

                String hex = Integer.toHexString(number);
                System.out.println("Hexadecimal representation of " + number + " : " + hex);

                String octal = Integer.toOctalString(number);
                System.out.println("Octal representation of " + number + " : " + octal);


                
         

        // WAP to Find Factorial of a Number in Java. 

        
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number1; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number1 + " is: " + factorial);

        // WAP to Add two Complex Numbers in Java. 

        System.out.print("Enter the real part of the first complex number: ");
        int real1 = scanner.nextInt();
        System.out.print("Enter the imaginary part of the first complex number: ");
        int imaginary1 = scanner.nextInt();
        System.out.print("Enter the real part of the second complex number: ");
        int real2 = scanner.nextInt();
        System.out.print("Enter the imaginary part of the second complex number: ");
        int imaginary2 = scanner.nextInt();
        
        int realSum = real1 + real2;
        int imaginarySum = imaginary1 + imaginary2;
        
        System.out.println("Sum of the two complex numbers: " + realSum + " + " + imaginarySum + "i");


        // WAP to Calculate Simple Interest in Java. 

        System.out.print("Enter the principal amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter the rate of interest: ");
        int rate = scanner.nextInt();
        System.out.print("Enter the time period (in years): ");
        int time = scanner.nextInt();
        
        int simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest: " + simpleInterest);
        




        



        scanner.close();

            }
        }


