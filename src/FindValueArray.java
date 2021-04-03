import java.util.Scanner;

public class FindValueArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String input_name = scanner.nextLine();

        boolean isName = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isName = true;
                break;
            }
        }
        if (isName == false)
            System.out.println("Not found " + input_name + " in the list.");
       }
}
