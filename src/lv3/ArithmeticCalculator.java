package lv3;

import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number> {

    //속성
    private final T num1;
    private final T num2;
    private OperatorType operatorType;

    // 생성자
    public ArithmeticCalculator(T num1, T num2, String operatorSymbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.operatorType = OperatorType.fromSymbol((operatorSymbol));
    }

    // 기능
    public Number calculate() { // 계산 메서드
        double result = operatorType.cal(num1.doubleValue(), num2.doubleValue());
        return result;
    }


    public List<Number> getResultsGreaterThan(List<Number> resultList, Number value) {
        return resultList.stream()
                .filter(result -> result.doubleValue() > value.doubleValue())
                .collect(Collectors.toList());
    }
}