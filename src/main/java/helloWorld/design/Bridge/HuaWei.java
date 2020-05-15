package helloWorld.design.Bridge;

import helloWorld.design.Factory.SimpleFactory.PhoneFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:57
 */
public class HuaWei extends Phone {
    @Override
    public void buy() {
        memory.addMemory();
        System.out.println("买华为");
    }
}