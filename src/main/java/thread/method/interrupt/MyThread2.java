package thread.method.interrupt;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 15:53
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        super.run();
        try {
            for(int i=0;i< 500000;i++){
                if(this.interrupted()){
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("for下面");
        } catch (Exception e) {
            System.out.println("进MyThread.java类run方法中的catch了！ ");
            e.printStackTrace();
        }
    }
}