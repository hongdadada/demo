package thread.communication.wait_notify.test2;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-07 14:33
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            System.out.println("开始notify  "+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify  "+System.currentTimeMillis());
        }
    }
}