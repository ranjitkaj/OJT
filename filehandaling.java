import java.io.File;
import java.util.Scanner;


public class filehandaling {

    public static void main(String[] args) {
        // File a = new File("C:\\Users\\ranji\\Desktop\\test.txt");
        // try {
        //     if (a.createNewFile()) {
        //         System.out.println("File created");
        //     } else {
        //         System.out.println("File already exist");
        //     }
        // } catch (Exception e) {
        //     System.out.println("file not created");
        // }
        // System.out.println("absolute path " + a.getAbsolutePath());
        // System.out.println("name" + a.getName());
        // System.out.println("length" + a.length());
        // System.out.println(a.getParent());
        // System.out.println(a.lastModified());
        // System.out.println(a.canRead());
        // System.out.println(a.canWrite());
        // System.out.println(a.isHidden());
        // System.out.println(a.exists());
        // System.out.println(a.isFile());
        // System.out.println(a.isDirectory());


        File a = new File("C:\\Users\\ranji\\Desktop\\test.txt");

        try {
            Scanner sc = new Scanner(a);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("file not found");
        }

        
        File c = new File("./");
        // c.mkdirs();
        if (!c.exists()) {
            c.mkdirs();
            System.out.println("Folder Created Successefully");
         }
        else{
            System.out.println("Folder alrady exsist");
        }
        System.out.println(c.getParent());

        c.delete();



        



        
    }
    
}
