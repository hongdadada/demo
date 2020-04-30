package thread.method.currentThreadExt;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 14:26
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t=new Thread(c);
        t.setName("A");
        t.start();
    }
}