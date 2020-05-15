package helloWorld.design.Strategy;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 11:02
 */
public class ThreeStrategy implements Strategy {
    @Override
    public void doSomeThing(){
        System.out.println("do three !");
    }
}