package implementInterface;

public enum EnumOperator implements Operator {
    MULTIPLE {
        @Override
        public int calculate(int num1, int num2) {
            return num1 * num2;
        }
    },
    PLUS {
        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    }

}
