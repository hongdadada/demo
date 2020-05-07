package thread.method.sleep;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:14
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread.run();
        System.out.println("end   ="+System.currentTimeMillis());
    }
}