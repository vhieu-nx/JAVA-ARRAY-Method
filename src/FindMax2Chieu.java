public class FindMax2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 31, 9},
                {2, 5, 90, 0},
                {-11, 119, 7, 21}
        };
        int max = arr[0][0];
        int columMax = 0;
        int rowMax = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                if (arr[row][colum] > max) {
                    max = arr[row][colum];
                    rowMax = row;
                    columMax = colum;
                }
            }
        }
        System.out.println("Element Max Two Dimensional Array:" + max);
        System.out.println("Index max:[" + rowMax + "]" + "[" + columMax + "]");
    }
    
}
