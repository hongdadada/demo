package thread.base;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:10
 */
public class RunMyThread {
    //线程的基本用法
    public static class MyThread extends Thread{
        @Override
        public void run(){
            super.run();
            System.out.println("MyThread");
        }
    }
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        System.out.println("运行结束！");
    }

}