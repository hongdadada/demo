package thread.method.interrupt;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:27
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        super.run();
        for(int i=0;i<500000;i++){
            System.out.println("i="+(i+1));
        }
    }
}