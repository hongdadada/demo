package helloWorld.design.Bridge;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:51
 */
public abstract class Phone {
    public Memory memory;

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    //购买手机
    public abstract void buy();
}