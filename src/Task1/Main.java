package Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (true) {
            input = in.nextLine();
            if (input.equals("exit")) return;
            String[] www = input.split("[+-/X]");
            double res = 0;
            try {
                double a = parseInt(www[0]);
                double b = parseInt(www[1]);
                if (a % 1 > 0 || b % 1 > 0) throw new MOrNIsNotInt("Что здесь пишется?");
                if (input.contains("+")) res = a + b;
                else if (input.contains("-")) res = a - b;
                else if (input.contains("X")) res = a * b;
                else if (input.contains("/")) {
                    if (a == 0 || b == 0) throw new DivisionByZeroException("Что здесь пишется?");
                    else res = a / b;
                } else throw new OperatorException("Что здесь пишется?");
                System.out.println((int) res);
            } catch (DivisionByZeroException g) {
                System.out.println("Деление на ноль");
            } catch (MOrNIsNotInt g) {
                System.out.println("Введены не целые числа");
            } catch (OperatorException g) {
                System.out.println("Не верный оператор");
            }
        }
    }
}