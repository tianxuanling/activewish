package com.txl.activewish.ActiveWish.kafka;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadPool {
	private int corePoolSize = 1; // 线程池维护线程的最少数量
    private int maximumPoolSize = 10;// 线程池维护线程的最大数量
    private long keepAliveTime = 3; // 线程池维护线程所允许的空闲时间
    private TimeUnit unit = TimeUnit.SECONDS;// 线程池维护线程所允许的空闲时间的单位
    private BlockingQueue<Runnable> workQueue; // 线程池所使用的缓冲队列
    private RejectedExecutionHandler handler; // 线程池对拒绝任务的处理策略
    private static AtomicLong along = new AtomicLong(0);

    public void run() throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize, keepAliveTime, unit,
                new LinkedBlockingQueue<Runnable>(),
                new ThreadPoolExecutor.DiscardOldestPolicy()) {

            // 线程执行之前运行
            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("...............beforeExecute");
            }

            // 线程执行之后运行
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("...............afterExecute");
            }

            // 整个线程池停止之后
            protected void terminated() {
                System.out.println("...............thread stop");
            }
        };
        for (int i = 1; i <= 10; i++) {
            pool.execute(new ThreadPoolTask(i, along));
        }
        for (int i = 1; i <= 10; i++) {
            pool.execute(new ThreadPoolTask(-i, along));
        }
        pool.shutdown();
        //Thread.sleep(25000);
        System.out.println(along.get());

    }

    public static void main(String[] args) {
        try {
            new ThreadPool().run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
