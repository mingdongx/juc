package com.morton.juc.c_003;

/**
 * @author MortonShaw
 * @date 2021/7/17 9:59
 */
public class T {

    private int count = 10;

    // 锁方法
    public synchronized void m() {
        // 任何线程想要执行下面的代码，必须先拿到o的锁
        // 锁存在与堆对象的头上，共64位，有两位控制锁
        // mark word
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

}
