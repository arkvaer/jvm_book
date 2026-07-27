package org.fenixsoft.jvm.chapter6;

/**
 *
 * @author zhangchengtao
 * @date 2026/7/18 16:35
 */
public class TestClass {
    private int m;

    public int inc() {
        int x;
        try {
            x = 1;
            return x;
        } catch (RuntimeException e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
