package thread.Reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangwei
 * @Description:
 * 可重入锁，与syronized类似，但是更加灵活
 * ReentrantLock是一个互斥锁，也是一个可重入锁（Reentrant就是再次进入的意思）。
 * ReentrantLock锁在同一个时间点只能被一个线程锁持有，但是它可以被单个线程多次获取，每获取一次AQS的state就加1，每释放一次state就减1。
 * @date 2020-05-07 11:22
 */
public class ReentrantTest {
    private Lock lock=new ReentrantLock();//可重入锁（默认非公平）
    public void demo(){
        lock.lock();
        System.out.println("demo 1");
        demo2();
        lock.unlock();
    }
    public void demo2(){
        lock.lock();
        System.out.println("demo 2");
        lock.unlock();
    }
    public static void main(String[] args) {
        ReentrantTest test=new ReentrantTest();
        new Thread(test::demo).start();
    }
}