import java.util.Scanner;

public class ApplicationCountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nhapN(scanner);
        int a[] = nhapMang(scanner,n);
        xuatMang(a);
        showListStudent(a);

    }
    static int nhapN(Scanner scanner){
        int n;
        do {
            System.out.println("Vui loòng nhập n > 0");
            n = Integer.parseInt(scanner.nextLine());
        }while (n<1);
        return n;
    }
    static int[] nhapMang(Scanner scanner, int n){
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        return a;
    }
    static void xuatMang(int a[]){
        for (int items : a){
            System.out.println(items + "\t");
        }
        System.out.println("\n");
    }
    static void showListStudent(int a[]){
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
            if (a[j] >= 5 && a[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
