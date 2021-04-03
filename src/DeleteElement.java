import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,21,21,3,1,2,2,4,5,7,8,9,31,321,312,321};
        arr = delElement(arr,1);
        for(int i : arr){
            System.out.println( i + "");
        }

    }
    static int[] delElement(int[] arr, int x){
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                flag = true;
                count++;
            }
        }
        if (flag){
            int[] newArr = new int[arr.length - count];
            for(int i = 0, j =0; i<arr.length;i++){
                if(x == arr[i]){
                    continue;
                }
                newArr[j] = arr[i];
                j++;
            }
            return newArr;
        }
        return arr;
    }
}
