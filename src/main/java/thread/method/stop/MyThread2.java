package thread.method.stop;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 17:13
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch()方法！");
            e.printStackTrace();
        }
    }
}