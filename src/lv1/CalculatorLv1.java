package lv1;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flag = 0;
        int num1 = 0;
        int num2 = 0;

        while (flag == 0) {     // 계산기 루프
            while (flag == 0) {      // 연산 루프
                while (true) {  // 첫 번째 숫자 입력 루프
                    try {
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        String x1 = sc.nextLine();

                        if (x1.equals("exit")) {
                            flag += 1;
                            break; // exit 입력 시 루프 종료
                        }

                        int input1 = Integer.parseInt(x1);

                        if (input1 >= 0) {
                            num1 = input1;
                            break;
                        } else {
                            System.out.println("0이상 양의 정수를 입력해주세요.");
                        }

                    } catch (NumberFormatException nfe) {   // 소수 입력 시
                        System.out.println("0이상 양의 정수를 입력해주세요.");
                    }
                }

                while (true) {  // 두 번째 숫자 입력 루프

                    if (flag != 0) {    // 첫 번째 숫자 자리에 exit 입력될 경우 계산기 종료
                        break;
                    }

                    try {
                        System.out.print("두 번째 숫자를 입력하세요: ");
                        String x2 = sc.nextLine();

                        if (x2.equals("exit")) {
                            flag += 1;
                            break; // exit 입력 시 루프 종료
                        }

                        int input2 = Integer.parseInt(x2);

                        if (input2 >= 0) {
                            num2 = input2;
                            break;
                        } else {
                            System.out.println("0이상 양의 정수를 입력해주세요.");
                        }

                    } catch (NumberFormatException nfe) {   // 소수 입력 시
                        System.out.println("0이상 양의 정수를 입력해주세요.");
                    }
                }

                if (flag != 0) {
                    break;
                }

                System.out.println("사칙연산 기호를 입력하세요: ");
                String strSymbol = sc.nextLine();
                char chSymbol = strSymbol.charAt(0);

                int result = 0;

                switch (chSymbol) {
                    case '+' : result = num1 + num2;
                        System.out.println("결과: " + result);
                        break;
                    case '-' : result = num1 - num2;
                        System.out.println("결과: " + result);
                        break;
                    case '*' : result = num1 * num2;
                        System.out.println("결과: " + result);
                        break;
                    case '/' :
                        try {
                            result = num1 / num2;
                            System.out.println("결과: " + result);
                            break;
                        } catch (ArithmeticException ae) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                            break;
                        }

                    default:
                        System.out.println("잘못된 기호입니다.");
                        break;
                }
            }
        }
        System.out.println("계산기를 종료합니다.");
    }
}
