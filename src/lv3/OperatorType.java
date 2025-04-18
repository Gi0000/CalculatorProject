package lv3;

public enum OperatorType {
    ADD("+") {
        public int cal(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        public int cal(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        public int cal(int a, int b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        public int cal(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return a / b;
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

    public abstract int cal(int a, int b);
    public static OperatorType fromSymbol(String symbol) {
        for (OperatorType op : OperatorType.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다: " + symbol);
    }
}
