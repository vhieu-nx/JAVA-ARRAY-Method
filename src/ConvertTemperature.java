import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choise;
        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("Enter fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius " + fahrenheitToC(fahrenheit));
                case 2:
                    System.out.println("Enter celsius");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit " + celsiusToF(celsius));
                case 0:
                    System.exit(0);
            }

        }while (choise != 0);
    }
    static double celsiusToF(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    static  double fahrenheitToC(double  fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
