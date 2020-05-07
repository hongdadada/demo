package thread.method.sleep;

/**
 * @author zhangwei
 * @Description:
 * 方法sleep()的作用是在指定的毫秒数内让当前"正在执行的线程"休眠(暂停执行)。
 * 这个"正在执行的线程"是指this.currentThread()返回的线程
 * @date 2020-04-30 14:43
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        try {
            System.out.println("run threadName="+Thread.currentThread().getName()+" begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+Thread.currentThread().getName()+" end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}