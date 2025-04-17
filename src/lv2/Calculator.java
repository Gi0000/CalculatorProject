package lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Calculator {
    private List<Integer> resultList;

    // 생성자
    public Calculator() {
        resultList = new LinkedList<>();
    }

    public int calculate(int num1, int num2, int operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    return 0; // 또는 return -1 등으로 예외 상황임을 알리는 값 반환
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("잘못된 연산 기호입니다.");
                return 0; // 또는 return -1 등으로 처리
        }

        resultList.add(result);
        System.out.println("결과: " + result);
        return result;
    }

    // getter
    public List<Integer> getResultList() {
        return resultList;
    }

    // setter
    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public void removeResult() {
        if (!resultList.isEmpty()) {
            resultList.remove(0);
        }
    }
}
