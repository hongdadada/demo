package thread.method.isAlive;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:29
 */
public class Run {
    /**
     * isAlive()的作用是测试线程是否处于活动状态(线程已经启动且尚未终止)，线程处于正在运行或者准备开始运行的状态，线程是【存活】的
     */
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread=new MyThread();
        System.out.println("begin =="+myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end =="+myThread.isAlive());
    }
}