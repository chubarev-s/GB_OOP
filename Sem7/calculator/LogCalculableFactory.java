package calculator;

public class LogCalculableFactory implements ICalculableFactory{

    private Loggable logger;

    public LogCalculableFactory(Loggable logger){
        this.logger = logger;
    }
    @Override
    public Calculable create(double primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
