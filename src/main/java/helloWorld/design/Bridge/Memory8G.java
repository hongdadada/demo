package helloWorld.design.Bridge;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:56
 */
public class Memory8G implements Memory {

    @Override
    public void addMemory() {
        System.out.println("8G 内存");
    }
}