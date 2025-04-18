package lv3;

public enum OperatorType {
    ADD("+") {
        public double cal(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        public double cal(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        public double cal(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        public double cal(double a, double b) {
            if (b == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                return 0; // 또는 return -1 등으로 예외 상황임을 알리는 값 반환
            } else {
                return a / b;
            }
        }
    };

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    // getter
    public String getSymbol() {
        return symbol;
    }

    public abstract double cal(double a, double b);
    public static OperatorType fromSymbol(String symbol) {
        for (OperatorType op : OperatorType.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다: " + symbol);
    }
}