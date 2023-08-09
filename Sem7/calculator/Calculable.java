package calculator;

public interface Calculable {
    Calculable sum(double arg);
    Calculable multi(double arg);
    Calculable subtraction(double arg);
    Calculable division(double arg);
    double getResult();
}
