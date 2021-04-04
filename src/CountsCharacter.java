import java.util.Scanner;

public class CountsCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi :  ");
        String s = sc.next();
        System.out.println("Nhập vào kí tự muốn đếm trong chuỗi" + s);
        char c = sc.next().charAt(0);
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                answer ++;
            }
        }
        System.out.print( "Số kí tự " + c + " trong chỗi " + s +  " là: "+answer);
    }
}
