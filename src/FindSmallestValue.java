import java.util.Scanner;

public class FindSmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nhapN(scanner);
        int a[] = nhapMang(scanner,n);
        xuatMang(a);
        int gTNN = timGTNN(a);
        System.out.println("Gía trị nhỏ nhất là: " + a[gTNN] + " tại vị trí " + gTNN);

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
    static int timGTNN(int a[]){
        int i;
        int vtmin = 0;
        int min = a[0];
        for (i = 1; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
                vtmin = i;
            }
        }
        return vtmin;
    }


}
