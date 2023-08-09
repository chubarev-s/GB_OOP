package calculator;
import java.util.Scanner;
import calculator.Complex;


public class ViewComplex {

    private IComplexFactory calculableFactory;

    public ViewComplex(IComplexFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void runComlex() {
        while (true) {
            Complex primaryArg = promptComplex("Введите первый аргумент: ");
            Complex calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =, -, / ) : ");
                if (cmd.equals("*")) {
                    Complex arg = promptComplex("Введите второй аргумент: ");
                    calculator.mult(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    Complex arg = promptComplex("Введите второй аргумент: ");
                    calculator.add(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    Complex arg = promptComplex("Введите второй аргумент: ");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    Complex arg = promptComplex("Введите второй аргумент: ");
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Complex promptComplex(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String arg = in.nextLine();
        Complex(arg);
        return arg;
        //return Integer.parseInt(in.nextLine());
    }
}

