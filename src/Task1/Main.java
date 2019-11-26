package Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (true) {
            input = in.nextLine();
            if (input.equals("exit")) return;
            String[] www = new String[2];
            www = input.split("[^0-9.]");
            double res = 0;
            try {
                if (www.length == 1) throw new NotMOrNException("Отсутствует второе число");
                double a = parseDouble(www[0]);
                double b = parseDouble(www[1]);
                if (a % 1 > 0 || b % 1 > 0) throw new MOrNIsNotInt("Введены не целые числа");
                if (input.contains("+")) res = a + b;
                else if (input.contains("-")) res = a - b;
                else if (input.contains("X")) res = a * b;
                else if (input.contains("/")) {
                    if (a == 0 || b == 0) throw new DivisionByZeroException("Деление на ноль");
                    else res = a / b;
                } else throw new OperatorException("Не верный оператор");
                System.out.println((int) res);
            } catch (DivisionByZeroException | MOrNIsNotInt | OperatorException | NotMOrNException g) {
                System.out.println(g.getMessage());
            }
        }
    }
}
