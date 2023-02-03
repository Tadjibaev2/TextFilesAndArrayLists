package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double ans;
        char ch;
        String stop = "stop";



            System.out.println("\nВведите число\n");
            num1 = scanner.nextDouble();
            System.out.println("\nВведите число\n");
            num2 = scanner.nextDouble();

            System.out.println("Введите операцию (+, -, *,  / )");
            ch = scanner.next().charAt(0);


            switch (ch) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                default:
                    System.out.printf("Ошибка введите другой оператор");
                    return;
            }

            System.out.print("\n Результат:\n");
            System.out.printf(num1 + " " + ch + " " + num2 + " = " + ans);
        }
    }



