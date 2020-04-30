package thread.method.currentThread;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:21
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        //myThread.start();
        myThread.run();
    }
}