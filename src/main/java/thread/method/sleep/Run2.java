package thread.method.sleep;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:19
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread2 thread2=new MyThread2();
        System.out.println("begin ="+System.currentTimeMillis());
        thread2.start();
        System.out.println("end ="+System.currentTimeMillis());
    }
}