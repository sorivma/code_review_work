public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor can not be 0");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        System.out.println("Решим уравнение 5x+5 = 0");
        return div(5, dif(0, 5));
    }
}
