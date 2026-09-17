public class TaskTwoAssignmentComparison {
    public static void main(String[] args) {
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
