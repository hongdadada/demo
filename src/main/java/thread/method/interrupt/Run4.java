package thread.method.interrupt;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:56
 */
public class Run4 {
    public static void main(String[] args) {
        try {
            MyThread2 myThread2=new MyThread2();
            myThread2.start();
            Thread.sleep(2000);
            myThread2.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}