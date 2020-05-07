package thread.method.Return;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 17:30
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t= new MyThread();
            t.start();
            Thread.sleep(2000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}