import java.util.*;
public class Main {
    public static void main(String[] args) {
        // String name = "I am Ranjit Kumar from NSTI Patna";

        // System.out.println(name.charAt(0));
        // System.out.println(name.codePointAt(2));
        // System.out.println(name.codePointBefore(2));
        // System.out.println(name.codePointCount(2, 4));
        // System.out.println(name.compareTo("I am Ranjit Kumar from NSTI Patna"));
        // System.out.println(name.concat(" and I am Reading Java"));
        // System.out.println(name.contentEquals("I am Ranjit Kumar from NSTI Patna"));
        // System.out.println(name.contains("Ranjit"));
        // System.out.println(name.endsWith("Patna"));
        // System.out.println(name.equals("I am Ranjit Kumar from NSTI Patna"));
        // System.out.println(name.equalsIgnoreCase("I am Ranjit Kumar from NSTI Patna"));
        // System.out.println(name.indexOf("Ranjit"));
        // System.out.println(name.lastIndexOf("Ranjit"));
        // System.out.println(name.length());
        // System.out.println(name.replace("Ranjit", "Ranjit Kumar"));
        // System.out.println(name.replaceAll("Ranjit", "Ranjit Kumar"));
        // System.out.println(name.substring(2));
        // System.out.println(name.substring(2, 4));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.trim());
        // System.out.println(name.valueOf("Ranjit"));
        // System.out.println(name.split(" "));
        // System.out.println(name.toCharArray());
        // System.out.println(name.contains(name));
        // System.out.println(name.isEmpty());
        // System.out.println(name.isBlank());
        // System.out.println(name.replace("Ranjit", "Ranjit Kumar"));
        // System.out.println(name.replaceAll("Ranjit", "Ranjit Kumar"));
        // System.out.println(name.substring(2));
        // System.out.println(name.substring(2, 4));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.trim());
        // System.out.println(name.startsWith("I"));
        // System.out.println(name.endsWith("Patna"));
        // System.out.println(name.length());
        // System.out.println(name.replace("Ranjit", "Sanjeet"));
        // System.out.println(name.replaceAll("i", "Sanjeet"));
        // System.out.println(name.split(" "));

        // String a = "ranj@itkumar@gmail.com";

        // System.out.println(a.split("@")[1]);

        // System.out.println(a.indexOf("@"));
        // System.out.println(a.lastIndexOf("@"));
        // System.out.println(a.substring(a.indexOf("@"), a.lastIndexOf("@")));

        // System.out.println(a.substring(a.indexOf("@")));

        // int age = 21;

        // if (age >= 18) {
        //     System.out.println("eligible for voting");
        // } else {
        //     System.out.println("not eligible for voting");
        // }

        int marks = 75;
       
       
        // if (marks >= 90 && marks <= 100) {
        //     System.out.println("Grade A");
        // } else if (marks >= 80  && marks < 90) {
        //     System.out.println("Grade B");
        // } else if (marks >= 70  && marks < 80) {
        //     System.out.println("Grade C");
        // } else if (marks >= 60  && marks < 70) {
        //     System.out.println("Grade D");
        // } else if (marks >= 50  && marks < 60) {
        //     System.out.println("Grade E");
        // } else {
        //     System.out.println("Grade F");
        // }
        
        // System.out.print(marks >= 50 ? "Pass" : "Fail");

        // switch (marks) {
        //     case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
        //         System.out.println("Grade A");
        //         break;
        //     case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
        //         System.out.println("Grade B");
        //         break;
        //     case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
        //         System.out.println("Grade C");
        //         break;
        //     case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
        //         System.out.println("Grade D");
        //         break;
        //     case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59:
        //         System.out.println("Grade E");
        //         break;
        //     default:
        //         System.out.println("Grade F");
        // }

        int a = 1;
        int b = 10;
        int c = 2;

        // System.out.println(a > b ? "a is greater" : "b is greater");

        // while (a <= b) {
        //     System.out.println(a*c);
        //     a+=c;
            
        // }

        // do {
        //     System.out.println(a*c);
        //     a++;
        // } while (a <= b);

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i*c);
        // }

        int[] arr;
        arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        System.err.println(arr[4]);


         int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

         System.err.println(Arrays.compare(arr, arr1));

         System.err.println(arr1[2]);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


    }
    
}
