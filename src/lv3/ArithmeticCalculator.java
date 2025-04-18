package lv3;

public class ArithmeticCalculator {
    private int num1;
    private int num2;
    private OperatorType operatorType;

    public ArithmeticCalculator(int num1, int num2, String operatorSymbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.operatorType = OperatorType.fromSymbol((operatorSymbol));
    }

    public int calculate() {
        return operatorType.cal(num1, num2);
    }
}