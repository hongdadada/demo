package thread.communication.product_consumer;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-07 15:09
 */
public class P_Thread extends Thread {
    private P p;

    public P_Thread(P p) {
        this.p = p;
    }
    @Override
    public void run(){
        for(;;){
            p.pushService();
        }
    }
}