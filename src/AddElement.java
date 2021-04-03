import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử n = ");
        int k = scanner.nextInt();
        System.out.printf("\nChèn phần tử %d vào mảng.", k);
        arr = insert(arr, k);
        System.out.print("\nMảng sau khi chèn: ");
        showArray(arr);



    }
    static int[] insert(int[] arr, int n){
        int arrIndex = arr.length -1;
        int tempIndex = arr.length;
        int[] newArray = new int[tempIndex  + 1];
        boolean inserted = false;
        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > n) {
                newArray[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    newArray[i] = n;
                    inserted = true;
                } else {
                    newArray[i] = arr[arrIndex--];
                }
            }
        }
        return newArray;
    }
     static void showArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    public static void sortASC(int [] arr) {
//        int temp = arr[0];
//        for (int i = 0 ; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//    }

}
