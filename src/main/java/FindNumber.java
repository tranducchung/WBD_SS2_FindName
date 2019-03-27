import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        String name;
        boolean check = false;
        int index = -1;
        System.out.println("Enter name Student you want find");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                index = i;
                check = true;
            }
        }
        if (check) {
            System.out.println("Student is " + name + "in " + index + "of class");
        } else {
            System.out.println("In class haven't " + name);
        }
    }
}
