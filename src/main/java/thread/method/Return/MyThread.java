package thread.method.Return;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 17:28
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            if(this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}