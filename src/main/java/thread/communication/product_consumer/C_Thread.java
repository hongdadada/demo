package thread.communication.product_consumer;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-07 15:11
 */
public class C_Thread extends Thread {
    private C c;

    public C_Thread(C c) {
        this.c = c;
    }

    @Override
    public void run(){
        for(;;){
            c.popService();
        }
    }
}