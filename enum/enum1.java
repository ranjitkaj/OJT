enum patna{
    patna, delhi, banglore;

    private patna() {
        System.out.println("private constructor");

    }
    
}

public class enum1 {

    public static void main(String[] args) {

        // patna p = patna.delhi;

        // patna[] p = patna.values();

        // for (int i = 0; i < p.length; i++) {

        //     System.out.println(p[i]);

        // }

        for(patna p: patna.values()){
            System.out.println(p.ordinal() + " " + p.name());
        }


    }


    
}
