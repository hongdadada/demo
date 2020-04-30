package thread.threadsafe;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:01
 */
public class Run {
    public static void main(String[] args) {
        //ALogin与BLogin的usernameRef和passwordRef都会互相影响，非线程安全
        //方法上加了synchronized之后，则线程安全，进行加锁排队处理【临界区】、【互斥区】
        ALogin a=new ALogin();
        a.start();
        BLogin b=new BLogin();
        b.start();
    }
}