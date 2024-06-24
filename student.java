class student {
    String name;
    String email;
    long phone;
    float marks;

    student(String name, String email, long phone, int marks) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.marks = marks;
    }
    double percentage() {
        return (marks / 500 *100); 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage() + "%");
    }  
    

    public static void main(String[] args) {
        student s1 = new student("Ranjit Kumar", "rj@123", 1234567890, 450);
        s1.display();
    }
}


