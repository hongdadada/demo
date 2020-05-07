package thread.method.interrupt;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:36
 */
public class Run2 {
    //private native boolean isInterrupted(boolean ClearInterrupted);
    //interrupted方法会清空状态，第二次调用就是未终止
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1? ="+Thread.interrupted());
        System.out.println("是否停止2? ="+Thread.interrupted());
        System.out.println("end!");
    }
}