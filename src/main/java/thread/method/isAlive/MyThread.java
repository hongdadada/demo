package thread.method.isAlive;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:16
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("run="+this.isAlive());
    }
}