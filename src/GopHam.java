import java.util.Arrays;
public class GopHam {
    public static void main(String[] args) {
        int[] Array1 = new int[]{1, 12, 4, 14, 111, 141};
        int[] Array2 = new int[]{19, 21, 321, 9312, 100111};
        int[] aggregationOfFunctions = new int[Array1.length + Array2.length];
        System.arraycopy(Array1, 0, aggregationOfFunctions, 0, Array1.length);
        System.arraycopy(Array2, 0, aggregationOfFunctions, Array1.length, Array2.length);
        System.out.println("Array1: " + Arrays.toString(Array1));
        System.out.println("Array2: " + Arrays.toString(Array2));
        System.out.println("Concatenated Array: " + Arrays.toString(aggregationOfFunctions));
    }
}
