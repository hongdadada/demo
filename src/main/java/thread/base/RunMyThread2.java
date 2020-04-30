package thread.base;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:28
 */
public class RunMyThread2 {
    //线程的顺序
    public static class MyThread3 extends Thread{
        private int i;
        public MyThread3(int i) {
            this.i = i;
        }
        @Override
        public void run(){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        MyThread3 tl1=new MyThread3(1);
        MyThread3 tl2=new MyThread3(2);
        MyThread3 tl3=new MyThread3(3);
        MyThread3 tl4=new MyThread3(4);
        MyThread3 tl5=new MyThread3(5);
        MyThread3 tl6=new MyThread3(6);
        tl1.start();
        tl2.start();
        tl3.start();
        tl4.start();
        tl5.start();
        tl6.start();
    }
}