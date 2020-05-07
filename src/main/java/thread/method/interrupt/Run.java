package thread.method.interrupt;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:28
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(500);
            myThread.interrupt();
            System.out.println("是否停止1? ="+myThread.interrupted());
            System.out.println("是否停止2? ="+myThread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}