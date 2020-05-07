package thread.stopThrowLock;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 17:24
 */
public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run(){
        object.printString("b","bb");
    }
}