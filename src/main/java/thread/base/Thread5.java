package thread.base;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:55
 */
public class Thread5 extends Thread {

    private int count=5;

    /**
     * 没有synchronized时，是非线程安全的，非线程安全指的是多个线程对同一个对象中的同一个实例变量进行操作时会出现值被更改、值不同步的情况。
     * 添加了synchronized关键字之后，使多个线程run方法时，以排队的方式进行处理。
     * 当一个线程调用run前，先判断run方法有没有被上锁，如果上锁，说明有其他线程正在调用run方法。这样也就实现了排队调用run方法的目的。
     * synchronized可以在任意对象和方法上枷锁，枷锁的代码被称为【互斥区】或【临界区】
     */
    @Override
    synchronized public void run(){
        super.run();
        count--;
        System.out.println("由 "+Thread.currentThread().getName()+" 计算.count="+count);
    }
}