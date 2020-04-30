package thread.base;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:17
 */
public class RunMyThread1 {
    //线程的随机性
    public static class MyThread1 extends Thread {
        @Override
        public void run(){
            try {
                for(int i=0;i<10;i++){
                    int time=(int)(Math.random()*1000);
                    Thread.sleep(time);
                    System.out.println("run="+Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        try {
            MyThread1 thread1=new MyThread1();
            thread1.setName("myThread");
            thread1.start();
            for(int i=0;i<10;i++){
                int time=(int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}