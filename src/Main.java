public class Main {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        double num1 = 10.0;
        double num2 = 0.0;

        double resultAdd = calculator.add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultAdd);

        double resultSubtract = calculator.subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultSubtract);

        double resultMultiply = calculator.multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultMultiply);

        try {
            double resultDivide = calculator.divide(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + resultDivide);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
