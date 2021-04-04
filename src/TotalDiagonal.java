import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int soDong = nhapN(scan);
        System.out.println("Nhập số cột");
        int soCot = nhapN(scan);
        int a[][] = nhapMang(soDong, soCot, scan);
        xuatMang(a, soDong, soCot);
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soDong; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);

    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.println("Nhập vào giá trị >1");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    public static int[][] nhapMang(int soDong, int soCot, Scanner scan) {
        int a[][] = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "] = ");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        return a;
    }

    public static void xuatMang(int a[][], int soDong, int soCot) {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\t");
        }
    }

}
