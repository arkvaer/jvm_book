package org.fenixsoft.jvm.chapter6;

/**
 *
 * @author zhangchengtao
 * @date 2026/7/26 15:42
 */
public interface TestInterface {
    default int test() {
        int a = 1;
        return a + 1;
    }

}
