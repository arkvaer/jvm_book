package org.fenixsoft.jvm.chapter4;

/**
 *
 * @author zhangchengtao
 * @date 2026/7/12 18:49
 */
public class Bar {
    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return c + a + b;
    }

    public static void main(String[] args) {
        int sum = new Bar().sum(3);
        System.out.println(sum);
    }
}
