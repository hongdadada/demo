package helloWorld.design.Bridge;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:57
 */
public class XiaoMi extends Phone {
    @Override
    public void buy() {
        memory.addMemory();
        System.out.println("买小米");
    }
}