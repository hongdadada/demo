package thread.method.stop;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 17:07
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
            System.out.println("isAlive ="+thread.isAlive());
            System.out.println("isInterrupted ="+thread.isInterrupted());
            System.out.println("isDaemon ="+thread.isDaemon());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}