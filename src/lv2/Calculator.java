package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> resultList;

    public Calculator() {
        resultList = new ArrayList<>();
    }

    public int calculate(int num1, int num2, int operator) {
        int result = 0;

        switch (operator) {
            case '+' : result = num1 + num2;            // 덧셈
                break;
            case '-' : result = num1 - num2;            // 뺄셈
                break;
            case '*' : result = num1 * num2;            // 곱셈
                break;
            case '/' :
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                break;
            default:                                    // +, -, *, / 이외의 다른 문자열이 들어왔을 경우
                throw new IllegalArgumentException("유효하지 않은 연산자입니다");
        }

        resultList.add(result);
        return result;
    }

}
