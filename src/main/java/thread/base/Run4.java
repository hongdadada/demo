package thread.base;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 11:52
 */
public class Run4 {
    //线程变量不共享
    public static void main(String[] args) {
        Thread4 threadA=new Thread4("A");
        Thread4 threadB=new Thread4("B");
        Thread4 threadC=new Thread4("C");
        Thread4 threadD=new Thread4("D");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}