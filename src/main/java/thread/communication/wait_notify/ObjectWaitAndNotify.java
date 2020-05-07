package thread.communication.wait_notify;

/**
 * @author zhangwei
 * @Description:
 * 底层都是JVM级的native方法
 * 对象的控制权（monitor）
 * wait 如果对象调用了wait方法就会使持有该对象的线程把该对象的控制权（monitor）交出去，然后处于等待状态。
 * notify 如果对象调用了notify方法就会通知某个正在等待这个对象的控制权的线程可以继续运行。
 * notifyAll 如果对象调用了notifyAll方法就会通知所有等待这个对象控制权的线程继续运行。
 * 必须在监视器下运行，就是synchronized或者Condition
 * @date 2020-05-07 14:09
 */
public class ObjectWaitAndNotify {
    public static void main(String[] args) {
        Object t=new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(t){
                    try {
                        t.wait();
                        System.out.println("wait");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (t){
                    t.notify();
                    System.out.println("notify");
                }
            }
        }).start();
    }
}