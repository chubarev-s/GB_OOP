package calculator;

public class LogCalculator implements Calculable{

    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(double arg) {
        double firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
        Calculable result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public Calculable multi(double arg) {
        double firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        Calculable result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public double getResult() {
        double result = decorated.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    @Override
    public Calculable subtraction(double arg) {
        double firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода subtraction с параметром %d", firstArg, arg));
        Calculable result = decorated.subtraction(arg);
        logger.log(String.format("Вызова метода subtraction произошел"));
        return result;
    }

    @Override
    public Calculable division(double arg) {
        double firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода division с параметром %d", firstArg, arg));
        Calculable result = decorated.division(arg);
        logger.log(String.format("Вызова метода division произошел"));
        return result;
    }
}
