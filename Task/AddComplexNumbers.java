class Complex {
    double real, imaginary;
    
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }
    
    public static Complex add(Complex num1, Complex num2) {
        double realPart = num1.real + num2.real;
        double imaginaryPart = num1.imaginary + num2.imaginary;
        return new Complex(realPart, imaginaryPart);
    }
    
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class AddComplexNumbers {
    public static void main(String[] args) {
        Complex num1 = new Complex(2, 3);
        Complex num2 = new Complex(4, 5);
        
        Complex sum = Complex.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
