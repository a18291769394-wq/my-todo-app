public class OperatorDemo {
    public static void main(String[] args) {
        taskOne();
        System.out.println();
        taskTwo();
    }

    private static void taskOne() {
        int a = 12;
        int b = 5;
        float m = 7.5f;
        float n = 2.5f;

        System.out.println("任务一：变量与算术运算符的使用");
        System.out.println("整数变量：a = " + a + ", b = " + b);
        System.out.println("浮点变量：m = " + m + ", n = " + n);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("m + n = " + (m + n));
        System.out.println("m - n = " + (m - n));
        System.out.println("m * n = " + (m * n));
        System.out.println("m / n = " + (m / n));
    }

    private static void taskTwo() {
        int x = 10;
        int y = 3;

        System.out.println("任务二：赋值与比较运算符的使用");
        System.out.println("初始值：x = " + x + ", y = " + y);

        int value = x;
        System.out.println("value = x -> " + value);
        value += y;
        System.out.println("value += y -> " + value);
        value -= y;
        System.out.println("value -= y -> " + value);
        value *= y;
        System.out.println("value *= y -> " + value);
        value /= y;
        System.out.println("value /= y -> " + value);
        value %= y;
        System.out.println("value %= y -> " + value);

        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
    }
}
