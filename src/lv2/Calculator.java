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
                try {
                    result = num1 / num2;               // 나눗셈
                    System.out.println("결과: " + result);
                    break;
                } catch (ArithmeticException ae) {      // 분모 0일 경우
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
            default:                                    // +, -, *, / 이외의 다른 문자열이 들어왔을 경우
                System.out.println("잘못된 기호입니다.");
                break;
        }

        resultList.add(result);
        return result;
    }

}
