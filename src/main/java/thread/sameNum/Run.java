package thread.sameNum;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:09
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        Thread t1=new Thread(thread);
        Thread t2=new Thread(thread);
        Thread t3=new Thread(thread);
        Thread t4=new Thread(thread);
        Thread t5=new Thread(thread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}