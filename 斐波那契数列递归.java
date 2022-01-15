@SuppressWarnings("unused")

public class 斐波那契数列递归 {
    public static void main(String args[]) {

        try (java.util.Scanner s = new java.util.Scanner(System.in)) {
            int n = s.nextInt();// 输入一个数字，表示第n个斐波那契数
            if (n <= 2)
                System.out.println("数字不能小于2");
            else {
                System.out.println(meThod(n));//输出第n个斐波那契数列的值
            }
        }
    }

    public static int meThod(int n) {
        if (n == 1 || n == 2)
            return 1;
        return meThod(n - 1) + meThod(n - 2);
    }
}
