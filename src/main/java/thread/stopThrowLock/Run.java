package thread.stopThrowLock;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 17:26
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername()+" "+object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}