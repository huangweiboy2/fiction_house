package xyz.zinglizingli.books.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorUtils {

    private static ExecutorService fixedThreadPool;
    private static ExecutorService cachedThreadPool ;
    static{
        fixedThreadPool = Executors.newFixedThreadPool(5);
        cachedThreadPool = Executors.newCachedThreadPool();
    }
    public static void excuteFixedTask(Runnable task){
        fixedThreadPool.execute(task);
    }
    public static void excuteCachedTask(Runnable task){
        cachedThreadPool.execute(task);
    }
}
