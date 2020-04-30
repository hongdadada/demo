package thread.method.currentThread;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:19
 */
public class MyThread extends Thread{
    public MyThread() {
        System.out.println("构造方法的打印： "+Thread.currentThread().getName());
    }
    @Override
    public void run(){
        System.out.println("run方法的打印： "+Thread.currentThread().getName());
    }
}