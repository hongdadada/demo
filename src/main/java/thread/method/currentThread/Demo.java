package thread.method.currentThread;

/**
 * Thread.currentThread()可返回代码段正在被哪个线程调用的信息。
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }


}