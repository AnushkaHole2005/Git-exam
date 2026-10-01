public class Calculator {
    public int add(int a, int b) throws ArithmeticException {
        return a + b;
    }

    public int sub(int a, int b) throws ArithmeticException {
        return a - b;
    }

    public int multiply(int a, int b) throws ArithmeticException {
        return a * b;
    }

    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
