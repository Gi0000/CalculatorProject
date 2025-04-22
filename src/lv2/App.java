package lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        int flag = 0;   // exit 입력받을 시 루프 빠져나기 위한 변수
        int num1 = 0;   // 첫 번째 숫자를 담을 변수
        int num2 = 0;   // 두 변째 숫자를 담을 변수

        while (flag == 0) {         // 계산기 루프

            while (true) {      // 첫 번째 숫자 입력 루프
                try {
                    System.out.print("첫 번째 숫자를 입력하세요 (exit 입력 시 종료): ");
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
                    System.out.print("두 번째 숫자를 입력하세요 (exit 입력 시 종료): ");
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
            char chSymbol = strSymbol.charAt(0);    // 문자열을 문자로 변환

            cal.calculate(num1, num2, chSymbol);
            System.out.println(cal.getResultList());
        }
        System.out.println("계산기를 종료합니다.");
        System.out.println(cal.getResultList());    // removeResult 전
        cal.removeResult();
        System.out.println(cal.getResultList());    // removeResult 후
    }
}
