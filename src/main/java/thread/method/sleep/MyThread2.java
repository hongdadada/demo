package thread.method.sleep;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:16
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("run threadName="+Thread.currentThread().getName()+" begin ="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName="+Thread.currentThread().getName()+" end ="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}