package calculator;

public interface Complable {
    Complex add(Complex arg);
    Complex mult(Complex arg);
    Complex sub(Complex arg);
    Complex div(Complex arg);
    double getResult();
}
