public class FindMinUseFunction {
    public static void main(String[] args) {
            int[] array = {1,3,4,57,321,21,2};
            int index = minValue(array);
        System.out.println("Gía trị nhỏ nhất trong mảng là " + array[index]);


    }
    static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                index = i;
                min = array[i];
            }
        }
        return index;
    }
}
