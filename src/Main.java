import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = in.nextDouble();
        System.out.println("Введите число b");
        double b = in.nextDouble();

        System.out.print("Результат сложения a и b:");
        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b);

        System.out.print("\nРезультат вычитания a и b:");
        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b);

        System.out.print("\nРезультат умножения a и b:");
        calculator = new Calculator(new multiplier());
        calculator.calc(a, b);

        System.out.print("\nРезультат деления a и b:");
        calculator = new Calculator(new divider());
        calculator.calc(a, b);
    }
}