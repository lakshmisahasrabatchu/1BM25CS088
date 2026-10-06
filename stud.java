import java.util.Scanner;
class StudentData { 
    int usn;
    String name;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter usn");
        usn = sc.nextInt();
        
        sc.nextLine();       
        System.out.println("Enter name");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("usn is " + usn);
        System.out.println("name is " + name);
    }
}
public class stud { 
    public static void main(String args[]) {
        StudentData s1 = new StudentData();
        StudentData s2 = new StudentData();
        
        s1.accept();
        s2.accept();
        s1.display();
        s2.display();
    }
}
