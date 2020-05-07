package thread.communication.wait_notify.test2;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-07 14:36
 */
public class Run {
    public static void main(String[] args) {
        Object lock=new Object();
        Thread thread1=new MyThread1(lock);
        Thread thread2=new MyThread2(lock);
        thread1.start();
        thread2.start();
    }
}