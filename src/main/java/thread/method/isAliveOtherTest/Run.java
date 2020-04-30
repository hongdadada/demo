package thread.method.isAliveOtherTest;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:41
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t1=new Thread(c);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }
}