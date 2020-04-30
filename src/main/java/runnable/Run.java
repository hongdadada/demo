package runnable;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:45
 */
public class Run {
    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}