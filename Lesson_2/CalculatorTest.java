import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            int numOne = scanner.nextInt();
            calculator.setNumOne(numOne);

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calculator.setSign(sign);

            System.out.print("Введите второе число: ");
            int numTwo = scanner.nextInt();
            calculator.setNumTwo(numTwo);
            calculator.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? (yes/no)");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
        System.out.println("Завершение программы");
    }
}