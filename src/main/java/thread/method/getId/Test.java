package thread.method.getId;

/**
 * @author zhangwei
 * @Description:
 * getId 方法是取得线程的唯一标识
 * @date 2020-04-30 15:21
 */
public class Test {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName()+" "+thread.getId());
    }
}