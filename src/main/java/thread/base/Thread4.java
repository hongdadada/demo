package thread.base;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:49
 */
public class Thread4 extends Thread{
    private int count=5;

    public Thread4(String name) {
        this.setName(name);
    }

    @Override
    public void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("由 "+Thread.currentThread().getName()+"计算.count="+count);
        }
    }
}