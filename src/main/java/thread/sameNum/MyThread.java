package thread.sameNum;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:07
 */
public class MyThread extends Thread {
    private int i=5;
    @Override
    synchronized public void run(){
        System.out.println("i="+(i--)+" threadName="+Thread.currentThread().getName());
    }
}