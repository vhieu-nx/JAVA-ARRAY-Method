public class FindMax2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 31, 9},
                {2, 5, 90, 0},
                {-11, 119, 7, 21}
        };
        int max = arr[0][0];
        int colum = 0;
        int row = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                    row = j;
                    colum = i;
                }
            }
        }
        System.out.println("Element Max Two Dimensional Array: " + max);
        System.out.println("Index max:[" + row + "]" + "[" + colum + "]" );
    }
    
}
